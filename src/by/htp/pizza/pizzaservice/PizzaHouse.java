package by.htp.pizza.pizzaservice;

import java.util.Scanner;
import by.htp.pizza.pizzaservice.Order;

public class PizzaHouse {
		
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
		//Order ord = new Order();
		System.out.println("������� ������� �����, ������� ������ ����?");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		return num;
	}
		
	public int askPizzaSize() {
		System.out.println("������� ������ �����");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		return size;
	}
	
	public String askPizzaName() {
		System.out.println("������� �������� �����");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		return name;
	}
	
	public String askAddress() {
		System.out.println("������� �����, ���� ��������� �����");
		Scanner sc = new Scanner(System.in);
		String address = sc.next();
		return address;
	}
	
	public Pizza[] askPizza() {
		int num = askPizzaNumber();
		Pizza[] pizzas = new Pizza[num];
		for (int i = 0; i < num; i++) {
			String name = askPizzaName();
			int size = askPizzaSize();
			pizzas[i] = cookPizza(size, name);
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
