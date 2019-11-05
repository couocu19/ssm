package com.dao;

import com.pojo.Country;

import java.util.List;

public interface CountryDao {

    List<Country> getAll();

    void addCountry(Country c);

    void deleteCountry(int id);

    void updateCountry(int id);

    Country getCountry(int id);
}
