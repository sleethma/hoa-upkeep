package com.hoaupkeep.innosol.controllers;

import com.hoaupkeep.innosol.models.Owner;
import com.hoaupkeep.innosol.services.OwnerService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.HashSet;
import java.util.Set;

import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.mockito.Mockito.verifyZeroInteractions;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

@RunWith(SpringRunner.class)
public class OwnersControllerTest {

    //Mocks
    @Mock
    OwnerService ownerService;

    @InjectMocks
    OwnersController ownersController;

    Set<Owner> ownerSet;
    Owner  owner = new Owner();

    MockMvc mockMvc;


    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);


        owner.setId(3L);
        owner.setLastName("Smith");
        ownerSet = new HashSet<>();
        ownerSet.add(owner);

        mockMvc = MockMvcBuilders
                .standaloneSetup(ownersController)
                .build();
    }

    @Test
    public void ownersList() throws Exception {
        when(ownerService.findAll()).thenReturn(ownerSet);
        int sizeTest = ownerSet.size();

        mockMvc.perform(get("/owners"))
                .andExpect(status().isOk())
        .andExpect(view().name("owners/index"))
        .andExpect(model().attribute("owners", hasSize(0)));
    }

    @Test
    public void ownersListByIndexUrl() throws Exception {
        when(ownerService.findAll()).thenReturn(ownerSet);

        mockMvc.perform(get("/owners/index"))
                .andExpect(status().isOk())
        .andExpect(view().name("owners/index"))
        .andExpect(model().attribute("owners", hasSize(0)));
    }

    @Test
    public void ownersTempLinkFix() throws Exception {
        mockMvc.perform(get("/owners/find"))
                .andExpect(status().isOk())
        .andExpect(view().name("error-page"));

        verifyZeroInteractions(ownerService);
    }
}