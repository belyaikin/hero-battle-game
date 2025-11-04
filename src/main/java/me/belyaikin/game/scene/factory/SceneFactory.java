package me.belyaikin.game.scene.factory;

import me.belyaikin.game.scene.Scene;
import me.belyaikin.game.scene.window.Window;

public interface SceneFactory {
    Scene create(Window window);
}
