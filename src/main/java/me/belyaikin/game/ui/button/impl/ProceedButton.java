package me.belyaikin.game.ui.button.impl;

import me.belyaikin.game.ui.WindowManager;
import me.belyaikin.game.ui.button.WindowChangerGameButton;
import me.belyaikin.game.ui.factory.GameWindowFactory;

public class ProceedButton extends WindowChangerGameButton {
    public ProceedButton(String text, WindowManager windowManager, GameWindowFactory gameWindowFactory) {
        super(text, windowManager, gameWindowFactory);
    }
}
