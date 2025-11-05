package me.belyaikin.game.entity.enemy.impl;

import me.belyaikin.game.entity.enemy.BossEntity;
import me.belyaikin.game.entity.weapon.AttackResult;
import me.belyaikin.game.entity.weapon.Weapon;
import me.belyaikin.game.ui.sprite.Sprite;

public class GiantCubeEntity extends BossEntity {
    public GiantCubeEntity() {
        super(1000, new Sprite("test_boss.png", 100, 100));
    }

    @Override
    public AttackResult onAttacked(Weapon weapon) {
        return null;
    }

    @Override
    public void onSpawn() {

    }

    @Override
    public void onTick() {

    }
}
