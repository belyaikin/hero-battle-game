package me.belyaikin.game.entity.player;

import me.belyaikin.game.entity.LivingEntity;
import me.belyaikin.game.weapon.AttackResult;
import me.belyaikin.game.weapon.Weapon;

public final class Player extends LivingEntity {
    public Player(String name) {
        super(
                name,
                "This is you."
        );
    }

    @Override
    public AttackResult onAttacked(Weapon weapon) {
        return new AttackResult("TODO: Handle attacks");
    }

    @Override
    public void die() {
        // TODO: Show game over screen
    }
}
