package me.belyaikin.game.ui.factory.impl;

import me.belyaikin.game.ui.window.GameWindow;
import me.belyaikin.game.ui.factory.GameWindowFactory;

public final class BattleWindowFactory implements GameWindowFactory {
    @Override
    public GameWindow create() {
        return new GameWindow.Builder()
                .width(550)
                .height(450)
                .build();
    }
}
