package me.belyaikin.game.ui.button.impl;

import me.belyaikin.game.GameManager;
import me.belyaikin.game.ui.WindowManager;
import me.belyaikin.game.ui.button.WindowChangerGameButton;
import me.belyaikin.game.ui.factory.GameWindowFactory;

import javax.swing.*;

public class ConfirmButton extends WindowChangerGameButton {
    private final JTextField playerNameField;

    public ConfirmButton(WindowManager windowManager, GameWindowFactory newWindow, JTextField playerNameField) {
        super("CONFIRM..?", windowManager, newWindow);
        this.playerNameField = playerNameField;
    }

    @Override
    protected void onClick() {
        String name = playerNameField.getText().trim();
        if (name.isBlank()) return;

        GameManager.getInstance().createPlayer(playerNameField.getText());
        super.onClick();
    }
}
