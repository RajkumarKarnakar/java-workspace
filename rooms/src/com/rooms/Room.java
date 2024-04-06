package com.rooms;

import java.util.Comparator;

public class Room implements Comparable<Room> {
    public static Comparator<Room> comparator = Comparator.comparing(Room::getName);
    String name;
    String type;
    int capacity;
    double rate;
    boolean petFriendly;

    public Room(String name, String type, int capacity, double rate) {
        this.name = name;
        this.type = type;
        this.capacity = capacity;
        this.rate = rate;
    }

    public Room(Room room) {
        this.name = room.name;
        this.type = room.type;
        this.capacity = room.capacity;
        this.rate = room.rate;
        this.petFriendly = room.petFriendly;
    }

    @Override
    public String toString() {
        return "Room{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", capacity=" + capacity +
                ", rate=" + rate +
                ", petFriendly=" + petFriendly +
                '}';
    }

    public boolean isPetFriendly() {
        return petFriendly;
    }

    public void setPetFriendly(boolean petFriendly) {
        this.petFriendly = petFriendly;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getRate(String name) {
        return rate;
    }

    @Override
    public int compareTo(Room o) {
        int result =  this.name.compareTo(o.getName());
        return  result !=0 ? result : this.type.compareTo(o.getType()) ;
    }

}
