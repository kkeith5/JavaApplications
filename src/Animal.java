
import java.util.Random;

public class Animal {
	public int weight;
	public double pricePerKg;
	
	//UTIL METHODS
	public static double roundToDecimal(double val , int decimalPoint)
	{
		double decPow = Math.pow(10, decimalPoint);	
		double decimalToPoint = (double)(Math.round(val * decPow)) / decPow;	
		return decimalToPoint;
	}
	public static int randomNumber(int min, int max)
	{
		Random rand = new Random();
	    int randomNum = rand.nextInt((max - min) + 1) + min;
	    return randomNum;
	}
	public static double randomNumber(double min, double max)
	{
		Random rand = new Random();
		double randomNum = min + (max - min) * rand.nextDouble();
	    return randomNum;
	}
	
}

