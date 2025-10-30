package me.belyaikin.game.ui.sprite;

import me.belyaikin.game.entity.Entity;

public final class EntitySprite extends Sprite {
    private final Entity entity;

    public EntitySprite(Entity entity, String filename) {
        super(filename);
        this.entity = entity;
    }
}
