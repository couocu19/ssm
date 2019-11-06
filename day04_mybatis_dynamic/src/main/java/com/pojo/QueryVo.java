package com.pojo;

import java.util.List;

public class QueryVo {

    private Country country;
    private List<Integer> ids;

    public Country getCountry() {
        return country;
    }


    public void setCountry(Country country) {
        this.country = country;
    }

    public List<Integer> getIds() {
        return ids;
    }

    public void setIds(List<Integer> ids) {
        this.ids = ids;
    }
}
