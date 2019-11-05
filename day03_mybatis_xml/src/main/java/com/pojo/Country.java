package com.pojo;

public class Country {

    private int id;
    private String cityName;
    private String cityView;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCityView() {
        return cityView;
    }

    public void setCityView(String cityView) {
        this.cityView = cityView;
    }


    public Country(){

    }

    public Country(int id, String cityName, String cityView) {
        this.id = id;
        this.cityName = cityName;
        this.cityView = cityView;
    }

    public Country(String cityName, String cityView) {
        this.cityName = cityName;
        this.cityView = cityView;
    }
}
