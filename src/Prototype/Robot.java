package Prototype;

public class Robot {

    private String name;
    private String brand;
    private String model;

    public Robot(String name, String brand, String model) {

        this.name = name;
        this.brand = brand;
        this.model = model;
    }

    public Robot clone(){
        return new Robot(
                this.name,
                this.brand,
                this.model
        );
    }
}
