package by.htp.pizza.pizzaservice;

public class Pizza {
	
	public String title;
	public int size;
	
	public void setSize (int s) {
		this.size = s;
	}
	
	public void setTitle (String t) {
		this.title = t;
	}
	
	public int getSize () {
		int s = this.size;
		return s;
	}
	
	public String getTitle () {
		String t = this.title;
		return t;
	}

}
