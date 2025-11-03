package me.belyaikin.game.entity;

import me.belyaikin.game.ui.sprite.Sprite;
import me.belyaikin.game.weapon.AttackResult;
import me.belyaikin.game.weapon.Weapon;

public abstract class LivingEntity extends Entity {
    private int health;

    public LivingEntity(int health, Sprite sprite) {
        super(sprite);
    }

    public abstract AttackResult onAttacked(Weapon weapon);

    public abstract void die();
}
