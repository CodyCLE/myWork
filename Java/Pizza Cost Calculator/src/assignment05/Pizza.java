package assignment05;

public class Pizza {

    private String pizzaSize;
    private int cheese;
    private int pepperoni;
    private int bacon;

    public Pizza()
    {
        this.pizzaSize = "";
        this.cheese = 0;
        this.pepperoni = 0;
        this.bacon = 0;
    }
    
    public Pizza(String pizzaSize, int cheese, int pepperoni, int bacon)
    {
        this.pizzaSize = pizzaSize;
        this.cheese = cheese;
        this.pepperoni = pepperoni;
        this.bacon = bacon;
    }
    
    public String getPizzaSize()
    {
        return pizzaSize;
    }

    public void setPizzaSize(String pizzaSize)
    {
        this.pizzaSize = pizzaSize;
    }

    public int getNumCheeseToppings()
    {
        return cheese;
    }

    public void setNumCheeseToppings(int cheese)
    {
        this.cheese = cheese;
    }

    public int getNumPepperoniToppings()
    {
        return pepperoni;
    }

    public void setNumPepperoniToppings(int pepperoni)
    {
        this.pepperoni = pepperoni;
    }

    public int getNumHmaToppings()
    {
        return bacon;
    }

    public void setNumHmaToppings(int bacon)
    {
        this.bacon = bacon;
    }

	public double calcCost()
	{		
		if(pizzaSize.equalsIgnoreCase("Small")){
			return 10 + (cheese + pepperoni + bacon) * 2;}
		else if(pizzaSize.equalsIgnoreCase("Medium")){
			return 12 + (cheese + pepperoni + bacon) * 2;}
		else if(pizzaSize.equalsIgnoreCase("Large")){
			return 14 + (cheese + pepperoni + bacon) * 2;}
		else{
			return 0.0;}
	}

	public String getDescription()
	{
		return "Pizza Size: " + pizzaSize + "\n Number of Cheese toppings: " + cheese + 
                        "\n Number of Pepperoni toppings: " + pepperoni + "\n Number of Bacon toppings: " + 
                        bacon + "\n TOTAL COST: $" + calcCost() + "\n";
        }
}
