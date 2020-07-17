package Ex3;

public class Square implements Shape{

	@Override
	public void draw() {
		System.out.println("Inside Square::draw() method.");
		
		for(int i = 0 ; i < 5; ++i) {
			System.out.print("#");
			for(int j = 0 ;  j < 8 ; ++j) {
				if(i==0 || i==4)
					System.out.print("#");
				
				else
					System.out.print(" ");
			}
			System.out.print("#");
			System.out.println();
		}
	}

}
