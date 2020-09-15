package domain.defenseBehivor.impl;

import domain.defenseBehivor.IDefenseWeaponBehavior;

public class HowDefendShield implements IDefenseWeaponBehavior {
    @Override
    public void defend() {
        System.out.println("I'm defending with a Shield");
    }
}
