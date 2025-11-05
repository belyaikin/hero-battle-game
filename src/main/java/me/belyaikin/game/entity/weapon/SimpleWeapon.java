package me.belyaikin.game.entity.weapon;

import me.belyaikin.game.entity.weapon.bullet.Bullet;
import me.belyaikin.game.entity.weapon.bullet.impl.SimpleBullet;

public final class SimpleWeapon extends Weapon {
    public SimpleWeapon() {
        super(new SimpleBullet());
    }
}
