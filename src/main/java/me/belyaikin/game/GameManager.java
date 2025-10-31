package me.belyaikin.game;

import me.belyaikin.game.entity.enemy.Enemy;
import me.belyaikin.game.entity.player.Player;
import me.belyaikin.game.entity.player.PlayerFactory;
import me.belyaikin.game.ui.WindowManager;

public class GameManager {
    private static GameManager INSTANCE;

    private Player player;
    private Enemy enemy;

    private final WindowManager windowManager;

    private GameManager() {
        this.windowManager = new WindowManager();
    }

    public static GameManager getInstance() {
        if (INSTANCE == null)
            INSTANCE = new GameManager();
        return INSTANCE;
    }

    public void start() {
        windowManager.showIntroGameWindow();
    }

    public Player getPlayer() {
        return player;
    }

    public void createPlayer(String name) {
        this.player = (Player) new PlayerFactory(name).create();
    }

    public Enemy getEnemy() {
        return enemy;
    }

    public void setEnemy(Enemy enemy) {
        this.enemy = enemy;
    }

    public WindowManager getWindowManager() {
        return windowManager;
    }
}
