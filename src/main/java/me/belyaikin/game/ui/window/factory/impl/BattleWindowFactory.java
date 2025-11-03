package me.belyaikin.game.ui.window.factory.impl;

import me.belyaikin.game.GameManager;
import me.belyaikin.game.ui.window.Scene;
import me.belyaikin.game.ui.window.Window;
import me.belyaikin.game.ui.window.factory.WindowFactory;

import java.awt.*;

public final class BattleWindowFactory implements WindowFactory {
    @Override
    public Window create() {
        return new Scene.SceneBuilder()
                .entity(GameManager.getInstance().getPlayer())

                .width(800)
                .height(600)

                .background(Color.BLACK)
                .foreground(Color.WHITE)

                .build();
    }
}
