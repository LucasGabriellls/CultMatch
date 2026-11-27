package com.edu.ifal.cultmatch.entity;

public class ExperienceTimeCriteria implements EligibilityCriteria {

    private final int minimumYears;

    public ExperienceTimeCriteria(int minimumYears) {
        this.minimumYears = minimumYears;
    }

    @Override
    public boolean evaluate(Proponent proponent) {
        return proponent != null && proponent.getYearsOfExperience() >= minimumYears;
    }

    @Override
    public String getDescription() {
        return "Minimum experience time: " + minimumYears + " years";
    }
}
