package me.belyaikin.game.ui.window;

import javax.swing.*;

public class TickableGameWindow extends GameWindow {
    private final Timer timer;

    public TickableGameWindow(JFrame jFrame) {
        super(jFrame);

        timer = new Timer(1000 / 60, e -> tick());
    }

    public void tick() {
        this.jFrame.repaint();
    }

    public void stop() {
        timer.stop();
    }
}
