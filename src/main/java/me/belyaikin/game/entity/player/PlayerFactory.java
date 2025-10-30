package me.belyaikin.game.entity.player;

import me.belyaikin.game.entity.Entity;
import me.belyaikin.game.entity.EntityFactory;

public final class PlayerFactory implements EntityFactory {
    public String name;

    public PlayerFactory(String name) {
        this.name = name;
    }

    @Override
    public Entity create() {
        return new Player(name);
    }
}
