package domain.entities;

import domain.attackBehivor.impl.HowAttackAxe;
import domain.defenseBehivor.impl.HowNotDefend;

public class Archer extends Character{

    public Archer() {
        attackWeaponBehavior = new HowAttackAxe();
        defenseWeaponBehavior = new HowNotDefend();
    }
}
