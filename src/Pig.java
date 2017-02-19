
public class Pig extends Animal {
	
	 public static int boarRatio = 10;
	 public static int amoutSold = 40;
	 private int sowOffSpring = randomNumber(4, 12);
	 private int weight = randomNumber(70,100);
	 public static double pricePerKg = 1.41;
	 private boolean isBoar = false;
	 public static int pigCount = 0;
	
	 public Pig() {
		pigCount++;
			if(pigCount%boarRatio ==0)
			{
				pigCount++;
				this.isBoar = true;
				this.sowOffSpring = 0;
			}
			else
			{
				this.sowOffSpring = randomNumber(1,4);
			}
	 }
	 

	public int getSowOffSpring() {
		return sowOffSpring;
	}

	public void setSowOffSpring(int sowOffSpring) {
		this.sowOffSpring = sowOffSpring;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public boolean isBoar() {
		return isBoar;
	}

	public void setBoar(boolean isBoar) {
		this.isBoar = isBoar;
	}
	
    public void addSowOffSpringToTotal(){
    	pigCount += this.sowOffSpring;
    }
    
    public double getValue(){
    	return this.weight * pricePerKg;
    }
	
	@Override
	
	public String toString(){
		String s = "";
		s+= "sowOffSpring : " + this.getSowOffSpring();
		s+= "\nBoar : " + (this.isBoar() ? "Y" : "N");
		s+= "\nweight : " + this.getWeight();
		return s;
	}

	
 }	
