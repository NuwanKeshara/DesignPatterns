package Ex9;

public class StratergyTest {

	public static void main(String[] args) {
		
		Student poStudents = new PostGraduateStudents();
		poStudents.setPrograms(new DoctoralPrograms());
		poStudents.setFestival(new RoboFest());
		poStudents.offerPrograms();
		poStudents.conductEvents();
		poStudents.displayStudents();
		
		System.out.println("\n=======Assign Event=======");
		poStudents.setFestival(new CodeFest());
		poStudents.conductEvents();
		
		System.out.println("\n==========================");
		
		Student unStudents = new UndergraduateStudents();
		unStudents.setPrograms(new BScPrograms());
		unStudents.setFestival(new CodeFest());
		unStudents.offerPrograms();
		unStudents.conductEvents();
		unStudents.displayStudents();
		
		System.out.println("\n====Assign new Program====");
		unStudents.setPrograms(new MScPrograms());
		unStudents.offerPrograms();
	}

}
