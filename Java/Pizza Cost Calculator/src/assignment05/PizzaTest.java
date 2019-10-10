package assignment05;

public class PizzaTest
{
	public static void main(String[] args)
	{
		Pizza p1 = new Pizza("Small", 1, 2, 3); // small pizza test

		Pizza p2 = new Pizza("Medium", 1, 2, 2); // medium pizza test

		Pizza p3 = new Pizza("Large", 3, 2, 1); // large pizza test

		System.out.println("WELCOME TO CLEVELAND PIZZA! \n - Small Pizza = $10 \n - Medium Pizza = $12 \n - Large Pizza = $14 \n - $2 per Topping \n");
		System.out.println(p1.getDescription());
		System.out.println(p2.getDescription());
		System.out.println(p3.getDescription());
	}
}
