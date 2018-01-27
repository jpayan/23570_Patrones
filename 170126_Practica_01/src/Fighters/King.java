package Fighters;

import Behaviors.WeaponBehavior;

public class King extends Character {
    public King(WeaponBehavior weapon) {
        super(weapon);
    }

    @Override
    public void fight() {
        System.out.print("I, King, ");
        super.fight();
    }
}
