package me.belyaikin.game.entity;

import me.belyaikin.game.weapon.AttackResult;
import me.belyaikin.game.weapon.Weapon;

public abstract class LivingEntity extends Entity {
    private int health;

    public LivingEntity(String name, String description) {
        super(name, description);
    }

    public abstract AttackResult onAttacked(Weapon weapon);

    public abstract void die();
}
