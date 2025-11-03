package me.belyaikin.game.ui.window;

import javax.swing.*;

public class TickableWindow extends Window {
    private final Timer timer;

    protected TickableWindow() {
        timer = new Timer(1000 / 60, e -> tick());
    }

    public void tick() {
        this.repaint();
        System.out.println("test");
    }

    public void stop() {
        timer.stop();
    }
}
