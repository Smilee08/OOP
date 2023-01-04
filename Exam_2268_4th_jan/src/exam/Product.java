package exam;

import java.util.List;

public abstract class Product {
	
	private Integer p_id;
	private String category;
	private List<Customer> customer;
	private Integer price;
	

	public Product(Integer p_id, String category, Integer price) {
		super();
		this.p_id = p_id;
		this.category = category;
		this.price = price;
	}

	public List<Customer> history() {
		return customer;
	}
	

}
