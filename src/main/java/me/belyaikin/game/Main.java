package me.belyaikin.game;

import me.belyaikin.game.ui.GameWindow;
import me.belyaikin.game.ui.UIComposer;

public class Main {
    public static void main(String[] args) {
        GameWindow gameWindow = new GameWindow();
        UIComposer composer = new UIComposer(gameWindow);

        GameManager gameManager = new GameManager(gameWindow, composer);
        gameManager.initialize();
    }
}