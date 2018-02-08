package by.htp.pizza.pizzaservice;

import java.util.Scanner;

public class Order {
	public String address;
	public Pizza[] pizzas;

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
		System.out.println("� ����� ������ " + i + " ����");
		for (Pizza p : this.getOrderPizzas()) {
			System.out.println("����� " + p.getTitle() + " ������ " + p.getSize());
		}
		System.out.println("����� ����� ��������� �� ������ " + this.getOrderAddress());
	}

	public void makeOrder() {
		PizzaHouse ph = new PizzaHouse();
		this.setOrderAddress(ph.askAddress());
		this.setOrderPizzas(ph.askPizza());
		this.printOrder();
	}

}
