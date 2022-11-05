package com.barokah.StoreManagement.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "price_list")
public class PriceListEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "price")
    private Integer price;

    @Column(name = "additional")
    private String additional;

    public PriceListEntity(){

    }

    public PriceListEntity(String name, Integer price, String additional) {
        this.name = name;
        this.price = price;
        this.additional = additional;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getAdditional() {
        return additional;
    }

    public void setAdditional(String additional) {
        this.additional = additional    ;
    }
}
