package me.belyaikin.game.entity.player;

import me.belyaikin.game.entity.LivingEntity;
import me.belyaikin.game.entity.weapon.SimpleWeapon;
import me.belyaikin.game.ui.sprite.Sprite;
import me.belyaikin.game.entity.weapon.AttackResult;
import me.belyaikin.game.entity.weapon.Weapon;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public final class PlayerEntity extends LivingEntity implements KeyListener {
    private final String name;

    private Weapon currentWeapon = new SimpleWeapon();

    private int xInput = 0;
    private int yInput = 0;
    private int speed = 5;

    public PlayerEntity(String name) {
        super(100, new Sprite("rocket.png", 16*3, 16*3));

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

    public void shoot() {
        this.getScene().spawn(this.currentWeapon.getBullet(), this.x, this.y + 10);
    }

    @Override
    public void onSpawn() {
        this.getScene().getWindow().addKeyListener(this);
    }

    @Override
    public void onTick() {
        x = Math.clamp(x, 10, 725);
        y = Math.clamp(y, 15, 495);

        x += xInput * speed;
        y += yInput * speed;
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_UP -> yInput = -1;
            case KeyEvent.VK_DOWN -> yInput = 1;
            case KeyEvent.VK_RIGHT -> xInput = 1;
            case KeyEvent.VK_LEFT -> xInput = -1;
            case KeyEvent.VK_SPACE -> shoot();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_UP || e.getKeyCode() == KeyEvent.VK_DOWN) yInput = 0;
        if (e.getKeyCode() == KeyEvent.VK_RIGHT || e.getKeyCode() == KeyEvent.VK_LEFT) xInput = 0;
    }
}
