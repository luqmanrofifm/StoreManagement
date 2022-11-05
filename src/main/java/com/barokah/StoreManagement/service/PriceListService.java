package com.barokah.StoreManagement.service;

import com.barokah.StoreManagement.entity.PriceListEntity;

import java.util.List;
import java.util.Optional;

public interface PriceListService {
    List<PriceListEntity> getAllPricelist();
    Optional<PriceListEntity> findById(Long id);
    PriceListEntity savePriceList(PriceListEntity priceListEntity);
    PriceListEntity updatePriceList(PriceListEntity priceListEntity);
    void deletePriceList(Long id);
}
