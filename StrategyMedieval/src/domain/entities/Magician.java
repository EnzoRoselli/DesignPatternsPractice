package domain.entities;

import domain.attackBehivor.impl.HowNotAttack;
import domain.defenseBehivor.impl.HowNotDefend;

public class Magician extends Character{

    public Magician() {
        attackWeaponBehavior = new HowNotAttack();
        defenseWeaponBehavior = new HowNotDefend();
    }
}
