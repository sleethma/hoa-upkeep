package com.hoaupkeep.innosol.formatters;

import com.hoaupkeep.innosol.models.PlanType;
import com.hoaupkeep.innosol.services.PlanTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.util.Collection;
import java.util.Locale;

@Component
public class PlanTypeFormatter implements Formatter<PlanType> {

    private final PlanTypeService planTypeService;

    public PlanTypeFormatter(PlanTypeService planTypeService) {
        this.planTypeService = planTypeService;
    }

    @Override
    public String print(PlanType petType, Locale locale) {
        return petType.getName();
    }

    @Override
    public PlanType parse(String text, Locale locale) throws ParseException {
        Collection<PlanType> findPlanTypes = planTypeService.findAll();
        for (PlanType type : findPlanTypes) {
            if (type.getName().equals(text)) {
                return type;
            }
        }
        throw new ParseException("type not found: " + text, 0);
    }

}
