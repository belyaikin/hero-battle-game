package me.belyaikin.game.ui;

import javax.swing.*;

public final class GameWindow {
    private final JFrame jFrame;

    public GameWindow() {
        this.jFrame = new JFrame();
        initializeWindow();
    }

    private void initializeWindow() {
        this.jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public JFrame getjFrame() {
        return this.jFrame;
    }
}
