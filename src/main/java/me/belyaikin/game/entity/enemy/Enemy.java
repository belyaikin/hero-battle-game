package me.belyaikin.game.entity.enemy;

import me.belyaikin.game.entity.LivingEntity;

public abstract class Enemy extends LivingEntity {
    public Enemy(String name, String description) {
        super(name, description);
    }

    @Override
    public void die() {
        // TODO: Show win screen
    }
}
