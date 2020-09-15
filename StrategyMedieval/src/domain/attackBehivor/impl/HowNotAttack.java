package domain.attackBehivor.impl;

import domain.attackBehivor.IAttackWeaponBehavior;

public class HowNotAttack implements IAttackWeaponBehavior {

    @Override
    public void attack() {
        System.out.println("I don't have any weapon and I don't know how to attack");
    }
}
