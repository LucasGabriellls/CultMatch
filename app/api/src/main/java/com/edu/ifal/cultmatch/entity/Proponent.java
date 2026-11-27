package com.edu.ifal.cultmatch.entity;

public abstract class Proponent {

    private String legalNature;
    private int yearsOfExperience;
    private String state;
    private String city;
    private String mainCnae;

    public String getLegalNature() {
        return legalNature;
    }

    public void setLegalNature(String legalNature) {
        this.legalNature = legalNature;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getMainCnae() {
        return mainCnae;
    }

    public void setMainCnae(String mainCnae) {
        this.mainCnae = mainCnae;
    }
}
