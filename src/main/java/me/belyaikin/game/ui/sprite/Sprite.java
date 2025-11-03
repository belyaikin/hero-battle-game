package me.belyaikin.game.ui.sprite;

public class Sprite {
    private String path;

    public Sprite(String filename) {
        if (!filename.startsWith("/src"))
            path = filename;
        else
            path = "/src/main/resources/assets" + filename;
    }
}
