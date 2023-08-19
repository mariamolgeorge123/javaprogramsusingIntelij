package Encapsulation;

public class Mobile {
    private String  brand;
    private int capacity;

     private Double screenSize;

    public String getBrand() {
        return brand;
    }

    public int getCapacity() {
        return capacity;
    }

    public Double getScreenSize() {
        return screenSize;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setScreenSize(Double screenSize) {
        this.screenSize = screenSize;
    }
}
