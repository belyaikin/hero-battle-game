package me.belyaikin.game.scene.factory.impl;

import me.belyaikin.game.GameManager;
import me.belyaikin.game.entity.Entity;
import me.belyaikin.game.entity.player.PlayerEntity;
import me.belyaikin.game.scene.Scene;
import me.belyaikin.game.scene.factory.SceneFactory;
import me.belyaikin.game.scene.window.Window;
import me.belyaikin.game.ui.sprite.Sprite;

public final class BattleSceneFactory implements SceneFactory {
    @Override
    public Scene create(Window window) {
        Scene scene = new Scene(window);

        // TEMP
        scene.spawn(new PlayerEntity("Test"), 370, 495);

        return scene;
    }
}
