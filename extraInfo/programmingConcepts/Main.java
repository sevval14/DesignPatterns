package programmingConcepts;

public class Main {
	
	public static void main(String... args) {
		//Device device = new Device();
		//I cant do like that becuase I use abstact inside Device class. 
		
		Device phone = new Phone();
	
		phone.setName("Samsung");
		phone.setPrice(10);	
		phone.start();
		System.out.println("int value yaptım intefracein içinde herhnagi bir yerde tekrar yazmama gerek kalmadan çağırabildim : " + phone.value);
		System.out.println("Count çalıştır :" + phone.count() +"\n");

	
	
		System.out.print("BRO ");	
	
		//here we create 2 phone but first I used Device class secondly I used Phone class. this is polymorphism  
		Phone phone1 = new Phone();
		phone1.start();
		
		Device computer = new Computer();
		computer.start();
		System.out.println("Count çalıştır :" + computer.count()+"\n");

		

		
	}

	
}

