package me.belyaikin.game;

import me.belyaikin.game.entity.enemy.Enemy;
import me.belyaikin.game.entity.enemy.EnemyFactory;
import me.belyaikin.game.entity.player.Player;
import me.belyaikin.game.entity.player.PlayerFactory;
import me.belyaikin.game.ui.GameWindow;
import me.belyaikin.game.ui.UIComposer;

public record GameManager(GameWindow gameWindow, UIComposer uiComposer) {
    public static Player player;
    public static Enemy enemy;

    public void initialize() {
        this.gameWindow.getjFrame().setTitle("Welcome to the battle!");

        this.uiComposer.initialize();

        player = (Player) new PlayerFactory("test").create();
        enemy = (Enemy) new EnemyFactory().create();

        System.out.println(player);
        System.out.println(enemy);
    }

    public void setTitle(String title) {
        this.gameWindow.getjFrame().setTitle(title);
    }
}
