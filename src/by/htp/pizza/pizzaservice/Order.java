package by.htp.pizza.pizzaservice;

import java.util.Scanner;

public class Order {
	
	public String address;
	public Pizza[] pizzas;
	
	public Order() {
		
	}

	public Order (Pizza[] pizzas, String address) {
		this.setOrderPizzas(pizzas);
		this.setOrderAddress(address);
	}
	
	public void setOrderAddress(String address) {
		this.address = address;
	}

	public String getOrderAddress() {
		return this.address;
	}

	public void setOrderPizzas(Pizza[] p) {
		this.pizzas = p;
	}

	public Pizza[] getOrderPizzas() {
		return this.pizzas;
	}

	public void printOrder() {
		int i = this.pizzas.length;
		System.out.println("В вашем заказе " + i + " пицц");
		for (Pizza p : getOrderPizzas()) {
			System.out.println("Пицца " + p.getTitle() + " размер " + p.getSize());
		}
		System.out.println("Заказ будет доставлен по адресу " + this.getOrderAddress());
	}

	public void makeOrder() {
		PizzaHouse ph = new PizzaHouse();
		String address = ph.askAddress();
		this.setOrderAddress(address);
		this.setOrderPizzas(ph.askPizza());
		this.printOrder();
	}

}
