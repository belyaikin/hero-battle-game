package me.belyaikin.game.scene.factory.impl;

import me.belyaikin.game.GameManager;
import me.belyaikin.game.scene.Scene;
import me.belyaikin.game.scene.factory.SceneFactory;
import me.belyaikin.game.scene.window.Window;

public final class BattleSceneFactory implements SceneFactory {
    @Override
    public Scene create(Window window) {
        Scene scene = new Scene(window);

        scene.spawn(GameManager.getInstance().getPlayer());

        return scene;
    }
}
