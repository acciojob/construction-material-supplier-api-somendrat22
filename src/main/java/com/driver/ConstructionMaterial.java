package com.driver;

public class ConstructionMaterial {
    private int id;
    private String name;
    private double pricePerUnit;

    public ConstructionMaterial() {}

    public ConstructionMaterial(String name, double pricePerUnit) {
        this.name = name;
        this.pricePerUnit = pricePerUnit;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }

    public void setPricePerUnit(double pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
    }
}