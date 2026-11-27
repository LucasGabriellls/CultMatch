package com.edu.ifal.cultmatch.entity;

import java.util.List;

public class CnaeCriteria implements EligibilityCriteria {

    private final List<String> allowedCnaes;

    public CnaeCriteria(List<String> allowedCnaes) {
        this.allowedCnaes = allowedCnaes;
    }

    @Override
    public boolean evaluate(Proponent proponent) {
        if (proponent == null) {
            return false;
        }

        if (allowedCnaes == null || allowedCnaes.isEmpty()) {
            return true;
        }

        return allowedCnaes.contains(proponent.getMainCnae());
    }

    @Override
    public String getDescription() {
        return "Allowed CNAEs: " + allowedCnaes;
    }
}
