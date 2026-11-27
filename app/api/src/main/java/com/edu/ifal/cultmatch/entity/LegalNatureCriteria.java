package com.edu.ifal.cultmatch.entity;

import java.util.List;

public class LegalNatureCriteria implements EligibilityCriteria {

    private final List<String> acceptedLegalNatures;

    public LegalNatureCriteria(List<String> acceptedLegalNatures) {
        if (acceptedLegalNatures == null || acceptedLegalNatures.isEmpty()) {
            throw new IllegalArgumentException("Must have at least one accepted legal entity type.");
        }
        this.acceptedLegalNatures = List.copyOf(acceptedLegalNatures);
    }

    @Override
    public boolean evaluate(Proponent proponent) {
        if (proponent == null) {
            return false;
        }
        return acceptedLegalNatures.contains(proponent.getLegalNature());
    }

    @Override
    public String getDescription() {
        return "Accepted legal natures: " + acceptedLegalNatures;
    }
}
