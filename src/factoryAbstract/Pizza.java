package factoryAbstract;

import java.util.ArrayList;
import java.util.List;

public class Pizza {

	private String name;
	Dough dough;


	void prepare() {
		System.out.println("Preparing .. " + getName() );
		System.out.println("Tossing dough...");
		
	}
	
	 void bake() {
		 System.out.println("Bake for 25 minutes at 350");
	}
	 void cut() {
		 System.out.println("Cutting the pizza into diagonal slices");
	}

	void box() {
		 System.out.println("Place pizza in official PizzaStore box");
	}
	
	
		 
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		StringBuffer stringBuffer = new StringBuffer();
		System.out.println("");
		stringBuffer.append("----"+name+"-----\n");
		stringBuffer.append(dough + "\n");
		
		
		return stringBuffer.toString();
		
	}
	
	//If I write super.toString() and run rizza in systout, it give this result : factoryMethod.Pizza@2c7b84de

	
	
}
