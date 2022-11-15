package com.company;

public class Gamechar {
    int id;
    String color;

    public Gamechar(int id,String color){
        this.id=id;
        this.color=color;
    }

    public String getColor() {
        return color;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Gamechar{" +
                "id=" + id +
                ", color='" + color + '\'' +
                '}';
    }
}
