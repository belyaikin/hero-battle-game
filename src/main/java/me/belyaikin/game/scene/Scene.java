package me.belyaikin.game.scene;

import me.belyaikin.game.entity.Entity;
import me.belyaikin.game.entity.Tickable;
import me.belyaikin.game.scene.window.Window;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public final class Scene {
    private final Window window;

    private final Timer timer;

    private List<Entity> entities = new ArrayList<>();

    public Scene(Window window) {
        this.window = window;
        this.timer = new Timer(1000 / 60, e -> tick());
    }

    public void activate() {
        this.timer.start();
    }

    public void deactivate() {
        this.timer.stop();

        this.entities.forEach(this::despawn);
    }

    public Window getWindow() {
        return this.window;
    }

    public List<Entity> getEntities() {
        return this.entities;
    }

    public void spawn(Entity entity) {
        this.entities.add(entity);
        this.window.getWindowPanel().addDrawable(entity);
    }

    public void spawn(Entity entity, int x, int y) {
        entity.setX(x);
        entity.setY(y);

        this.entities.add(entity);
        this.window.getWindowPanel().addDrawable(entity);
    }

    public void despawn(Entity entity) {
        this.entities.remove(entity);
    }

    public void tick() {
        if (!entities.isEmpty())
            this.entities.forEach(Entity::tick);

        this.window.repaint();
    }

    public void stop() {
        this.timer.stop();
    }
}
