package Lvl_II.h09_IO_NIO.Human01;

import java.io.Serializable;

public class Automobile implements Serializable {
    @Override
    public String toString() {
        return "Automobile{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public Automobile(String model, String color) {
        this.model = model;
        this.color = color;
    }

    String model;
    String color;
}
