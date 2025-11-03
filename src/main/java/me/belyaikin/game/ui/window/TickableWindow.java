package me.belyaikin.game.ui.window;

import javax.swing.*;

public class TickableWindow extends Window {
    private final Timer timer;

    protected TickableWindow() {
        timer = new Timer(1000 / 60, e -> tick());
        timer.start();
    }

    public void tick() {
        this.repaint();
        System.out.println("test");
    }

    public void stop() {
        timer.stop();
    }

    public static class TickableWindowBuilder extends WindowBuilder {
        @Override
        public Window build() {
            TickableWindow tickableWindow = new TickableWindow();

            tickableWindow.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

            if (this.width != 0 && this.height != 0)
                tickableWindow.setSize(width, height);

            tickableWindow.getContentPane().setLayout(this.layout);

            tickableWindow.getContentPane().setBackground(backgroundColor);
            tickableWindow.getContentPane().setForeground(foregroundColor);

            components.forEach(tickableWindow::add);

            if (this.pack) tickableWindow.pack();

            tickableWindow.setResizable(resizable);

            tickableWindow.setVisible(true);

            return tickableWindow;
        }
    }
}
