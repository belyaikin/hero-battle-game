package me.belyaikin.game.entity.enemy.impl;

import me.belyaikin.game.entity.enemy.BossEntity;
import me.belyaikin.game.entity.weapon.AttackResult;
import me.belyaikin.game.entity.weapon.Weapon;
import me.belyaikin.game.ui.sprite.Sprite;

public final class GiantCubeEntity extends BossEntity {
    public GiantCubeEntity() {
        super("boss", new Sprite("test_boss.png", 100, 100), 1000);
    }

    @Override
    public void onSpawn() {

    }

    @Override
    public void onTick() {

    }
}
