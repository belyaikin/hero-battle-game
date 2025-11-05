package me.belyaikin.game.entity.enemy;

import me.belyaikin.game.entity.LivingEntity;
import me.belyaikin.game.ui.sprite.Sprite;

public abstract class BossEntity extends LivingEntity {
    public BossEntity(String name, Sprite sprite, int health) {
        super(name, sprite, health);
    }

    @Override
    public void die() {
        System.out.println("Im dead!");
    }
}
