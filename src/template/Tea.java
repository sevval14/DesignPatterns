package template;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tea extends CaffeBeverage{

	@Override
	protected void addCondiments() {
		System.out.println("Lemon");
	}

	@Override
	protected void brew() {
		System.out.println("brew for tea");
		
	}
	
	@Override
	public boolean wantCondiments() {
		String answer = getInput();
		if(answer.toLowerCase().startsWith("y"))
			return true;
		else
			return false;
	}
	
	
	

	private String getInput() {
		String answer = null;
		System.out.println("Do you want condiments? (y/n)");
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try {
			answer = in.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		if(answer==null) {
			answer="n";
		}
		
		return answer;
	}

}
