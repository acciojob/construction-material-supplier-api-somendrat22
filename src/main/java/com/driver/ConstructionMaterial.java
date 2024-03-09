package com.driver;

public class ConstructionMaterial {
	private int id;
    private String name;
    private double pricePerUnit;

    public ConstructionMaterial() {}

    public ConstructionMaterial(String name, double pricePerUnit) {
    	// your code goes here
    }

    public int getId() {
    	// your code goes here
        return id;
    }

    public void setId(int id) {
    	// your code goes here
    }

    public String getName() {
    	// your code goes here
        return name;
    }

    public void setName(String name) {
    	// your code goes here
    }

    public double getPricePerUnit() {
    	// your code goes here
        return pricePerUnit;
    }

    public void setPricePerUnit(double pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
    }
}
