package templateCompareDucks;

import java.util.Arrays;

public class TestTemplateCompare {
	public static void main(String[] args) {
		DuckCompare[] compare = {
				new DuckCompare("duck1", 0),
				new DuckCompare("duck2", 6),
				new DuckCompare("duck1", 4),

		};
		
		for(int i=0 ; i<compare.length;i++) {
			System.out.println(compare[i].getName() + " " + compare[i].getWeight());
		}
		
		System.out.println("------COMPARE----------");
		Arrays.sort(compare);
		
		for(int i=0 ; i<compare.length;i++) {
			System.out.println(compare[i].getName() + " " + compare[i].getWeight());
		}
	}

}
