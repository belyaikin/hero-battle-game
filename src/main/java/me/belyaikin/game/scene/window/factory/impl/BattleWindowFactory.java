package me.belyaikin.game.scene.window.factory.impl;

import me.belyaikin.game.scene.window.Window;
import me.belyaikin.game.scene.window.factory.WindowFactory;

import java.awt.*;

public final class BattleWindowFactory implements WindowFactory {
    @Override
    public Window create() {
        return new Window.Builder()
                .width(800)
                .height(600)

                .background(Color.BLACK)
                .foreground(Color.WHITE)

                .build();
    }
}
