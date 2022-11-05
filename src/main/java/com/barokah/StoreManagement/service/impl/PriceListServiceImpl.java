package com.barokah.StoreManagement.service.impl;

import com.barokah.StoreManagement.entity.PriceListEntity;
import com.barokah.StoreManagement.repository.PriceListRepository;
import com.barokah.StoreManagement.service.PriceListService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PriceListServiceImpl implements PriceListService {

    private final PriceListRepository priceListRepository;

    public PriceListServiceImpl(PriceListRepository priceListRepository) {
        this.priceListRepository = priceListRepository;
    }

    @Override
    public List<PriceListEntity> getAllPricelist() {
        return priceListRepository.findAll();
    }

    @Override
    public Optional<PriceListEntity> findById(Long id) {
        return priceListRepository.findById(id);
    }

    @Override
    public PriceListEntity savePriceList(PriceListEntity priceListEntity) {
        return priceListRepository.save(priceListEntity);
    }

    @Override
    public PriceListEntity updatePriceList(PriceListEntity priceListEntity) {
        return priceListRepository.save(priceListEntity);
    }

    @Override
    public void deletePriceList(Long id) {
        priceListRepository.deleteById(id);
    }
}
