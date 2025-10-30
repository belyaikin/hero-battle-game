package me.belyaikin.game.weapon;

public abstract class Weapon {
    public String name;
    public String description;

    public int damage;
    public WeaponType weaponType;

    public Weapon(String name, String description, int damage, WeaponType weaponType) {
        this.name = name;
        this.description = description;
        this.damage = damage;
        this.weaponType = weaponType;
    }
}
