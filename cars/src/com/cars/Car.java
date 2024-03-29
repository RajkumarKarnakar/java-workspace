package com.cars;

import java.util.Objects;

public class Car {
    static int count ;
    String name;
    String model;
    double price;
    static {
        count=1;
    }

    public Car(String name, String model, double price) {
        this.name = name;
        this.model = model;
        this.price = price;
    }

    public Car(Car car) {
        this.name = car.name;
        this.model = car.model;
        this.price = car.price;
    }

    public String getMake() {
        return this.name;
    }

    public String getModel() {
        return this.model;
    }

    @Override
    public boolean equals(Object o) {
        Car c =  ((Car) o);
        System.out.format("comparing %s %s with %s %s",this.name,this.model,c.name,c.model);
        System.out.println(count+" for compare---------------------------");
        count++;
        if (this == o) return true;
        if (!(o instanceof Car car)) return false;
        return Objects.equals(name, car.name) && Objects.equals(getModel(), car.getModel());
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, getModel());
    }
}
