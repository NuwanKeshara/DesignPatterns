package Ex6;

public class QueryBuilder {

	Query query;
	
	QueryBuilder(){
		this.query = new Query();
	}
	
	QueryBuilder select(String select) {
		this.query.SELECT = " SELECT " + select;
		return this;
	}
	
	QueryBuilder from(String from) {
		this.query.FROM = " FROM " + from;
		return this;
	}
	
	QueryBuilder where(String where) {
		this.query.WHERE = " WHERE " + where;
		return this;
	}
	
	QueryBuilder orderBy(String orderBy) {
		this.query.ORDER_BY = " ORDER BY " + orderBy;
		return this;
	}
	
	Query build(){
		
		if(query.SELECT != "" && query.FROM != "")
			return query;
		
		else 
			throw new IllegalStateException("Query must have a from");
	}
	
}
