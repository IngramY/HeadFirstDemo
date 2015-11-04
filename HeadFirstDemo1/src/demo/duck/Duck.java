package demo.duck;

import demo.impl.IFlyBehavior;
import demo.impl.IQuackehavior;

/**
 * ≥¨¿‡
 * @author Administrator
 *
 */
public abstract class Duck {

	IQuackehavior quackehavior;
	IFlyBehavior flyBehavior;
	
	public Duck() {
		// TODO Auto-generated constructor stub
	}
	
	public void setQuackehavior(IQuackehavior quackehavior) {
		this.quackehavior = quackehavior;
	}

	public void setFlyBehavior(IFlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	public void swim(){
		System.out.println("All ducks float, even decoys!");
	}
	
	public abstract void display();
	
	public void performFly(){
		flyBehavior.fly();
	}
	
	public void performQuack(){
		quackehavior.quack();
	}
}
