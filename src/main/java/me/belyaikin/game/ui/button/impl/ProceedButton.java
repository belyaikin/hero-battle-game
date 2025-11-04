package me.belyaikin.game.ui.button.impl;

import me.belyaikin.game.GameManager;
import me.belyaikin.game.scene.Scene;
import me.belyaikin.game.scene.SceneManager;
import me.belyaikin.game.scene.window.WindowManager;
import me.belyaikin.game.ui.button.SceneChangerButton;
import me.belyaikin.game.scene.window.factory.WindowFactory;

public class ProceedButton extends SceneChangerButton {
    public ProceedButton(String text, Scene scene) {
        super(text, GameManager.getInstance().getSceneManager(), scene);
    }
}
