package Ex6;

public class Query {

	String SELECT = "" ;
	
	String FROM = "" ;
	
	String WHERE = "" ;
	
	String ORDER_BY = "" ;
	
	
	
	 public String toString() {
		
		 return this.SELECT + this.FROM + this.WHERE
				 + this.ORDER_BY;
		
	}
	
}
