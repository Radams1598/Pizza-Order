//Raymond Adams 
//Project 4
//this class will allow up to three pizza's to be saved in an order
import java.util.Scanner;
public class PizzaOrder extends Pizza  {
Pizza pizza1, pizza2, pizza3;
int numPizzas;
	
	//method for pizza order
	public PizzaOrder(){
		this.pizza1 = new Pizza();
		this.pizza2 = new Pizza();
		this.pizza3 = new Pizza();
		numPizzas = 0;
	}
	//sets the number of pizzas in the order and will print an error message if its not between 1 and 3
	public void setNumPizzas(int p){
		if(((p != 1) && (p != 2) && (p != 3))){
			this.numPizzas = -1;
		}
		else{
			this.numPizzas = p;
		}
	}
	//sets the first pizza in the order
	public void setPizza1(Pizza p1){
		this.pizza1 = p1;
	}
	//sets the second pizza in the order
	public void setPizza2(Pizza p2){
		this.pizza2 = p2;
	}
	//sets the third pizza in the order
	public void setPizza3(Pizza p3){
		this.pizza3 = p3;
	}
	//Method that returns the total cost of the order
	public double calcTotal(){
		if(this.numPizzas == 1)
		return pizza1.calcCost();
		
	    if(this.numPizzas == 2)
	    return pizza1.calcCost() + pizza2.calcCost();
	    
	    if(this.numPizzas == 3)
	    return pizza1.calcCost() + pizza2.calcCost() + pizza3.calcCost();
	    
	    else{
	    	return 0;
	    }
	    

	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
	}}
