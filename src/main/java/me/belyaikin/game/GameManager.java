package me.belyaikin.game;

import me.belyaikin.game.entity.enemy.Enemy;
import me.belyaikin.game.entity.player.PlayerEntity;
import me.belyaikin.game.ui.WindowManager;

public final class GameManager {
    private static GameManager INSTANCE;

    private PlayerEntity playerEntity;
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

    public PlayerEntity getPlayer() {
        return playerEntity;
    }

    public void createPlayer(String name) {
        this.playerEntity = (PlayerEntity) new PlayerFactory(name).create();
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
