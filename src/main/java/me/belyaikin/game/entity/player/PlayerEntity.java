package me.belyaikin.game.entity.player;

import me.belyaikin.game.entity.LivingEntity;
import me.belyaikin.game.ui.sprite.Sprite;
import me.belyaikin.game.weapon.AttackResult;
import me.belyaikin.game.weapon.Weapon;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public final class PlayerEntity extends LivingEntity implements KeyListener {
    private final String name;

    private Weapon currentWeapon;

    public PlayerEntity(String name) {
        super(100, new Sprite("test.png", 100, 100));

        this.name = name;
    }

    @Override
    public AttackResult onAttacked(Weapon weapon) {
        return new AttackResult("TODO: Handle attacks");
    }

    @Override
    public void die() {
        // TODO: Show game over screen
    }

    public String getName() {
        return name;
    }

    public Weapon getCurrentWeapon() {
        return currentWeapon;
    }

    public void setCurrentWeapon(Weapon currentWeapon) {
        this.currentWeapon = currentWeapon;
    }

    @Override
    public void onSpawn() {
        this.getScene().getWindow().addKeyListener(this);
    }

    @Override
    public void onTick() {

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_W) {
            y += 1;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
