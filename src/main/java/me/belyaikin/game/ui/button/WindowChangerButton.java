package me.belyaikin.game.ui.button;

import me.belyaikin.game.ui.WindowManager;
import me.belyaikin.game.ui.window.factory.WindowFactory;

public abstract class WindowChangerButton extends Button {
    private final WindowManager windowManager;
    private final WindowFactory windowFactory;

    public WindowChangerButton(String text, WindowManager windowManager, WindowFactory windowFactory) {
        super(text);
        this.windowManager = windowManager;
        this.windowFactory = windowFactory;
    }

    @Override
    protected void onClick() {
        windowManager.setWindow(windowFactory.create());
    }
}
