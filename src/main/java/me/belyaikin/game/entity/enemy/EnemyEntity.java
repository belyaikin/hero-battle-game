package me.belyaikin.game.entity.enemy;

import me.belyaikin.game.entity.LivingEntity;
import me.belyaikin.game.ui.sprite.Sprite;

public abstract class EnemyEntity extends LivingEntity {
    public EnemyEntity() {
        super(100, new Sprite("test"));
    }

    @Override
    public void die() {
        // TODO: Show win screen
    }
}
