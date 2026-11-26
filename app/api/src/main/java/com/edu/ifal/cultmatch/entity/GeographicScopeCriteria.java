package com.edu.ifal.cultmatch.entity;

public class GeographicScopeCriteria implements EligibilityCriteria {

    private final String state;
    private final String city;

    public GeographicScopeCriteria(String state, String city) {
        this.state = state;
        this.city = city;
    }

    @Override
    public boolean evaluate(Proponent proponent) {
        if (proponent == null) {
            return false;
        }

        boolean stateMatches = (state == null || state.equalsIgnoreCase(proponent.getState()));
        boolean cityMatches = (city == null || city.equalsIgnoreCase(proponent.getCity()));

        return stateMatches && cityMatches;
    }

    @Override
    public String getDescription() {
        return "Geographic scope: " + state + " - " + city;
    }
}
