package demo;

import demo.duck.Duck;
import demo.duck.MallardDuck;
import demo.duck.ModelDuck;
import demo.impl.FlyRocketPoweredImpl;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Duck mallard = new MallardDuck();
		mallard.performQuack();
		mallard.performFly();
		mallard.display();
		
		Duck model = new ModelDuck();
		model.performFly();
		model.setFlyBehavior(new FlyRocketPoweredImpl());
		model.performFly();
		model.display();
	}

}
