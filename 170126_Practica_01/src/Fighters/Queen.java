package Fighters;

import Behaviors.WeaponBehavior;

public class Queen extends Character {
    public Queen(WeaponBehavior weapon) {
        super(weapon);
    }

    @Override
    public void fight() {
        System.out.print("I, Queen, ");
        super.fight();
    }
}