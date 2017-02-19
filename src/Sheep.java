
public class Sheep extends Animal {
	public static int ramRatio = 30;
	public static int ramCount = 0;
	public static int sheepCount = 0;
	private boolean isRam = false ;
	private int offsprings = 0;
	private int weight = randomNumber(45,100);
	public static double pricePerKg = 1.20;
	
	public boolean getIsRam()
	{
		return this.isRam;
	}
	public void setIsRam(boolean val)
	{
		this.isRam = val;
	}
	private int getOffsprings()
	{
		return this.offsprings;
	}
	private void setOffsprings(int offsprings)
	{
		this.offsprings = offsprings;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public Sheep()
	{
		sheepCount++;
		if(sheepCount%ramRatio ==0)
		{
			ramCount++;
			this.isRam = true;
			this.offsprings = 0;
		}
		else
		{
			this.offsprings = randomNumber(1,4);
		}
	}
	
	public void addOffspiringsToTotal()
	{
		sheepCount += this.offsprings;
	}
	
	public double getValue()
	{
		double val = this.weight * pricePerKg;
		return val;
	}
	
	@Override
	public String toString()
	{
		String s = "";
		s+= "Offsprings : " + this.getOffsprings();
		s+= "\nRam : " + (this.getIsRam() ? "Y" : "N");
		s+= "\nWeight : " + this.getWeight();
		return s;
	}
	
	
}

