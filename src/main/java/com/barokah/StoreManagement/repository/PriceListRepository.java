package com.barokah.StoreManagement.repository;

import com.barokah.StoreManagement.entity.PriceListEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PriceListRepository extends JpaRepository<PriceListEntity, Long> {
}
