package com.example.myapplication;

public abstract class Ship {
    Position[] position;
    boolean isFullDestroy;
    int health;

    ShipOrintation shipOrintation;
    public abstract int getMaxHealth();
    public abstract int getResId();

    enum ShipOrintation {
        HORIZONTAL,
        VERTICAL
    }


}
