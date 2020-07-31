package com.sch;

import java.util.Arrays;

public class Commoditys {
    private CommoditysType commoditysType;
    private int price;

    public Commoditys(CommoditysType commoditysType, int price) {
        this.commoditysType = commoditysType;
        this.price = price;
    }

    public CommoditysType getCommoditysType() {
        return commoditysType;
    }

    public int getPrice() {
        return price;
    }

    public boolean isPromotionSales(){
        return Arrays.asList(CommoditysType.APPLE, CommoditysType.BEEF, CommoditysType.BANANA, CommoditysType.REFRIGERATOR, CommoditysType.WATERMELON).contains(commoditysType);
    }

}
