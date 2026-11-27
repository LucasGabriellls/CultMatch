package com.edu.ifal.cultmatch.entity;

public interface EligibilityCriteria {

    boolean evaluate(Proponent proponent);

    String getDescription();
}
