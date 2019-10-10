import java.util.Scanner;
public class TripCalculator
{

	public static void main(String[] args) 
	{
		double distance, mpg, gasPrice;
		
		Scanner scn = new Scanner(System.in);
		
		System.out.print("How many miles will you be driving?");
		
		distance = scn.nextDouble();
		
		System.out.print("Enter your vehicles average miles per gallon (mpg):");
		
		mpg = scn.nextDouble();
		
		System.out.print("Enter the cost of one gallon of gas:");
		
		gasPrice = scn.nextDouble();
		
		System.out.println("Cost of the commute:" +(distance / mpg * gasPrice));
	}
}