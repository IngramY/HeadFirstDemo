package demo.duck;

import demo.impl.FlyNoWayImpl;
import demo.impl.QuackImpl;

public class ModelDuck extends Duck {

	public ModelDuck() {
		// TODO Auto-generated constructor stub
		flyBehavior = new FlyNoWayImpl();
		quackehavior = new QuackImpl();
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("I¡¯m a model duck");
	}
}

