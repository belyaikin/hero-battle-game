package me.belyaikin.game.scene.window;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public final class Window extends JFrame {
    private final WindowPanel windowPanel = new WindowPanel(this);

    private Window() {}

    public WindowPanel getWindowPanel() {
        return this.windowPanel;
    }

    public static class Builder {
        private int width;
        private int height;

        private LayoutManager layout;

        private Color backgroundColor = Color.WHITE;
        private Color foregroundColor = Color.BLACK;

        private final List<Component> components = new ArrayList<>();

        private boolean pack = false;
        private boolean resizable = true;

        public Builder width(int width) {
            this.width = width;
            return this;
        }

        public Builder height(int height) {
            this.height = height;
            return this;
        }

        public Builder background(Color color) {
            this.backgroundColor = color;
            return this;
        }

        public Builder foreground(Color color) {
            this.foregroundColor = color;
            return this;
        }

        public Builder layout(LayoutManager layout) {
            this.layout = layout;
            return this;
        }

        public Builder component(Component component) {
            this.components.add(component);
            return this;
        }

        public Builder pack() {
            this.pack = true;
            return this;
        }

        public Builder notResizable() {
            this.resizable = false;
            return this;
        }

        public Window build() {
            Window window = new Window();

            window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

            if (this.width != 0 && this.height != 0)
                window.setSize(width, height);

            window.setContentPane(window.getWindowPanel());
            window.getContentPane().setLayout(this.layout);

            window.getContentPane().setBackground(backgroundColor);
            window.getContentPane().setForeground(foregroundColor);

            components.forEach(window::add);

            if (this.pack) window.pack();

            window.setResizable(resizable);

            return window;
        }
    }
}
