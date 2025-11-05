package me.belyaikin.game.entity;

import me.belyaikin.game.scene.Scene;
import me.belyaikin.game.ui.sprite.Sprite;

import javax.swing.*;
import java.awt.*;

public abstract class Entity implements TickListener, Drawable {
    private int x = 0;
    private int y = 0;

    private Sprite sprite;
    private Scene scene;

    public Entity(Sprite sprite) {
        this.sprite = sprite;
    }

    public abstract void onSpawn();

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
}
