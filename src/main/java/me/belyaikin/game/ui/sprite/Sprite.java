package me.belyaikin.game.ui.sprite;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public final class Sprite {
    private Image image;

    public Sprite(String filename) {
        setImage(filename);
    }

    public Image getImage() {
        return image;
    }

    public void setImage(String filename) {
        String path;

        if (filename.startsWith("src"))
            path = filename;
        else
            path = "src\\main\\resources\\assets\\" + filename;

        try {
            this.image = ImageIO.read(new File(path));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
