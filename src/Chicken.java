
import java.util.Random;

public class Chicken extends Animal {
	//EGGS
	private int eggsPerDay = randomNumber(0,5);
	public static double pricePerEgg = roundToDecimal(randomNumber(0.08,0.12),2);
	//MEAT
	private double weight = roundToDecimal(randomNumber(1.9,2.5),2);
	public static final double pricePerKg = 0.99; 

	public Chicken()
	{
		
	}
	
	//GET SET
	public int getEggsPerDay()
	{
		return this.eggsPerDay;
	}
	public void setEggsPerDay(int val)
	{
		this.eggsPerDay = val;
	}
	public double getPricePerKilo()
	{
		return this.pricePerKg;
	}
	public double getWeight()
	{
		return this.weight;
	}
	public void setWeight(double val)
	{
		this.weight = val;
	}
	
	//CALC METHODS
	public int eggsPerYear()
	{
		return eggsPerDay * 365;
	}	
	
	public double getValueOfEggs()
	{
		return this.eggsPerYear() * pricePerEgg;
	}
	public void newYear()
	{
		this.setEggsPerDay(randomNumber(0,5));
	}
	
	public double getValue(){
		return this.weight * pricePerKg;
	}
	
	@Override
	public String toString() 
	{
		String s = "";
		s+= "Eggs Per Day : " + this.getEggsPerDay();
		s+= "\nWeight : " + this.getWeight();
		return s;
	}
	
}

