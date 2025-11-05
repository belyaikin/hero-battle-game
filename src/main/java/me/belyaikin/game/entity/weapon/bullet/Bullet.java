package me.belyaikin.game.entity.weapon.bullet;

import me.belyaikin.game.entity.Entity;
import me.belyaikin.game.ui.sprite.Sprite;

import javax.swing.*;

public abstract class Bullet extends Entity {
    private int damage;
    private int speed;

    public Bullet(Sprite sprite, int damage, int speed) {
        super(sprite);
        this.damage = damage;
        this.speed = speed;
    }

    private final Timer selfDestructTimer = new Timer(4000, e -> {
        this.getScene().despawn(this);
    });

    @Override
    public void onSpawn() {
        this.selfDestructTimer.start();
    }

    @Override
    public void onTick() {
        y -= speed;
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
}
