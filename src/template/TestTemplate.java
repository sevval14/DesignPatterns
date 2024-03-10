package template;

public class TestTemplate {

	public static void main(String[] args) {
		CaffeBeverage tea = new Tea();
		CaffeBeverage coffee = new Coffee();
		
		tea.prepareReceipe();
		coffee.prepareReceipe();

		
	}
}
