package me.belyaikin.game.scene;

import javax.swing.*;
import java.awt.*;

public final class ScenePanel extends JPanel {
    private final Scene scene;

    public ScenePanel(Scene scene) {
        this.scene = scene;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        this.scene.getEntities().forEach(entity -> g.drawImage(
                entity.getSprite().getImage(),
                entity.getX(),
                entity.getY(),
                this
        ));
    }
}
