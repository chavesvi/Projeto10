package entities;

public class OrderItem {
	
	private Integer quantity;
	
	private Product p;
	
	public OrderItem() {
	}

	public OrderItem(Integer quantity, Product p) {
		this.quantity = quantity;
		this.p = p;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	
	public Product getP() {
		return p;
	}

	public void setP(Product p) {
		this.p = p;
	}

	public double subTotal() {
		return quantity * p.getPrice();
	}

}
