package com.hoaupkeep.innosol.controllers;

import com.hoaupkeep.innosol.models.Home;
import com.hoaupkeep.innosol.models.Owner;
import com.hoaupkeep.innosol.models.PlanType;
import com.hoaupkeep.innosol.services.HomesService;
import com.hoaupkeep.innosol.services.OwnerService;
import com.hoaupkeep.innosol.services.PlanTypeService;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

public class HomeControllerTest {

    @Mock
    HomesService homesService;

    @Mock
    OwnerService ownerService;

    @Mock
    PlanTypeService planTypeService;

    MockMvc mockMvc;
    Owner owner;
    Set<PlanType> planTypes;

    @InjectMocks
    HomeController homeController;

    private static final String VIEWS_HOMES_CREATE_OR_UPDATE_FORM = "homes/create-or-update-home-form";

    @Before
    public void setUp(){
        MockitoAnnotations.initMocks(this);
        mockMvc = MockMvcBuilders.standaloneSetup(homeController).build();

        planTypes = new HashSet<>();

         owner = new Owner();
         owner.setId(1L);
         PlanType planType1 = new PlanType();
         planType1.setName("Three Bedroom");
        PlanType planType2 = new PlanType();
        planType2.setName("Four Bedroom");
         planTypes.add(planType1);
         planTypes.add(planType2);
    }


    @Test
    public void initCreationFormTest() throws Exception {
        when(ownerService.findById(anyLong())).thenReturn(owner);
        when(planTypeService.findAll()).thenReturn(planTypes);

        mockMvc.perform(get("/owners/1/homes/new"))
                .andExpect(model().attributeExists("home"))
        .andExpect(view().name(VIEWS_HOMES_CREATE_OR_UPDATE_FORM))
        .andExpect(status().isOk());

        verify(ownerService, times(1)).findById(anyLong());
        verify(planTypeService, times(1)).findAll();
    }

    @Test
    public void processCreationFormTest() throws Exception {
        Home home = new Home();
        home.setId(1L);

        when(ownerService.findById(anyLong())).thenReturn(owner);
        when(planTypeService.findAll()).thenReturn(planTypes);

        mockMvc.perform(post("/owners/1/homes/new"))
                .andExpect(status().is3xxRedirection())
        .andExpect(view().name("redirect:/owners/1"));

        verify(homesService).save(any());
    }

    @Test
    public void initUpdateFormTest() throws Exception {
        Home home = new Home();
        home.setId(1L);

        when(ownerService.findById(anyLong())).thenReturn(owner);
        when(planTypeService.findAll()).thenReturn(planTypes);
        when(homesService.findById(anyLong())).thenReturn(home);

        mockMvc.perform(get("/owners/1/homes/1/edit"))
                .andExpect(model().attributeExists("home"))
        .andExpect(view().name(VIEWS_HOMES_CREATE_OR_UPDATE_FORM));

        verify(ownerService, times(1)).findById(anyLong());
        verify(planTypeService, times(1)).findAll();
        verify(homesService, times(1)).findById(anyLong());
    }

    @Test
    public void processUpdateFormTest() throws Exception {
        Home home = new Home();
        home.setId(1L);

        when(ownerService.findById(anyLong())).thenReturn(owner);
        when(planTypeService.findAll()).thenReturn(planTypes);
        when(homesService.findById(anyLong())).thenReturn(home);

        mockMvc.perform(post("/owners/1/homes/1/edit"))
                .andExpect(status().is3xxRedirection())
        .andExpect(view().name("redirect:/owners/1"));

        verify(ownerService, times(1)).findById(anyLong());
        verify(planTypeService, times(1)).findAll();
        verify(homesService, times(1)).save(any());
    }
}