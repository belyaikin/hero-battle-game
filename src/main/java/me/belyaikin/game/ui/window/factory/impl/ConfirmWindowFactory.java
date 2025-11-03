package me.belyaikin.game.ui.window.factory.impl;

import me.belyaikin.game.GameManager;
import me.belyaikin.game.ui.button.WindowChangerButton;
import me.belyaikin.game.ui.button.impl.ProceedButton;
import me.belyaikin.game.ui.window.Window;
import me.belyaikin.game.ui.window.factory.WindowFactory;

import javax.swing.*;
import java.awt.*;

public final class ConfirmWindowFactory implements WindowFactory {
    @Override
    public Window create() {
        JLabel areYouReadyText = new JLabel("YOU ARE GOING TO PLAY THE GAME THAT IS JUST WILL WASTE YOUR TIME. ARE YOU READY?");
        areYouReadyText.setForeground(Color.WHITE);

        WindowChangerButton confirmButton = new ProceedButton("YES.", GameManager.getInstance().getWindowManager(), new BattleWindowFactory());
        confirmButton.setBackground(Color.BLACK);
        confirmButton.setForeground(Color.WHITE);

        return new Window.WindowBuilder()
                .layout(new FlowLayout())

                .background(Color.BLACK)

                .component(areYouReadyText)
                .component(confirmButton)

                .pack()
                .build();
    }
}
