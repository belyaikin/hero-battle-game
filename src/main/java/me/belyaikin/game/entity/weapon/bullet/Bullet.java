package me.belyaikin.game.entity.weapon.bullet;

import me.belyaikin.game.entity.Entity;
import me.belyaikin.game.ui.sprite.Sprite;

public abstract class Bullet extends Entity {
    private int damage;
    private int speed;

    public Bullet(Sprite sprite, int damage, int speed) {
        super(sprite);
        this.damage = damage;
        this.speed = speed;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public void onSpawn() {
        System.out.println(speed);
    }

    @Override
    public void onTick() {
        y -= speed;
    }
}
