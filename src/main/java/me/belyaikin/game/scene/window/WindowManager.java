package me.belyaikin.game.scene.window;

public final class WindowManager {
    private Window currentWindow;

    public void setWindow(Window newWindow) {
        if (currentWindow != null)
            this.currentWindow.dispose();

        this.currentWindow = newWindow;
    }
}
