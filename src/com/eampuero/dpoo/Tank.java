package com.eampuero.dpoo;

public class Tank {
    private int tankCapacity;

    public Tank() {
        this.tankCapacity = 40;
    }

    public Tank(int tankCapacity) {
        this.tankCapacity = tankCapacity;
    }

    public int getTankCapacity() {
        return tankCapacity;
    }
}
