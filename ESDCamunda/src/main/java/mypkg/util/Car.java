package mypkg.util;

public class Car {

    public String brand;
    public String model;
    public int price;

    public Car() {

    }

    public Car (String brand, String model, int price) {
        this.price = price;
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
