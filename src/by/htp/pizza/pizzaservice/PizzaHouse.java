package by.htp.pizza.pizzaservice;

import java.util.Scanner;
import by.htp.pizza.pizzaservice.Order;

public class PizzaHouse {
	
	public String email;
	
	public Pizza cookPizza(int x, String s){
		Pizza pizza = new Pizza();
		pizza.setSize(x);
		pizza.setTitle(s);
		return pizza;
	}
	
	public Pizza cookPizza() {
		Pizza pizza = new Pizza();
		pizza.size = 15;
		pizza.title = "pepperoni";
		return pizza;
		//default pizza
	}
	
	public int askPizzaNumber() {
		Order ord = new Order();
		System.out.println("Давайте сделаем заказ, сколько хотите пицц?");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		return num;
	}
		
	public int askPizzaSize() {
		System.out.println("введите размер пиццы");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		return size;
	}
	
	public String askPizzaName() {
		System.out.println("введите название пиццы");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		return name;
	}
	
	public String askAddress() {
		System.out.println("введите адрес, куда доставить пиццу");
		Scanner sc = new Scanner(System.in);
		String address = sc.next();
		return address;
	}
	
	public Pizza[] askPizza() {
		this.askPizzaNumber();
		Pizza[] pizzas = new Pizza[this.askPizzaNumber()];
		for (int i = 1; i < askPizzaNumber(); i++) {
			askPizzaName();
			pizzas[i].title = this.askPizzaName();
			askPizzaSize();
			pizzas[i].size = this.askPizzaSize();
		}
		return pizzas;		
	}
	
	public void deliverPizza (Pizza p, String address) {
		
	}
	
	public void sendNotification (Pizza p) {
		
	}
	
	//Ask
		
	// Deliver
}
