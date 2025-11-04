package me.belyaikin.game.entity;

import me.belyaikin.game.ui.sprite.Sprite;

import javax.swing.*;
import java.awt.*;

public abstract class Entity implements Tickable, Drawable {
    protected int x = 0;
    protected int y = 0;

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

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public void draw(Graphics graphics, JPanel jPanel) {
        graphics.drawImage(sprite.getImage(), x, y, jPanel);
    }
}
