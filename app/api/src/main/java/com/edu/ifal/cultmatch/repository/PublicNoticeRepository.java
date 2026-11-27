package com.edu.ifal.cultmatch.repository;

import com.edu.ifal.cultmatch.entity.PublicNotice;
import com.edu.ifal.cultmatch.enums.FundingSphere;
import com.edu.ifal.cultmatch.enums.PublicNoticeStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PublicNoticeRepository extends JpaRepository<PublicNotice, Long> {

    @Query("SELECT notice FROM PublicNotice notice "
            + "WHERE (:fundingSphere IS NULL OR notice.fundingSphere = :fundingSphere) "
            + "AND (:city IS NULL OR notice.city = :city) "
            + "AND (:artisticArea IS NULL OR notice.artisticArea = :artisticArea) "
            + "AND (:status IS NULL OR notice.status = :status)")
    List<PublicNotice> findByFilters(
            @Param("fundingSphere") FundingSphere fundingSphere,
            @Param("city") String city,
            @Param("artisticArea") String artisticArea,
            @Param("status") PublicNoticeStatus status);
}
