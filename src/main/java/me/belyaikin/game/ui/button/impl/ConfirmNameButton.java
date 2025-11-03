package me.belyaikin.game.ui.button.impl;

import me.belyaikin.game.GameManager;
import me.belyaikin.game.ui.WindowManager;
import me.belyaikin.game.ui.button.WindowChangerButton;
import me.belyaikin.game.ui.window.factory.WindowFactory;

import javax.swing.*;

public final class ConfirmNameButton extends WindowChangerButton {
    private final JTextField playerNameField;

    public ConfirmNameButton(WindowManager windowManager, WindowFactory newWindow, JTextField playerNameField) {
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
