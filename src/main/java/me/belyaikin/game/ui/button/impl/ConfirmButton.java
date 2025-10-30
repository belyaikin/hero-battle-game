package me.belyaikin.game.ui.button.impl;

import me.belyaikin.game.GameManager;
import me.belyaikin.game.ui.WindowManager;
import me.belyaikin.game.ui.button.WindowChangerGameButton;
import me.belyaikin.game.ui.factory.GameWindowFactory;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class ConfirmButton extends WindowChangerGameButton {
    private final JTextField playerNameField;

    public ConfirmButton(WindowManager windowManager, GameWindowFactory newWindow, JTextField playerNameField) {
        super("CONFIRM..?", windowManager, newWindow);
        this.playerNameField = playerNameField;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        super.actionPerformed(e);

        if (e.getSource() == this) {
            GameManager.getInstance().createPlayer(playerNameField.getText());
            System.out.println("Created player with name " + GameManager.getInstance().getPlayer().getName());
        }
    }
}
