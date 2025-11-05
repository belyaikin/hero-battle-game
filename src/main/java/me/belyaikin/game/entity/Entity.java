package me.belyaikin.game.entity;

import me.belyaikin.game.scene.Scene;
import me.belyaikin.game.ui.sprite.Sprite;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Rectangle2D;

public abstract class Entity implements TickListener, Drawable {
    private final String name;

    private int x = 0;
    private int y = 0;

    private Sprite sprite;

    private Scene scene;

    public Entity(String name, Sprite sprite) {
        this.name = name;
        this.sprite = sprite;
    }

    public String getName() {
        return name;
    }

    public abstract void onSpawn();

    public Rectangle2D getBounds() {
        return new Rectangle(x, y, sprite.getXScale(), sprite.getYScale());
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

    public Sprite getSprite() {
        return sprite;
    }

    public void setSprite(Sprite sprite) {
        this.sprite = sprite;
    }

    public Scene getScene() {
        return scene;
    }

    public void setScene(Scene scene) {
        this.scene = scene;
    }

    @Override
    public void draw(Graphics graphics, JPanel jPanel) {
        graphics.drawImage(sprite.getImage(), x, y, jPanel);
    }

    public void despawn() {
        this.scene.despawn(this);
    }
}
