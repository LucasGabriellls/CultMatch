package com.edu.ifal.cultmatch.controller;

import com.edu.ifal.cultmatch.dto.PublicNoticeRequestDTO;
import com.edu.ifal.cultmatch.dto.PublicNoticeResponseDTO;
import com.edu.ifal.cultmatch.enums.FundingSphere;
import com.edu.ifal.cultmatch.service.PublicNoticeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/public-notices")
public class PublicNoticeController {

    private final PublicNoticeService publicNoticeService;

    public PublicNoticeController(PublicNoticeService publicNoticeService) {
        this.publicNoticeService = publicNoticeService;
    }

    @PostMapping
    public ResponseEntity<PublicNoticeResponseDTO> create(
            @RequestBody PublicNoticeRequestDTO dto) {
        PublicNoticeResponseDTO response = publicNoticeService.create(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @GetMapping
    public ResponseEntity<List<PublicNoticeResponseDTO>> findByFilters(
            @RequestParam(required = false) FundingSphere fundingSphere,
            @RequestParam(required = false) String city,
            @RequestParam(required = false) String artisticArea) {
        List<PublicNoticeResponseDTO> responses = publicNoticeService.findByFilters(
                fundingSphere,
                city,
                artisticArea);
        return ResponseEntity.ok(responses);
    }

    @PatchMapping("/{id}/close")
    public ResponseEntity<Void> close(@PathVariable Long id) {
        publicNoticeService.closePublicNotice(id);
        return ResponseEntity.noContent().build();
    }
}
