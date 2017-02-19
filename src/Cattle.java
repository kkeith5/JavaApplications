
public class Cattle extends Animal {
	private int gallonsPerDay = randomNumber(9, 13);
	public static double pricePerGalon = 3.82;
	private double weight = randomNumber(680,740);
	public static double pricePerKg = 3.50;
	
	public int getGallonsPerDay()
	{
		return this.gallonsPerDay;
	}
	public void setGallonsPerDay(int val)
	{
		this.gallonsPerDay = val;
	}
	public double getWeight()
	{
		return this.weight;
	}
	public void setWeight(double val)
	{
		this.weight = val;
	}
	
	public Cattle()
	{
		
	}
	

	//CALC METHODS
	public int milkPerYear()
	{
		return this.getGallonsPerDay() * 365;
	}	
	public double getValueMilk()
	{
		return this.milkPerYear() * this.pricePerGalon;
	}
	
	public void newYear()
	{
		this.setGallonsPerDay(randomNumber(9, 13));
	}
	public double getValue()
	{
		return this.weight * pricePerKg;
	}
	
	@Override
	public String toString() 
	{
		String s = "";
		s+= "Gallons Per Day : " + this.getGallonsPerDay();
		s+= "\nWeight : " + this.getWeight();
		return s;
	}
	
}
