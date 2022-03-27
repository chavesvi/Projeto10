package entities;

import java.util.ArrayList;
import java.util.List;

public class Vendor {
	
	private String name;
	private String email;
	private Double fixedSal;
	
	private List<Order> orders = new ArrayList<>();
	/* venderdor tem uma lista de pedidos, ver forma de  adicionar
	 automaticamente, todos os pedidos */
	
	public Vendor() {
	}

	public Vendor(String name, String email, Double fixedSal) {
		super();
		this.name = name;
		this.email = email;
		this.fixedSal = fixedSal;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	public Double getSalFixed() {
		return fixedSal;
	}

	public void setSalFixed(Double salFixed) {
		this.fixedSal = salFixed;
	}

	
	public void addOrder() {
		//adicionar orders
	}
	
	public Double saleTax(Double per) {
		Double sum = 0.0;
		for (Order x : orders) {
			for (OrderItem i : x.getItems()) {
				sum += i.subTotal();
			}
		}
		return sum * per;
	}
	
	public Double totalSalary(Double per) {
		return saleTax(per) + fixedSal;
	}
	
	
	@Override
	public String toString() {
		return "Vendor [name = " + name + "]";
	}

}
