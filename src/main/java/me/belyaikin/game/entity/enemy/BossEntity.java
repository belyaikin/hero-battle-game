package me.belyaikin.game.entity.enemy;

import me.belyaikin.game.entity.LivingEntity;
import me.belyaikin.game.ui.sprite.Sprite;

public abstract class BossEntity extends LivingEntity {
    public BossEntity() {
        super(1000, new Sprite("test"));
    }

    @Override
    public void die() {
        // TODO: Show win screen
    }
}
