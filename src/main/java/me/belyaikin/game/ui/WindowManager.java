package me.belyaikin.game.ui;

import me.belyaikin.game.ui.window.factory.impl.IntroWindowFactory;
import me.belyaikin.game.ui.window.Window;

public final class WindowManager {
    private Window currentWindow;

    public void showIntroGameWindow() {
        setWindow(new IntroWindowFactory().create());
    }

    public void setWindow(Window newWindow) {
        if (currentWindow != null)
            this.currentWindow.dispose();

        this.currentWindow = newWindow;
    }
}
