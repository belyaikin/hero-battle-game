package me.belyaikin.game.ui.button;

import me.belyaikin.game.ui.WindowManager;
import me.belyaikin.game.ui.factory.GameWindowFactory;
import me.belyaikin.game.ui.window.GameWindow;

import java.awt.event.ActionEvent;

public abstract class WindowChangerGameButton extends GameButton {
    private final WindowManager windowManager;
    private final GameWindowFactory gameWindow;

    public WindowChangerGameButton(String text, WindowManager windowManager, GameWindowFactory gameWindow) {
        super(text);
        this.windowManager = windowManager;
        this.gameWindow = gameWindow;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this)
            windowManager.setWindow(gameWindow.create());
    }
}
