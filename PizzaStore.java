import java.util.Scanner;
//Raymond Adams
//Project 4
//This class will prompt user to create a pizza order
public class PizzaStore extends PizzaOrder{
	public static void main(String[] args){
		
				

		Scanner keyboard = new Scanner(System.in);
		PizzaOrder order = new PizzaOrder();

		//pizza amount
		System.out.println("Welcome to our Pizza store.");
		String another = "Y";
		while(another.equalsIgnoreCase("y")){
		
		System.out.println("How many pizza's would you like to order?: ");
		order.setNumPizzas(keyboard.nextInt());
		//int amount = keyboard.nextInt();
		
		//Size of pizza 1
		System.out.println("Size of pizza 1 (1: small, 2: medium, 3: large): ");
		int size1 = keyboard.nextInt();
		
		while(size1 != 1 && size1 != 2 && size1 != 3){
			System.out.println("Invalid value. 1: small, 2: medium, 3: large");
			size1 = keyboard.nextInt();
		}
		
		//Number of pizza toppings
		System.out.println("Number of toppings for pizza 1: ");
		int top1 = keyboard.nextInt();
		
		//Sauce or no sauce
		System.out.println("Extra sauce for pizza 1: (true/false)");
		boolean sauce1 = keyboard.nextBoolean();
		order.setPizza1(new Pizza(size1, top1, sauce1));
		
		if(order.numPizzas == 2){
			//Size of pizza 2
			System.out.println("Size of pizza 2 (1: small, 2: medium, 3: large):)");
			int size2 = keyboard.nextInt();
			
			while(size2 != 1 && size2 != 2 && size2 != 3){
				System.out.println("Invalid value. 1: small, 2: medium, 3: large");
				size2 = keyboard.nextInt();
			}
			//Number of pizza toppings
			System.out.println("Number of toppings for pizza 2: ");
			int top2 = keyboard.nextInt();
			
			System.out.println("Extra sauce for pizza 2: (true/false)");
			boolean sauce2 = keyboard.nextBoolean();
			order.setPizza2(new Pizza(size2, top2, sauce2));
		}
		
		if(order.numPizzas == 3){
			
			//Size of pizza 2
			System.out.println("Size of pizza 2 (1: small, 2: medium, 3: large):)");
			int size2 = keyboard.nextInt();
			
			while(size2 != 1 && size2 != 2 && size2 != 3){
				System.out.println("Invalid value. 1: small, 2: medium, 3: large");
				size2 = keyboard.nextInt();
			}
			//Number of pizza toppings
			System.out.println("Number of toppings for pizza 2: ");
			int top2 = keyboard.nextInt();
			
			System.out.println("Extra sauce for pizza 2: (true/false)");
			boolean sauce2 = keyboard.nextBoolean();
			order.setPizza2(new Pizza(size2, top2, sauce2));
			
			//Size of pizza 3
			System.out.println("Size of pizza 3 (1: small, 2: medium, 3: large):)");
			int size3 = keyboard.nextInt();
			
			while(size3 != 1 && size3 != 2 && size3 != 3){
				System.out.println("Invalid value. 1: small, 2: medium, 3: large");
				size3 = keyboard.nextInt();
			}
			//Number of pizza toppings
			System.out.println("Number of toppings for pizza 3: ");
			int top3 = keyboard.nextInt();
			
			System.out.println("Extra sauce for pizza 3: (true/false)");
			boolean sauce3 = keyboard.nextBoolean();
			order.setPizza2(new Pizza(size3, top3, sauce3));
		}
		//Summary order
		System.out.println("Summary of your order:");
		//if statements for if it the numPizzas = 1, 2, or 3
		if(order.numPizzas == 1){
		System.out.println("Pizza 1: " + order.pizza1.toString());
		System.out.println("Total cost: " + order.calcTotal());
		}
		if(order.numPizzas == 2){
			System.out.println("Pizza 1: " + order.pizza1.toString());
			System.out.println("Pizza 2: " + order.pizza2.toString());
			System.out.println("Total cost: " + order.calcTotal());
		}
		if(order.numPizzas == 3){
			System.out.println("Pizza 1: " + order.pizza1.toString());
			System.out.println("Pizza 2: " + order.pizza2.toString());
			System.out.println("Pizza 3: " + order.pizza3.toString());
			System.out.println("Total cost: " + order.calcTotal());
		}
		//if user would like to place a new order then repeat the process
		System.out.println("Thank you for your order. PrESS y/Y to make another");
		System.out.println("order, any other key to exit:");
		another = keyboard.next();
		
		}
		System.out.println("Thank you, Goodbye");
	}

			
}



	

