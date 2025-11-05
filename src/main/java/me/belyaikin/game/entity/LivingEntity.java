package me.belyaikin.game.entity;

import me.belyaikin.game.ui.sprite.Sprite;
import me.belyaikin.game.entity.weapon.AttackResult;
import me.belyaikin.game.entity.weapon.Weapon;

import java.awt.geom.Rectangle2D;

public abstract class LivingEntity extends Entity {
    private int health;

    public LivingEntity(String name, Sprite sprite, int health) {
        super(name, sprite);
        this.health = health;
    }

    public int getHealth() {
        return this.health;
    }

    public void damage(int damage) {
        this.health = this.health - damage;

        if (this.health <= 0) die();
    }

    public abstract void die();
}
