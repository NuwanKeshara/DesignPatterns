package Ex5;

public class Tea extends Beverages {

	@Override
	void addCondiments() {
		System.out.println("Steeping the Tea.");
		
	}

	@Override
	void brew() {
		System.out.println("Adding Lemon.");
		
	}

}
