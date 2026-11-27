package com.edu.ifal.cultmatch.dto;

import com.edu.ifal.cultmatch.enums.FundingSphere;
import com.edu.ifal.cultmatch.enums.PublicNoticeStatus;

import java.time.LocalDate;

public class PublicNoticeResponseDTO {

    private Long id;
    private String title;
    private FundingSphere fundingSphere;
    private String city;
    private String artisticArea;
    private LocalDate registrationDeadline;
    private PublicNoticeStatus status;
    private String officialLink;

    public PublicNoticeResponseDTO() {
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

    public PublicNoticeStatus getStatus() {
        return status;
    }

    public void setStatus(PublicNoticeStatus status) {
        this.status = status;
    }

    public String getOfficialLink() {
        return officialLink;
    }

    public void setOfficialLink(String officialLink) {
        this.officialLink = officialLink;
    }
}
