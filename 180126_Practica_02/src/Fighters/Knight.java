package Fighters;

import Behaviors.WeaponBehavior;

public class Knight extends Character {
    public Knight(WeaponBehavior weapon) {
        super(weapon);
    }

    @Override
    public void fight() {
        System.out.print("I, Knight, ");
        super.fight();
    }
}
