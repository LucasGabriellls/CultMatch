package com.edu.ifal.cultmatch.dto;

import com.edu.ifal.cultmatch.enums.FundingSphere;

import java.math.BigDecimal;
import java.time.LocalDate;

public class PublicNoticeRequestDTO {

    private String title;
    private FundingSphere fundingSphere;
    private String state;
    private String city;
    private String artisticArea;
    private LocalDate registrationDeadline;
    private BigDecimal financialCeiling;
    private String officialLink;

    public PublicNoticeRequestDTO() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public FundingSphere getFundingSphere() {
        return fundingSphere;
    }

    public void setFundingSphere(FundingSphere fundingSphere) {
        this.fundingSphere = fundingSphere;
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

    public String getArtisticArea() {
        return artisticArea;
    }

    public void setArtisticArea(String artisticArea) {
        this.artisticArea = artisticArea;
    }

    public LocalDate getRegistrationDeadline() {
        return registrationDeadline;
    }

    public void setRegistrationDeadline(LocalDate registrationDeadline) {
        this.registrationDeadline = registrationDeadline;
    }

    public BigDecimal getFinancialCeiling() {
        return financialCeiling;
    }

    public void setFinancialCeiling(BigDecimal financialCeiling) {
        this.financialCeiling = financialCeiling;
    }

    public String getOfficialLink() {
        return officialLink;
    }

    public void setOfficialLink(String officialLink) {
        this.officialLink = officialLink;
    }
}
