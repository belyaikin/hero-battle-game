package me.belyaikin.game.scene;

import me.belyaikin.game.scene.window.WindowManager;

public final class SceneManager {
    private final WindowManager windowManager;

    public SceneManager(WindowManager windowManager) {
        this.windowManager = windowManager;
    }

    public void setScene(Scene scene) {
        this.windowManager.setWindow(scene.getWindow());
    }
}
