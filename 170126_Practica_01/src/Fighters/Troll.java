package Fighters;

import Behaviors.WeaponBehavior;

public class Troll extends Character {
    public Troll(WeaponBehavior weapon) {
        super(weapon);
    }

    @Override
    public void fight() {
        System.out.print("I, Troll, ");
        super.fight();
    }
}
