package me.belyaikin.game.scene.window;

import me.belyaikin.game.entity.Drawable;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public final class WindowPanel extends JPanel {
    private final List<Drawable> drawables = new ArrayList<>();

    public void addDrawable(Drawable drawable) {
        this.drawables.add(drawable);
    }

    public void removeDrawable(Drawable drawable) {
        this.drawables.remove(drawable);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        drawables.forEach(drawable -> drawable.draw(g, this));
    }
}
