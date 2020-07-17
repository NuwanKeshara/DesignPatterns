package Ex7;

public class TestAdapter {

	public static void main(String[] args) {
	
		System.out.println("Duck says.....");
		
		Duck duck = new MallardDuck();
		duck.quack();
		duck.fly();
		
		System.out.println("\nTurkey says.....");
		
		Turkey turkey = new WildTurkey();
		turkey.gobble();
		turkey.fly();
		
		System.out.println("\nTurkey adapter says.....");
		
		TurkeyAdapter turkeyAdapter = new TurkeyAdapter(turkey);
		turkeyAdapter.quack();
		turkeyAdapter.fly();

	}

}
