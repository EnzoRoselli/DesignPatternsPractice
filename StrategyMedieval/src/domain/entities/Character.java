package domain.entities;

import domain.attackBehivor.IAttackWeaponBehavior;
import domain.defenseBehivor.IDefenseWeaponBehavior;

public abstract class Character {

    protected IAttackWeaponBehavior attackWeaponBehavior;
    protected IDefenseWeaponBehavior defenseWeaponBehavior;

    public void attack(){
        attackWeaponBehavior.attack();
    }

    public void defend(){
        defenseWeaponBehavior.defend();
    }

    public void move(String direction, Integer speed){
        System.out.println("Personaje moviendose " + speed + " casillas hacia el " + direction);
    }

    public void setAttackWeaponBehivor(IAttackWeaponBehavior attackWeaponBehivor){
        this.attackWeaponBehavior = attackWeaponBehivor;
    }

    public void setDefenseWeaponBehivor(IDefenseWeaponBehavior defenseWeaponBehivor){
        this.defenseWeaponBehavior = defenseWeaponBehivor;
    }

    public IAttackWeaponBehavior getAttackWeaponBehavior() {
        return attackWeaponBehavior;
    }

    public IDefenseWeaponBehavior getDefenseWeaponBehavior() {
        return defenseWeaponBehavior;
    }
}
