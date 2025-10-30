package me.belyaikin.game.weapon.impl;

import me.belyaikin.game.weapon.Weapon;
import me.belyaikin.game.weapon.WeaponType;

public final class Bow extends Weapon {
    public Bow() {
        super(
                "Bow",
                "",
                15,
                WeaponType.LONG_RANGE
        );
    }
}
