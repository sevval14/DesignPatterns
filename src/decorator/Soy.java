package decorator;

import decorator.Beverage.Size;

public class Soy extends CondimentDecorator{
	
	Beverage beverage;
	
	public Soy(Beverage beverage) {
		this.beverage=beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + " + Soya + " + this.getSize();	
	}
	


	

	@Override
	public double cost() {
		double  cost = beverage.cost();
		if(getSize() == Size.GRANDE) {
			cost += .5;
		}else if (getSize() == Size.TALL) {
			cost += .10;
		}else {
			cost += .61;
		}
		return cost;
		
	}



}
