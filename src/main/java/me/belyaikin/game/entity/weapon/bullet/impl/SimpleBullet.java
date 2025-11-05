package me.belyaikin.game.entity.weapon.bullet.impl;

import me.belyaikin.game.entity.weapon.bullet.Bullet;
import me.belyaikin.game.ui.sprite.Sprite;

import javax.swing.*;

public class SimpleBullet extends Bullet {
    public SimpleBullet() {
        super(new Sprite("bullet.png", 3, 6), 5, 20);
    }

    @Override
    public void onSpawn() {
        super.onSpawn();
    }

    @Override
    public void onTick() {
        super.onTick();
    }
}
