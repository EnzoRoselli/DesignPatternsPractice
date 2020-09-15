package domain.entities;

import domain.attackBehivor.impl.HowAttackSword;
import domain.defenseBehivor.impl.HowDefendSword;

public class Gladiator extends Character{

    public Gladiator() {
        attackWeaponBehavior = new HowAttackSword();
        defenseWeaponBehavior = new HowDefendSword();
    }
}
