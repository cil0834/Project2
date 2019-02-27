/**
 * Project 2
 *
 * Abstract class that extends to MesoInherit
 *
 * @author Caleb 
 * @version 2019-02-26
 */
public abstract class MesoAbstract 
{
   //TODO	
	/**
	 * 
	 */
	protected String mesoString;
	
	MesoAbstract (MesoStation a)
	{
		this.mesoString = a.getStID();
	}
	
	/**
	 * A class that calculates various average ascii values. 
	 * 
	 * @return an array that holds the ceiling of the average of the String characters of the string in the first 
	 * index. 
	 * The floor of the average of the String characters in the second index
	 * The average of the characters based on the String. If the decimal of the average is .5 the average 
	 * rounds up, but if the decimal of the average rounds down the average rounds down.
	 */
	public abstract int[] calAverage();
	/**
	 * A class that the aaverage character of the string. The method takes in a string and it then computes
	 * the average ascii value. If the ascii value average has a decimal the is .5 or greater it rounds up
	 * and if the decimal is less than .5 the average rounds down. The method then takes the average and finds
	 * the chracter that equals said ascii value and returns it
	 * 
	 * @return a character that is the average character of the String based on the ascii value
	 */
	public abstract char letterAverage();
}
