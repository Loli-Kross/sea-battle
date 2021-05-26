package com.example.myapplication;

public class SingleDeckShip extends  Ship{
    @Override
    public int getMaxHealth() {
        return 1;
    }

    @Override
    public int getResId() {
        return 0;
    }

}
