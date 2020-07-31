package com.sch;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

public class CalculatorTest {
    @Test
    public void should_return_integral_100_when_calculate_given_price_100() {
        //given
        Commoditys commoditys = new Commoditys( CommoditysType.OTHER, 100);
        Calculator calculator = new Calculator();
        User user = new User(1, 0);
        List<Commoditys> commoditysList = Arrays.asList(commoditys);

        //when
        int score = calculator.calculate(user, commoditysList);

        //then
        assertEquals(100,score);
    }

    @Test
    public void should_return_100_when_calculate_given_price_Apple_10_and_Watermelon_30_and_Washliquid_20() {
        //given
        Commoditys commodity1 = new Commoditys( CommoditysType.APPLE, 10);
        Commoditys commodity2 = new Commoditys( CommoditysType.WATERMELON, 30);
        Commoditys commodity3 = new Commoditys( CommoditysType.OTHER, 20);
        User user = new User(1, 0);
        Calculator calculator = new Calculator();
        List<Commoditys> goodsList = Arrays.asList(commodity1,commodity2,commodity3);

        //when
        int score = calculator.calculate(user, goodsList);

        //then
        assertEquals(100,score);
    }
}
