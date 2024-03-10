package HeadFirstBookQuestions;

import java.util.Random;

public class QuestionDuckAdapter  implements Turkey{
	
	Duck duck;
	Random rndm;
	
	public QuestionDuckAdapter(Duck duck) {
		this.duck=duck;
		rndm=new Random();
	}

	@Override
	public void gobble() {
		duck.quack();
	}

	@Override
	public void fly() {
		if(rndm.nextInt(5)==0) {
			duck.fly();
		}
	}

}
