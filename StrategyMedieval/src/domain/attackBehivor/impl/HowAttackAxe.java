package domain.attackBehivor.impl;

import domain.attackBehivor.IAttackWeaponBehavior;

public class HowAttackAxe implements IAttackWeaponBehavior {
    @Override
    public void attack() {
        System.out.println("I'm attacking with an Axe");
    }
}
