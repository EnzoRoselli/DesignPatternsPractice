import domain.attackBehivor.impl.HowAttackAxe;
import domain.defenseBehivor.impl.HowNotDefend;
import domain.entities.Gladiator;
import domain.entities.Character;

public class main {

    public static void main(String[] args) {

        Character pantheon = new Gladiator();

        pantheon.getAttackWeaponBehavior().attack();
        pantheon.getDefenseWeaponBehavior().defend();

        pantheon.move("Sur", 3);

        System.out.println("Encontre un acha");
        pantheon.setAttackWeaponBehivor(new HowAttackAxe());
        pantheon.setDefenseWeaponBehivor(new HowNotDefend());

        pantheon.getAttackWeaponBehavior().attack();
        pantheon.getDefenseWeaponBehavior().defend();
    }
}
