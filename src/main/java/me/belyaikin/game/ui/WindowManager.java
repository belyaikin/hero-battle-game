package me.belyaikin.game.ui;

import me.belyaikin.game.ui.factory.impl.IntroWindowFactory;
import me.belyaikin.game.ui.window.GameWindow;

public final class WindowManager {
    private GameWindow currentWindow;

    public void showIntroGameWindow() {
        setWindow(new IntroWindowFactory().create());
    }

    public void setWindow(GameWindow newWindow) {
        if (currentWindow != null)
            this.currentWindow.getjFrame().dispose();

        this.currentWindow = newWindow;
    }
}
