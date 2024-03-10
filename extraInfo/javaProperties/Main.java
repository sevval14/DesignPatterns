package javaProperties;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
	
	public static void main(String[] args) {
		List<User> users = new ArrayList<>();
		users.add(new User(1,"Ahmet"));
		users.add(new User(2,"Mahmut"));
		users.add(new User(3,"Hatçe"));
		users.add(new User(4,"Saniye"));
		
		
		users.stream().forEach(user -> System.out.println(user.toString()));//lambda operations
		System.out.println("---------------------------------------------");
		
		users.stream().forEach(user -> user.talk());	
		System.out.println("---------------------------------------------");
		
		users.stream().forEach(User::talk);	//method reference
		System.out.println("---------------------------------------------");
		
		long count = users.stream().filter(user -> user.getId() >5).count();
		System.out.println("Count : "+count);
		System.out.println("---------------------------------------------");

		
		List<User> filteredList = users.stream().filter(user -> user.getId() >2).collect(Collectors.toList());
		filteredList.stream().forEach(User::talk);
		System.out.println("---------------------------------------------");

		List<User> mappedList = users.stream().map(user -> new User(user.getId()+100,user.getName())).collect(Collectors.toList());
		mappedList.stream().forEach(user -> System.out.println(user.toString()));
		System.out.println("---------------------------------------------");

		Map<Integer , String> userMap = users.stream().collect(Collectors.toMap(user -> user.getId(), user -> user.getName()));
		userMap.forEach((key , value) -> System.out.println(key + " : " + value));
		System.out.println("---------------------------------------------");

	

		System.out.println(users);



	}

}
