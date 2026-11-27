package com.edu.ifal.cultmatch.entity;

import com.edu.ifal.cultmatch.enums.PublicNoticeStatus;
import com.edu.ifal.cultmatch.enums.FundingSphere;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
public class PublicNotice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    @Enumerated(EnumType.STRING)
    private FundingSphere fundingSphere;

    private String state;
    private String city;
    private String artisticArea;
    private LocalDate registrationDeadline;
    private BigDecimal financialCeiling;
    private String officialLink;

    @Enumerated(EnumType.STRING)
    private PublicNoticeStatus status;

    public PublicNotice() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public PublicNoticeStatus getStatus() {
        return status;
    }

    public void setStatus(PublicNoticeStatus status) {
        this.status = status;
    }
}
