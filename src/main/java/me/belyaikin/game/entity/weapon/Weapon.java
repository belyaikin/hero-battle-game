package me.belyaikin.game.entity.weapon;

import me.belyaikin.game.entity.weapon.bullet.Bullet;

public abstract class Weapon {
    private final Bullet bullet;

    public Weapon(Bullet bullet) {
        this.bullet = bullet;
    }

    public Bullet getBullet() {
        return bullet;
    }
}
