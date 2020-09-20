package service;

import domain.City;
import mapper.CityMapper;
import util.SqlSessionUtil;

import java.util.List;

public class CityServiceImpl implements CityService {
    private CityMapper cityMapper = SqlSessionUtil.getSqlSession().getMapper(CityMapper.class);
    @Override
    public List<City> selectAll() {
        List<City> cities = cityMapper.selectAll();
        return cities;
    }

    @Override
    public City dynamicSelect(City city) {
        City city1 = cityMapper.dynamicSelect(city);
        return city1;
    }

    @Override
    public List<City> foreachSelect(int[] ids) {
        return cityMapper.foreachSelect(ids);
    }
}
