package Ex6;

public class Test {

	public static void main(String[] args) {
		
		Query query1 = new QueryBuilder().select("name").from("student").build();
		System.out.println(query1.toString());

		Query query2 = new QueryBuilder().select("name").from("student").where("name = 'Name1'").build();
		System.out.println(query2.toString());
		
		Query query3 = new QueryBuilder().select("name").where("name = 'Name1'").build();
		System.out.println(query3.toString());
		
	}

}
