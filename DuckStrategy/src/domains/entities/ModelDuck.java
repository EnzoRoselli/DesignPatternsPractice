package domains.entities;

import domains.flybehavior.impl.FlyNoWay;
import domains.quackbehavior.Impl.Quack;

public class ModelDuck extends Duck{

    public ModelDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }
}
