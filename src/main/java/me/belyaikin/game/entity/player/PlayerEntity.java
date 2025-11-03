package me.belyaikin.game.entity.player;

import me.belyaikin.game.entity.LivingEntity;
import me.belyaikin.game.ui.sprite.Sprite;
import me.belyaikin.game.weapon.AttackResult;
import me.belyaikin.game.weapon.Weapon;

public final class PlayerEntity extends LivingEntity {
    private String name;

    public PlayerEntity(String name) {
        super(100, new Sprite("test"));

        this.name = name;
    }

    private Weapon currentWeapon;

    @Override
    public AttackResult onAttacked(Weapon weapon) {
        return new AttackResult("TODO: Handle attacks");
    }

    @Override
    public void die() {
        // TODO: Show game over screen
    }

    public Weapon getCurrentWeapon() {
        return currentWeapon;
    }

    public void setCurrentWeapon(Weapon currentWeapon) {
        this.currentWeapon = currentWeapon;
    }
}
