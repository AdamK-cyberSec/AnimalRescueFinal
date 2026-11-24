/**
 * 
 */
package AnimalRescueFinal;

/**
 * 
 */
public class Project02AnimalRescue
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Animal rex = new Animal("Rex", "Dog", 23.50, 2.5);

		System.out.println(rex.getName());
		System.out.println(rex.getSpecies());
		System.out.println(rex.getWeight());
		System.out.println(rex.getDailyFood());
		System.out.println(rex.weeklyFoodCalc());
		System.out.println(rex.weightCategoryLoop());

	}

}

class Animal
{
	// private variables for the needs of the animal constructor in class.
	private String name;
	private String species;
	private double weight = 0;
	private double dailyFood = 0;

	Animal(String name, String species, double weight, double dailyFood)
	{
		this.name = name;
		this.species = species;
		this.weight = weight;
		this.dailyFood = dailyFood;

	}

	String getName()
	{
		return name;
	}

	String getSpecies()
	{
		return species;
	}

	double getWeight()
	{
		return weight;
	}

	double getDailyFood()
	{
		return dailyFood;
	}

	public double weeklyFoodCalc()
	{

		double weeklyFood = dailyFood * 7;
		return weeklyFood;

	}

	public String weightCategoryLoop()
	{

		String weightCategory;
		if (weight < 20)
		{
			weightCategory = "Small";
		} else if (weight >= 20 && weight < 50)
		{
			weightCategory = "Medium";
		} else if (weight >= 50 && weight < 100)
		{
			weightCategory = "Large";
		} else
		{
			weightCategory = "Extra Large";
		}

		return weightCategory;

	}
}
