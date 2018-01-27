package Fighters;

import Behaviors.WeaponBehavior;

public abstract class Character {
    private WeaponBehavior weapon;

    public Character(WeaponBehavior weapon) {
        this.weapon = weapon;
    }

    public void setWeapon(WeaponBehavior weapon) {
        this.weapon = weapon;
    }

    public void fight() {
        System.out.print("fight with my ");
        this.weapon.useWeapon();
    }
}
