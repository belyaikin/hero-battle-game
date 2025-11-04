package me.belyaikin.game;

import me.belyaikin.game.entity.enemy.BossEntity;
import me.belyaikin.game.entity.player.PlayerEntity;
import me.belyaikin.game.scene.Scene;
import me.belyaikin.game.scene.SceneManager;
import me.belyaikin.game.scene.window.WindowManager;
import me.belyaikin.game.scene.window.factory.impl.IntroWindowFactory;

public final class GameManager {
    private static GameManager INSTANCE;

    private PlayerEntity playerEntity;
    private BossEntity bossEntity;

    private final SceneManager sceneManager;
    private final WindowManager windowManager;

    private GameManager() {
        this.windowManager = new WindowManager();
        this.sceneManager = new SceneManager(windowManager);
    }

    public static GameManager getInstance() {
        if (INSTANCE == null)
            INSTANCE = new GameManager();
        return INSTANCE;
    }

    public void start() {
        sceneManager.setScene(new Scene(new IntroWindowFactory().create()));
    }

    public PlayerEntity getPlayer() {
        return playerEntity;
    }

    public void createPlayer(String name) {
        this.playerEntity = new PlayerEntity(name);
    }

    public BossEntity getEnemy() {
        return bossEntity;
    }

    public void setEnemy(BossEntity enemy) {
        this.bossEntity = enemy;
    }

    public WindowManager getWindowManager() {
        return windowManager;
    }

    public SceneManager getSceneManager() {
        return sceneManager;
    }
}
