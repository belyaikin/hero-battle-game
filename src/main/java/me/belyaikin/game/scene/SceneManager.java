package me.belyaikin.game.scene;

import me.belyaikin.game.scene.window.WindowManager;

public final class SceneManager {
    private final WindowManager windowManager;

    private Scene currentScene;

    public SceneManager(WindowManager windowManager) {
        this.windowManager = windowManager;
    }

    public void setScene(Scene scene) {
        if (currentScene != null)
            currentScene.deactivate();

        this.currentScene = scene;

        this.windowManager.setWindow(this.currentScene.getWindow());
        this.currentScene.activate();
    }
}
