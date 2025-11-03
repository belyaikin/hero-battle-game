package me.belyaikin.game;

import me.belyaikin.game.entity.enemy.EnemyEntity;
import me.belyaikin.game.entity.player.PlayerEntity;
import me.belyaikin.game.ui.WindowManager;

public final class GameManager {
    private static GameManager INSTANCE;

    private PlayerEntity playerEntity;
    private EnemyEntity enemyEntity;

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
        this.playerEntity = new PlayerEntity(name);
    }

    public EnemyEntity getEnemy() {
        return enemyEntity;
    }

    public void setEnemy(EnemyEntity enemy) {
        this.enemyEntity = enemy;
    }

    public WindowManager getWindowManager() {
        return windowManager;
    }
}
