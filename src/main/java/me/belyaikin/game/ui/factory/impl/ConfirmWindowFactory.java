package me.belyaikin.game.ui.factory.impl;

import me.belyaikin.game.GameManager;
import me.belyaikin.game.ui.button.WindowChangerGameButton;
import me.belyaikin.game.ui.button.impl.ConfirmNameButton;
import me.belyaikin.game.ui.button.impl.ProceedButton;
import me.belyaikin.game.ui.window.GameWindow;
import me.belyaikin.game.ui.factory.GameWindowFactory;

import javax.swing.*;
import java.awt.*;

public final class ConfirmWindowFactory implements GameWindowFactory {
    @Override
    public GameWindow create() {
        JLabel areYouReadyText = new JLabel("YOU ARE GOING TO PLAY THE GAME THAT IS JUST WILL WASTE YOUR TIME. ARE YOU READY?");
        areYouReadyText.setForeground(Color.WHITE);

        WindowChangerGameButton confirmButton = new ProceedButton("YES.", GameManager.getInstance().getWindowManager(), new BattleWindowFactory());
        confirmButton.setBackground(Color.BLACK);
        confirmButton.setForeground(Color.WHITE);

        return new GameWindow.Builder()
                .layout(new FlowLayout())

                .background(Color.BLACK)

                .component(areYouReadyText)
                .component(confirmButton)

                .pack()
                .build();
    }
}
