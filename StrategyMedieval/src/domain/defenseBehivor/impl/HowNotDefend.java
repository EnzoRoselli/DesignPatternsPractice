package domain.defenseBehivor.impl;

import domain.defenseBehivor.IDefenseWeaponBehavior;

public class HowNotDefend implements IDefenseWeaponBehavior {
    @Override
    public void defend() {
        System.out.println("I don't have any weapon and I don't know how to defend");
    }
}
