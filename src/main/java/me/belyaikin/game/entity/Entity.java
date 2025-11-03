package me.belyaikin.game.entity;

import me.belyaikin.game.ui.sprite.Sprite;

public abstract class Entity {
    protected Sprite sprite;

    public Entity(Sprite sprite) {
        this.sprite = sprite;
    }

    public Sprite getSprite() {
        return sprite;
    }

    public void setSprite(Sprite sprite) {
        this.sprite = sprite;
    }
}
