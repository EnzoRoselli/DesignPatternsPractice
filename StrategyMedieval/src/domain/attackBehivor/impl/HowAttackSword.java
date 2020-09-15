package domain.attackBehivor.impl;

import domain.attackBehivor.IAttackWeaponBehavior;

public class HowAttackSword implements IAttackWeaponBehavior {
    @Override
    public void attack() {
        System.out.println("I'm attacking with a Sword");
    }
}
