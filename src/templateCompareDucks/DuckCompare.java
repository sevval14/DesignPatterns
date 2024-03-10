package templateCompareDucks;

public class DuckCompare implements Comparable<DuckCompare>{

	String name;
	int weight;
	
	public DuckCompare(String name,int weight) {
		this.name=name;
		this.weight=weight;
	}
	
	@Override
	public int compareTo(DuckCompare anotherCompare) {
		DuckCompare compare = anotherCompare;
		
		if(this.weight > anotherCompare.weight) 
			return 1;
		else if(this.weight < anotherCompare.weight)
			return -1;
		else
			return 0;
		
	}

	public String getName() {
		return name;
	}

	public int getWeight() {
		return weight;
	}

}
