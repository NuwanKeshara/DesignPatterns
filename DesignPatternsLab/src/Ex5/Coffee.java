package Ex5;

public class Coffee extends Beverages {

	@Override
	void addCondiments() {
		System.out.println("Stripping coffee through filter.");
		
	}

	@Override
	void brew() {
		System.out.println("Add sugar and milk.");
		
	}

}
