package me.belyaikin.game.ui.factory.impl;

import me.belyaikin.game.ui.window.GameWindow;
import me.belyaikin.game.ui.factory.GameWindowFactory;

import javax.swing.*;
import java.awt.*;

public final class ConfirmWindowFactory implements GameWindowFactory {
    @Override
    public GameWindow create() {
        JLabel areYouReadyText = new JLabel("YOU ARE GOING TO PLAY THE GAME THAT IS JUST WILL WASTE YOUR TIME. ARE YOU READY?");
        areYouReadyText.setForeground(Color.WHITE);

        JButton submitButton = new JButton("YES.");
        submitButton.setBackground(Color.BLACK);
        submitButton.setForeground(Color.WHITE);

        return new GameWindow.Builder()
                .layout(new FlowLayout())

                .background(Color.BLACK)

                .component(areYouReadyText)
                .component(submitButton)

                .pack()
                .build();
    }
}
