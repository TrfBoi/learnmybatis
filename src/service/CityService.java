package service;

import domain.City;

import java.util.List;

/**
 * @author Lenovo
 */
public interface CityService {
    List<City> selectAll();

    City dynamicSelect(City city);

    List<City> foreachSelect(int[] ids);
}
