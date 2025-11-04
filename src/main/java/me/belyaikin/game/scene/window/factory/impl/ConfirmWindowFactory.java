package me.belyaikin.game.scene.window.factory.impl;

import me.belyaikin.game.GameManager;
import me.belyaikin.game.scene.Scene;
import me.belyaikin.game.ui.button.SceneChangerButton;
import me.belyaikin.game.ui.button.impl.ProceedButton;
import me.belyaikin.game.scene.window.Window;
import me.belyaikin.game.scene.window.factory.WindowFactory;

import javax.swing.*;
import java.awt.*;

public final class ConfirmWindowFactory implements WindowFactory {
    @Override
    public Window create() {
        JLabel areYouReadyText = new JLabel("YOU ARE GOING TO PLAY THE GAME THAT IS JUST WILL WASTE YOUR TIME. ARE YOU READY?");
        areYouReadyText.setForeground(Color.WHITE);

        SceneChangerButton confirmButton = new ProceedButton("YES.", new Scene(new BattleWindowFactory().create()));
        confirmButton.setBackground(Color.BLACK);
        confirmButton.setForeground(Color.WHITE);

        return new Window.Builder()
                .layout(new FlowLayout())

                .background(Color.BLACK)

                .component(areYouReadyText)
                .component(confirmButton)

                .pack()
                .build();
    }
}
