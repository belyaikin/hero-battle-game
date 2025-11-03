package me.belyaikin.game.ui.window.factory.impl;

import me.belyaikin.game.ui.window.Window;
import me.belyaikin.game.ui.window.factory.WindowFactory;
import me.belyaikin.game.ui.window.TickableWindow;

import java.awt.*;

public final class BattleWindowFactory implements WindowFactory {
    @Override
    public Window create() {
        return new TickableWindow.Builder()
                .width(550)
                .height(450)

                .background(Color.BLACK)
                .foreground(Color.WHITE)

                .build();
    }
}
