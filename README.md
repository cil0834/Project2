# Project2
Documentation

I need to make two classes. 

1. The MesoAbstract class is going to create two abstract abstract methods. 
   This class is also going to have a protect variable named MesoString.
   
   a. In the constructor of the MesoString I am going to initialize MesoString with the string that is going to be be looked at
      the way in which I will do this is I will pass a MesoStation object as the arguement for the arguement. 
      I will then set this.MesoString String equal to the getStID method.
      
   b. The class will then have the calAverage abstract class which will find the three different averages of the ascii values.
      Because average is going to be a double the method will return an array that holds the three different averages
      One average will be the ceiling of the average. This average will be in the 0 index of the array.
      One average will be the ceiling of the average. This average will be in the 1 index of the array.
      One average will be the ceiling if the decimal of the ascii average double is greater than 0.5 otherwise it is the floor.
      
   c. The other method in the abstract class is called letterAverage. This method looks at the average ascii value of the letters
      in the string and it returns a character that is equal to the average ascii value of the characters of the string.
      The way the average ascii value is determined is similar to the way in which the 2 index of the array in calAverage is determined.
      That is, if the ascii double average has a decimal of 0.5 or greter the ceiling is taken. Otherwise, the floor is taken.
      Once the ascii value is determined the method then casts the int to a character and returns the character.
      
2. The MesoInherit class is going to actually implement the abstract methods.
