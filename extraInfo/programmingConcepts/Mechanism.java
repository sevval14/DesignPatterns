package programmingConcepts;

public interface Mechanism {
	//interface everthing alwayd puclic. There is no private or protectd bla bla
	//int value; I cant write like that becuase interface should be final. for example int value=5;
	
	 
	void start();
	
	void restart();
	
	void stop();
	
	//void toCharge();
	
	default String count() {
		return "Default ve ben bir devicenin içinde bunu ekstra yazmasam bile burdaki değeri döndürür";
	}
	
	int value=0;
	
	
	//bunu override etmeliyiz eğer override etmezsek hata vermez ama override etmesekde çalıştıramayız. ama default ve int diye tanımladığımızda ovveride etmesekde burdakine ulaşabilir
	
	static String description() {
		return "Bu aletin özelikleirni tanımlar";
	}
	
	

}
