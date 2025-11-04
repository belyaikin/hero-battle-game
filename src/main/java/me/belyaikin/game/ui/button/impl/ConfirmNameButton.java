package me.belyaikin.game.ui.button.impl;

import me.belyaikin.game.GameManager;
import me.belyaikin.game.scene.Scene;
import me.belyaikin.game.scene.SceneManager;
import me.belyaikin.game.scene.window.WindowManager;
import me.belyaikin.game.ui.button.SceneChangerButton;
import me.belyaikin.game.scene.window.factory.WindowFactory;

import javax.swing.*;

public final class ConfirmNameButton extends SceneChangerButton {
    private final JTextField playerNameField;

    public ConfirmNameButton(JTextField playerNameField, Scene scene) {
        super("CONFIRM..?", GameManager.getInstance().getSceneManager(), scene);
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
