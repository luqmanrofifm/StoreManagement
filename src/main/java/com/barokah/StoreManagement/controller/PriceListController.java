package com.barokah.StoreManagement.controller;

import com.barokah.StoreManagement.entity.PriceListEntity;
import com.barokah.StoreManagement.service.PriceListService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/barokah/pricelist")
public class PriceListController {
    private final PriceListService priceListService;

    public PriceListController(PriceListService priceListService){
        this.priceListService = priceListService;
    }

    @GetMapping
    public List<PriceListEntity> getAllPriceList(){
        return priceListService.getAllPricelist();
    }

    @GetMapping("/{id}")
    public Optional<PriceListEntity> getPriceById(@PathVariable("id") Long id){
        return priceListService.findById(id);
    }

    @PostMapping
    public PriceListEntity savePriceList(@RequestBody PriceListEntity priceListEntity){
        return priceListService.savePriceList(priceListEntity);
    }

    @PutMapping
    public  PriceListEntity updatePriceList(@RequestBody PriceListEntity priceListEntity){
        return  priceListService.updatePriceList(priceListEntity);
    }

    @DeleteMapping("/{id}")
    public void deletePriceList(@PathVariable("id") Long id){
        priceListService.deletePriceList(id);
    }
}
