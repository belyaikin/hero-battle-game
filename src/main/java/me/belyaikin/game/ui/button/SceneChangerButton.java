package me.belyaikin.game.ui.button;

import me.belyaikin.game.scene.Scene;
import me.belyaikin.game.scene.SceneManager;

public abstract class SceneChangerButton extends Button {
    private final SceneManager sceneManager;
    private final Scene scene;

    public SceneChangerButton(String text, SceneManager sceneManager, Scene scene) {
        super(text);
        this.sceneManager = sceneManager;
        this.scene = scene;
    }

    @Override
    protected void onClick() {
        this.sceneManager.setScene(this.scene);
    }
}
