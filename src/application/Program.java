package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import orderStatus.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Order order = new Order();
		
		order.setMoment(new Date());
		System.out.println("Enter cliente data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.next();
		System.out.print("Birth date (DD/MM/YYYY): ");
		String d = sc.next();
		Date date = sdf.parse(d);
		System.out.println("Enter order data:");
		System.out.print("Status: ");
		String status = sc.next();
		OrderStatus os = OrderStatus.valueOf(status);
		Client x = new Client(name, email, date);
		order.setClient(x);
		order.setStatus(os);
		
		System.out.print("How many items to this order? ");
		int quant_int = sc.nextInt();
		for (int i=0; i<quant_int; i++) {
			System.out.println("Enter #"+ (i + 1) +" item data:");
			System.out.print("Product name: ");
			sc.nextLine();
			String product = sc.nextLine();
			System.out.print("Product price: ");
			double price = sc.nextDouble();
			Product item = new Product(product, price);
			System.out.print("Quantity: ");
			int quant = sc.nextInt();
			OrderItem order_item = new OrderItem(quant, item);
			order.addItem(order_item);
		}
		
		System.out.println();
		System.out.println("ORDER SUMMARY: ");
		System.out.println(order);
		
		sc.close();
		
	}

}
