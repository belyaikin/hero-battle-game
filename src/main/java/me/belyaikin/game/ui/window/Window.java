package me.belyaikin.game.ui.window;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Window extends JFrame {
    protected Window() {}

    public static class WindowBuilder {
        protected int width;
        protected int height;

        protected LayoutManager layout;

        protected Color backgroundColor = Color.WHITE;
        protected Color foregroundColor = Color.BLACK;

        protected final List<Component> components = new ArrayList<>();

        protected boolean pack = false;
        protected boolean resizable = true;

        public WindowBuilder width(int width) {
            this.width = width;
            return this;
        }

        public WindowBuilder height(int height) {
            this.height = height;
            return this;
        }

        public WindowBuilder background(Color color) {
            this.backgroundColor = color;
            return this;
        }

        public WindowBuilder foreground(Color color) {
            this.foregroundColor = color;
            return this;
        }

        public WindowBuilder layout(LayoutManager layout) {
            this.layout = layout;
            return this;
        }

        public WindowBuilder component(Component component) {
            this.components.add(component);
            return this;
        }

        public WindowBuilder pack() {
            this.pack = true;
            return this;
        }

        public WindowBuilder notResizable() {
            this.resizable = false;
            return this;
        }

        public Window build() {
            Window window = new Window();

            window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

            if (this.width != 0 && this.height != 0)
                window.setSize(width, height);

            window.getContentPane().setLayout(this.layout);

            window.getContentPane().setBackground(backgroundColor);
            window.getContentPane().setForeground(foregroundColor);

            components.forEach(window::add);

            if (this.pack) window.pack();

            window.setResizable(resizable);

            window.setVisible(true);

            return window;
        }
    }
}
