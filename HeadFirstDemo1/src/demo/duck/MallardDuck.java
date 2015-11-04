package demo.duck;

import demo.impl.FlyWithWingsImpl;
import demo.impl.QuackImpl;

public class MallardDuck extends Duck {

	public MallardDuck() {
		// TODO Auto-generated constructor stub
		quackehavior = new QuackImpl();
		flyBehavior = new FlyWithWingsImpl();
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("I¡¯m a real Mallard duck");
	}

}
