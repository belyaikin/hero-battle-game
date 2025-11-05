package me.belyaikin.game.ui.sprite;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public final class Sprite {
    private BufferedImage image;

    private int xScale;

    private int yScale;
    public Sprite(String filename, int xScale, int yScale) {
        setImage(filename);
        setScaling(xScale, yScale);
    }

    public Image getImage() {
        return image.getScaledInstance(xScale, yScale, Image.SCALE_DEFAULT);
    }

    public void setScaling(int xScale, int yScale) {
        this.xScale = xScale;
        this.yScale = yScale;
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

    public int getXScale() {
        return xScale;
    }

    public void setXScale(int xScale) {
        this.xScale = xScale;
    }

    public int getYScale() {
        return yScale;
    }

    public void setYScale(int yScale) {
        this.yScale = yScale;
    }
}
