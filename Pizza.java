//Raymond Adams
//Project 4
//this class will store information about a single pizza
import java.util.Scanner;
public class Pizza {
	//Private instance variables that store the size of the pizza, number of toppings, and sauce or no sauce
	private  int size;
	private  int top;
	private  boolean sauce;
	private int cost;
	private int totalCost;
	



	//A constructor that set all of the instance variables and the default constructor 
	public Pizza(int s ,int tp, boolean c){
		this.size = s;
		this.top = tp;
		this.sauce = c;
	}
	
	public Pizza(){
		
	}
	
	//set method for small
	void setSize(int s){
		this.size = s;
	}
	//get method for small
	double getSize(){
		return size;
	}

	//set method for medium
	void setTop(int tp){
		this.top = tp;
	}
	//get method for medium
	double getTop(){
		return top;
	}

	//set method for medium
	void setSauce(boolean c){
		this.sauce = c;
	}
	//get method for medium
	boolean getSauce(){
		return sauce;
	}
	
	//this method will return a double that is the cost of the pizzae
	public double calcCost(){
		this.cost = 0;
		
		if(this.size == 1){
			this.cost += 10;
		}
		else if(this.size ==2){
			this.cost += 12;
		}
		else if(this.size == 3){
			this.cost += 14;
		}
		this.cost += (this.top*2); 
		if(this.sauce == true){
			this.cost++; 
		}
	
		return this.cost;
		

	}
	//method that returns a string containing the pizza size, number of topping's, the extra sauce status and the cost of the pizza
	public String toString(){
		String area = "";
		if(this.size == 1){
			area += "small";
		}else if(this.size == 2){
			area += "medium";
		}else if(this.size == 3){
			area += "large";
		}
		String sauce = "";
		if(this.sauce == true){
			sauce = "with extra sauce";
		}else{
			sauce = "no extra sauce";
		}
		String pizza = "";
		pizza +=  "size " + area + " with " + this.top + " toppings " + sauce + " $" + this.calcCost();
		return pizza;
	
} 
}





























