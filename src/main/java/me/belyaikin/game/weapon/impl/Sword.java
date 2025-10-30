package me.belyaikin.game.weapon.impl;

import me.belyaikin.game.weapon.Weapon;
import me.belyaikin.game.weapon.WeaponType;

public final class Sword extends Weapon {
    public Sword() {
        super(
                "Sword",
                "A sword. Nothing to describe.",
                25,
                WeaponType.CLOSE_RANGE
        );
    }
}
