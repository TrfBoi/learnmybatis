package test;

import domain.City;
import service.CityService;
import service.CityServiceImpl;
import util.CityServiceHandler;

import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        CityService cityService = (CityService) (new CityServiceHandler(new CityServiceImpl()).getProxy());

        // 动态sql练习
        /*City city = new City();
        city.setId(5);
        city.setProvinceid(9);
        City city1 = cityService.dynamicSelect(city);
        System.out.println(city1.toString());*/

        // foreach标签练习
        /*int[] ids = new int[]{1, 2, 3};
        List<City> cities = cityService.foreachSelect(ids);
        for(City city : cities) {
            System.out.println(city);
        }*/

        // sql片段练习
        System.out.println(cityService.selectAll().toString());
    }
}
