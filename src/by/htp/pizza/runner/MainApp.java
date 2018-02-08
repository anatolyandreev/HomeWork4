package by.htp.pizza.runner;

import java.util.Arrays;
import java.util.Scanner;

import by.htp.pizza.pizzaservice.Order;
import by.htp.pizza.pizzaservice.Pizza;
import by.htp.pizza.pizzaservice.PizzaHouse;

public class MainApp {

	public static void main(String[] args) {
		
		Pizza pizza1 = new Pizza();
		pizza1.setSize(40);
		pizza1.setTitle("4 season");
		
		PizzaHouse house = new PizzaHouse();
		Pizza pizza2 = house.cookPizza();
		
		Pizza pizza3 = house.cookPizza(20, "Italian");
		
		Pizza[] pzs = {pizza1, pizza2, pizza3};

		
		Order ord = new Order();
//		Scanner sc = new Scanner(System.in);
//		System.out.println("введите адрес заказа");
//		String address = sc.next();
		ord.makeOrder();		
		
//		Pizza[] pzz = house.askPizza();
		
		
		//Ask for pizza
		
		// Cook pizza
		
		// Deliver pizza

	}

}
