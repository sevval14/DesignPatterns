package factoryExample;

public class Pizza {
	
	private String name;
	Dough dough;
	Sauce sauce;

	public void prepare() {
		System.out.println("This pizza is preparing");		
	}

	public void bake() {
		System.out.println("This pizza is bakeing");		
		
	}

	public void cut() {
		System.out.println("This pizza is cutting");		
		
	}

	public void box() {
		System.out.println("This pizza is boxing");		
		
	}

	public String getName() {
		return name;
	}
	
	public String setName(String name) {
		return this.name =name;
	}
	
	@Override
	public String toString() {
		StringBuffer stringBuffer = new StringBuffer();
		System.out.println("----- "+name+" ------");
		stringBuffer.append(dough +"\n");
		stringBuffer.append(sauce);

		return stringBuffer.toString();
	}

}
