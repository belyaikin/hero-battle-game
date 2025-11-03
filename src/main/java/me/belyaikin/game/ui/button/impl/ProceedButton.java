package me.belyaikin.game.ui.button.impl;

import me.belyaikin.game.ui.WindowManager;
import me.belyaikin.game.ui.button.WindowChangerButton;
import me.belyaikin.game.ui.window.factory.WindowFactory;

public class ProceedButton extends WindowChangerButton {
    public ProceedButton(String text, WindowManager windowManager, WindowFactory windowFactory) {
        super(text, windowManager, windowFactory);
    }
}
