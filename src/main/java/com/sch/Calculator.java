package com.sch;

import java.util.Arrays;
import java.util.List;

public class Calculator {
    private List<CommoditysType> commoditysType = Arrays.asList(CommoditysType.APPLE, CommoditysType.BEEF, CommoditysType.BANANA, CommoditysType.REFRIGERATOR, CommoditysType.WATERMELON);

    public int calculate(User user, List<Commoditys> commoditysList) {
        int score = 0;
        int totalPrice = 0; //总价
        int totalPromotionSalesPrice = 0;
        for (Commoditys commoditys:commoditysList) {
            totalPrice = totalPrice + commoditys.getPrice();
            if (commoditys.isPromotionSales()){
                totalPromotionSalesPrice += commoditys.getPrice();
            }
            if (commoditysType.contains(commoditys.getCommoditysType())){
                score += commoditys.getPrice() * 2;
            }else {
                score += commoditys.getPrice();
            }
        }
        user.setScore(score);
        return user.getScore();
    }
}
