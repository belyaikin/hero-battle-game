package me.belyaikin.game.entity.player;

import me.belyaikin.game.entity.LivingEntity;
import me.belyaikin.game.entity.weapon.AttackResult;
import me.belyaikin.game.entity.weapon.SimpleWeapon;
import me.belyaikin.game.entity.weapon.Weapon;
import me.belyaikin.game.entity.weapon.bullet.impl.SimpleBullet;
import me.belyaikin.game.ui.sprite.Sprite;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public final class PlayerEntity extends LivingEntity implements KeyListener {
    private final String name;

    private Weapon currentWeapon = new SimpleWeapon();

    private final int upKey = KeyEvent.VK_W;
    private final int downKey = KeyEvent.VK_S;
    private final int leftKey = KeyEvent.VK_A;
    private final int rightKey = KeyEvent.VK_D;

    private int xInput = 0;
    private int yInput = 0;

    private int speed = 5;

    public PlayerEntity(String name) {
        super(100, new Sprite("rocket.png", 16*3, 16*3));

        this.name = name;
    }

    @Override
    public void onSpawn() {
        this.getScene().getWindow().addKeyListener(this);
        startShooting();
    }

    @Override
    public void onTick() {
        // 10 725
        setX(Math.clamp(getX(), 10, 725));
        setY(Math.clamp(getY(), 15, 495));

        setX(getX() + xInput * speed);
        setY(getY() + yInput * speed);
    }

    @Override
    public AttackResult onAttacked(Weapon weapon) {
        return new AttackResult("TODO: Handle attacks");
    }

    final Timer shootingTimer = new Timer(1000 / 5, e -> {
        this.getScene().spawn(new SimpleBullet(), getX() + 22, getY() + 10);
    });

    public void startShooting() {
        shootingTimer.start();
    }

    public void stopShooting() {
        shootingTimer.stop();
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

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case upKey -> yInput = -1;
            case downKey -> yInput = 1;
            case rightKey -> xInput = 1;
            case leftKey -> xInput = -1;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == upKey || e.getKeyCode() == downKey) yInput = 0;
        if (e.getKeyCode() == rightKey || e.getKeyCode() == leftKey) xInput = 0;
    }
}
