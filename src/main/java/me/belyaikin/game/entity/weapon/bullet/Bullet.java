package me.belyaikin.game.entity.weapon.bullet;

import me.belyaikin.game.entity.Entity;
import me.belyaikin.game.entity.LivingEntity;
import me.belyaikin.game.scene.Scene;
import me.belyaikin.game.ui.sprite.Sprite;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Rectangle2D;

public abstract class Bullet extends Entity {
    private int damage;
    private int speed;

    public Bullet(Sprite sprite, int damage, int speed) {
        super("player_bullet", sprite);
        this.damage = damage;
        this.speed = speed;
    }

    private final Timer selfDestructTimer = new Timer(4000, e -> despawn());

    @Override
    public void onSpawn() {
        this.selfDestructTimer.start();
    }

    @Override
    public void onTick() {
        setY(getY() - speed);

        Scene scene = this.getScene();

        Rectangle2D bounds = this.getBounds();
        LivingEntity boss = (LivingEntity) scene.getEntitiesByName("boss").getFirst();

        if (bounds.intersects(boss.getBounds())) {
            boss.damage(this.damage);
            //this.despawn();
        }
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
