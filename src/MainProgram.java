
public class MainProgram {

	static double remainingValue = 0;
	
	public static void main(String[] args) {
		Pig[] pigArr = new Pig[50];
		Sheep[] shArr = new Sheep[120];
		Chicken[] chkArr = new Chicken[1000];
		Cattle[] cattArr = new Cattle[50];
		double totalIncome = 0;
		
		for(int i = 0 ;i<50; i++){
			pigArr[i] = new Pig();
			pigArr[i].addSowOffSpringToTotal();

		}
		for(int i = 0; i<120; i++)
		{
			shArr[i] = new Sheep();
			shArr[i].addOffspiringsToTotal();
		}	
		for(int i = 0; i<1000;i++)
		{
			chkArr[i] = new Chicken();
		}
		
		for(int i = 0; i<50; i++)
		{
			cattArr[i] = new Cattle();
		}
		
		totalIncome += chickenIncome(chkArr);
		totalIncome += cattleIncome(cattArr);
		totalIncome += sheepIncome(shArr);
		totalIncome += pigIncome(pigArr);
		System.out.println("CHICKEN");
		System.out.println("Price Per Egg : " + Chicken.pricePerEgg);
		System.out.println("Price Per Kg : " + Chicken.pricePerKg);
		System.out.println("===================================");
		System.out.println("CATTLE");
		System.out.println("Price per Galon of milk : " + Cattle.pricePerGalon);
		System.out.println("Price Per Kg : " + Cattle.pricePerKg);
		System.out.println("===================================");
		System.out.println("SHEEP");
		System.out.println("Price Per Kg : " + Sheep.pricePerKg);
		System.out.println("===================================");
		System.out.println("PIG");
		System.out.println("Price Per Kg : " + Pig.pricePerKg);
		
		System.out.println();
		System.out.println("FARM");
		System.out.println("Total Income : " + Animal.roundToDecimal(totalIncome,2) + " euro ");
		System.out.println("Remaining Stock Value " + Animal.roundToDecimal(remainingValue,2) + " euros ");
	
	}
	
	public static double chickenIncome(Chicken[] chkArr)
	{
		double totalIncome = 0;
		int count = 0;
		for(Chicken c : chkArr)
		{
			totalIncome += c.getValueOfEggs();
			if(count < chkArr.length/2)
			{
				totalIncome += c.getValue();
		
			}
			remainingValue += c.getValue();
			count++;
		}
		
		return Animal.roundToDecimal(totalIncome,2);
	}
	public static double cattleIncome(Cattle[] cattArr)
	{
		double totalIncome = 0;

		for(Cattle c : cattArr)
		{
			totalIncome+= c.getValueMilk();
			remainingValue += c.getValue();
		}
		
		return Animal.roundToDecimal(totalIncome,2);
	}
	public static double sheepIncome(Sheep[] sheepArr)
	{
		double totalIncome = 0;
		int countSold = 0;

		for(Sheep s : sheepArr)
		{
			if(!s.getIsRam())
			{
				if(countSold <sheepArr.length/2)
				{
					totalIncome+= s.getValue();
					countSold++;
				}
				else
				{
					remainingValue += s.getValue();
				}
			}
		}
		
		return Animal.roundToDecimal(totalIncome,2);	
	}
	public static double pigIncome(Pig[] pigArr)
	{
		double totalIncome = 0;
		int countSold = 0;

		for(Pig p : pigArr)
		{
			if(!p.isBoar())
			{
				if(countSold < 40)
				{
					totalIncome+= p.getValue();
					countSold++;
				}
				else
				{
					remainingValue += p.getValue();
				}
			}
		}
		
		return Animal.roundToDecimal(totalIncome,2);	
	}
	
}

