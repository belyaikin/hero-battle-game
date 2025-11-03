package me.belyaikin.game.ui.window;

import me.belyaikin.game.entity.Entity;
import me.belyaikin.game.entity.Tickable;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Scene extends Window {
    private final Timer timer;

    private final List<Entity> entities = new ArrayList<>();

    protected Scene() {
        this.timer = new Timer(1000 / 60, e -> tick());
        this.timer.start();
    }

    public void tick() {
        this.entities.forEach(Tickable::tick);
        this.repaint();
    }

    @Override
    public void paintComponents(Graphics graphicsContext) {
        super.paintComponents(graphicsContext);
        this.entities.forEach(entity -> entity.draw(graphicsContext, this));
    }

    public void stop() {
        this.timer.stop();
    }

    public static class SceneBuilder extends WindowBuilder {
        private List<Entity> entities = new ArrayList<>();

        public SceneBuilder entity(Entity entity) {
            this.entities.add(entity);
            return this;
        }

        @Override
        public Window build() {
            Scene scene = new Scene();

            scene.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

            if (this.width != 0 && this.height != 0)
                scene.setSize(width, height);

            scene.getContentPane().setLayout(this.layout);

            scene.getContentPane().setBackground(backgroundColor);
            scene.getContentPane().setForeground(foregroundColor);

            components.forEach(scene::add);
            scene.entities.addAll(entities);

            if (this.pack) scene.pack();

            scene.setResizable(resizable);

            scene.setVisible(true);

            return scene;
        }
    }
}
