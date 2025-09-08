package com.example.game;

public class SpeedBoost extends CharacterDecorator {
    private final int bonus;

    public SpeedBoost(Character wrappee, int bonus) {
        super(wrappee);
        this.bonus = bonus;
    }

    @Override
    public int getSpeed() {
        return wrappee.getSpeed() + bonus;
    }

    @Override
    public void move() {
        System.out.println("Moving at boosted speed " + getSpeed() + " with sprite " + getSprite());
    }
}
