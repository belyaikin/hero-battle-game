package me.belyaikin.game.ui;

import javax.swing.*;

public final class UIComposer {
    private final GameWindow gameWindow;

    private static final String ASSETS_PATH = "src\\main\\resources\\assets\\";

    private JLabel contentPane;

    public UIComposer(GameWindow gameWindow) {
        this.gameWindow = gameWindow;
    }

    public void initialize() {
        ImageIcon background = new ImageIcon(ASSETS_PATH + "screen.png");

        this.contentPane = new JLabel(background);

        this.gameWindow.getjFrame().setContentPane(contentPane);

        createButtons();

        this.gameWindow.getjFrame().setSize(550, 480);
        this.gameWindow.getjFrame().setResizable(false);

        this.gameWindow.getjFrame().setVisible(true);
    }

    private void createButtons() {
        JButton attackButton = new JButton("Attack");
        attackButton.setBounds(10, 360, 80, 80);

        JButton useButton = new JButton("Use");
        useButton.setBounds(10 + 90, 360, 80, 80);

        contentPane.add(attackButton);
        contentPane.add(useButton);
    }
}
