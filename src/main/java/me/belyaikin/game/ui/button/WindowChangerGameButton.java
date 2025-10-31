package me.belyaikin.game.ui.button;

import me.belyaikin.game.ui.WindowManager;
import me.belyaikin.game.ui.factory.GameWindowFactory;

public abstract class WindowChangerGameButton extends GameButton {
    private final WindowManager windowManager;
    private final GameWindowFactory gameWindowFactory;

    public WindowChangerGameButton(String text, WindowManager windowManager, GameWindowFactory gameWindowFactory) {
        super(text);
        this.windowManager = windowManager;
        this.gameWindowFactory = gameWindowFactory;
    }

    @Override
    protected void onClick() {
        windowManager.setWindow(gameWindowFactory.create());
    }
}
