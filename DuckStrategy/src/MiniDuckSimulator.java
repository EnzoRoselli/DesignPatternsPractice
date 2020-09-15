import domains.entities.Duck;
import domains.entities.MallardDuck;
import domains.entities.ModelDuck;
import domains.flybehavior.impl.FlyRocketPowered;

public class MiniDuckSimulator {

    public static void main(String[] args) {

        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
