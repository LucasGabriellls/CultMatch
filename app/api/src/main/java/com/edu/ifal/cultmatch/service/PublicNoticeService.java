package com.edu.ifal.cultmatch.service;

import com.edu.ifal.cultmatch.dto.PublicNoticeRequestDTO;
import com.edu.ifal.cultmatch.dto.PublicNoticeResponseDTO;
import com.edu.ifal.cultmatch.entity.PublicNotice;
import com.edu.ifal.cultmatch.enums.FundingSphere;
import com.edu.ifal.cultmatch.enums.PublicNoticeStatus;
import com.edu.ifal.cultmatch.repository.PublicNoticeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PublicNoticeService {

    private final PublicNoticeRepository publicNoticeRepository;

    public PublicNoticeService(PublicNoticeRepository publicNoticeRepository) {
        this.publicNoticeRepository = publicNoticeRepository;
    }

    public PublicNoticeResponseDTO create(PublicNoticeRequestDTO dto) {
        PublicNotice publicNotice = toEntity(dto);
        publicNotice.setStatus(PublicNoticeStatus.OPEN);

        PublicNotice savedPublicNotice = publicNoticeRepository.save(publicNotice);
        return toResponseDTO(savedPublicNotice);
    }

    public List<PublicNoticeResponseDTO> findByFilters(
            FundingSphere fundingSphere,
            String city,
            String artisticArea) {
        List<PublicNotice> publicNotices = publicNoticeRepository.findByFilters(
                fundingSphere,
                city,
                artisticArea,
                PublicNoticeStatus.OPEN);

        return publicNotices.stream()
                .map(this::toResponseDTO)
                .toList();
    }

    public void closePublicNotice(Long id) {
        PublicNotice publicNotice = publicNoticeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Public notice not found: " + id));

        publicNotice.setStatus(PublicNoticeStatus.CLOSED);
        publicNoticeRepository.save(publicNotice);
    }

    private PublicNotice toEntity(PublicNoticeRequestDTO dto) {
        PublicNotice publicNotice = new PublicNotice();
        publicNotice.setTitle(dto.getTitle());
        publicNotice.setFundingSphere(dto.getFundingSphere());
        publicNotice.setState(dto.getState());
        publicNotice.setCity(dto.getCity());
        publicNotice.setArtisticArea(dto.getArtisticArea());
        publicNotice.setRegistrationDeadline(dto.getRegistrationDeadline());
        publicNotice.setFinancialCeiling(dto.getFinancialCeiling());
        publicNotice.setOfficialLink(dto.getOfficialLink());
        return publicNotice;
    }

    private PublicNoticeResponseDTO toResponseDTO(PublicNotice publicNotice) {
        PublicNoticeResponseDTO dto = new PublicNoticeResponseDTO();
        dto.setId(publicNotice.getId());
        dto.setTitle(publicNotice.getTitle());
        dto.setFundingSphere(publicNotice.getFundingSphere());
        dto.setCity(publicNotice.getCity());
        dto.setArtisticArea(publicNotice.getArtisticArea());
        dto.setRegistrationDeadline(publicNotice.getRegistrationDeadline());
        dto.setStatus(publicNotice.getStatus());
        dto.setOfficialLink(publicNotice.getOfficialLink());
        return dto;
    }
}
