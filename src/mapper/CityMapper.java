package mapper;

import domain.City;

import java.util.List;

public interface CityMapper {
    List<City> selectAll();

    City dynamicSelect(City city);

    List<City> foreachSelect(int[] ids);
}
