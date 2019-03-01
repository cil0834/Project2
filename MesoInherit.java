//TODO
public class MesoInherit extends MesoAbstract
{	
	MesoInherit(MesoStation a)
	{
		super(a);
	}
	
	@Override
	/**
	 * The calAverage takes the mesoString and puts it into a new string. 
	 * Each of the string's character's ascii values are then added an array 
	 * The array's values are then averaged in various ways, such as ceiling, floor and a general average
	 * 
	 * @return An array that contains various averages of the the ascii values of the string.
	 * 		   int[0] contains the ceiling of the average
	 * 		   int[1] contains the floor of the average
	 * 		   int[2] contains the floor (if the decimal is > 0.5) or the ceiling otherwise
	 */
	public int[] calAverage() {
		// TODO Auto-generated method stub
		//a string to store the string that is being parsed
		String ID = mesoString;
		//create an array that will hold the average, floor, and ceiling of the string ID.
		int[] characterAverages = new int[3];
		//the each index of the characterID array list represents a character in the ID string
		double[] asciiCharacterValue = new double[4];
		//create a for loop to find the ascii value of each character of the ID string and add it
		//to the asciiCharacterValue array
		for(int index = 0; index < asciiCharacterValue.length; ++index)
		{
			//cast the character to an int and add it to the asciiCharacterValue array
			asciiCharacterValue[index] = (int)ID.charAt(index);
		}
		
		//create a variable to hold the total value
		double totalValue = 0;
		//calculate the average of the values
		for (int count = 0; count < asciiCharacterValue.length; ++count)
		{
			totalValue = totalValue + asciiCharacterValue[count];
		}
		
		//compute the average
		double average = totalValue / asciiCharacterValue.length;
		
		//create a for loop to find the averages
		for (int i = 0; i < characterAverages.length; ++ i)
		{
			//assign decide whether the average should be rounded up or down
			if (i == 0)
			{
				characterAverages[0] = (int)Math.ceil(average);
			}
			//assign the ceiling to the second index
			if (i == 1)
			{
				characterAverages[1] = (int)Math.floor(average);
			}
			//assign the floor to the third index
			if (i == 2)
			{
				//if the average has a decimal of 0.5 or greater round up
				if ((Math.ceil(average)-average) <= 0.5)
				{
					 characterAverages[2] = (int)Math.ceil(average);
				}
				//if the average has a decimal less than 0.5 round down
				else 
				{
					characterAverages[2] = (int)Math.floor(average);
				}
			}
		
		}
		
		//return the chracterAverages array
		return characterAverages;
	}

	@Override
	public char letterAverage() {
		// TODO Auto-generated method stub
		//a string to store the string that is being parsed
				String ID = mesoString;
				//the each index of the characterID array list represents a character in the ID string
				int characterAverage = 0;
				double[] asciiCharacterValue = new double[4];
				//create a for loop to find the ascii value of each character of the ID string and add it
				//to the asciiValue array
				for(int index = 0; index < asciiCharacterValue.length; ++index)
				{
					asciiCharacterValue[index] = (int)ID.charAt(index);
				}
						
				//create a variable to hold the total value
				double totalValue = 0;
				//calculate the average of the values
				for (int count = 0; count < asciiCharacterValue.length; ++count)
				{
					totalValue = totalValue + asciiCharacterValue[count];
				}
						
				//compute the average
				double average = totalValue / asciiCharacterValue.length;
				
				//if the average has a decimal of 0.5 or greater round up
				if ((Math.ceil(average)-average) <= 0.5)
				{
					 characterAverage = (int)Math.ceil(average);
				}
				//if the average has a decimal less than 0.5 round down
				else 
				{
					characterAverage = (int)Math.floor(average);
				}
						
				//make the average into a character
				char averageCharacter = (char)characterAverage;
				return averageCharacter;
	}	
}


	/*public int[] calAverage(MesoStation stID)
	{
		//a string to store the string that is being parsed
		String ID = stID.getStID();
		//create an array that will hold the average, floor, and ceiling of the string ID.
		int[] characterAverages = new int[3];
		//the each index of the characterID array list represents a character in the ID string
		double[] asciiCharacterValue = new double[4];
		//create a for loop to find the ascii value of each character of the ID string and add it
		//to the asciiValue array
		for(int index = 0; index < asciiCharacterValue.length; ++index)
		{
			asciiCharacterValue[index] = (int)ID.charAt(index);
		}
		
		//create a variable to hold the total value
		double totalValue = 0;
		//calculate the average of the values
		for (int count = 0; count < asciiCharacterValue.length; ++count)
		{
			totalValue = asciiCharacterValue[count];
		}
		
		//compute the average
		double average = totalValue / asciiCharacterValue.length;
		
		//create a for loop to find the averages
		for (int i = 0; i < characterAverages.length; ++ i)
		{
			//assign decide whether the average should be rounded up or down
			if (i == 0)
			{
				//if the average has a decimal of 0.5 or greater round up
				if ((Math.ceil(average)-average) <= 0.5)
				{
					 characterAverages[0] = (int)Math.ceil(average);
				}
				//if the average has a decimal less than 0.5 round down
				else 
				{
					characterAverages[0] = (int)Math.floor(average);
				}
			}
			//assign the ceiling to hte second index
			if (i == 1)
			{
				characterAverages[1] = (int)Math.ceil(average);
			}
			//assign the floor to the third index
			if (i == 2)
			{
				characterAverages[2] = (int)Math.floor(average);
			}
		
		}
		
		//return the chracterAverages array
		return characterAverages;
	}
	
	public char letterAverage(MesoStation stID)
	{
		//a string to store the string that is being parsed
		String ID = stID.getStID();
		//the each index of the characterID array list represents a character in the ID string
		int characterAverage = 0;
		double[] asciiCharacterValue = new double[4];
		//create a for loop to find the ascii value of each character of the ID string and add it
		//to the asciiValue array
		for(int index = 0; index < asciiCharacterValue.length; ++index)
		{
			asciiCharacterValue[index] = (int)ID.charAt(index);
		}
				
		//create a variable to hold the total value
		double totalValue = 0;
		//calculate the average of the values
		for (int count = 0; count < asciiCharacterValue.length; ++count)
		{
			totalValue = asciiCharacterValue[count];
		}
				
		//compute the average
		double average = totalValue / asciiCharacterValue.length;
		
		//if the average has a decimal of 0.5 or greater round up
		if ((Math.ceil(average)-average) <= 0.5)
		{
			 characterAverage = (int)Math.ceil(average);
		}
		//if the average has a decimal less than 0.5 round down
		else 
		{
			characterAverage = (int)Math.floor(average);
		}
				
		//make the average into a character
		char averageCharacter = (char)characterAverage;
		return averageCharacter;
	}
}
*/