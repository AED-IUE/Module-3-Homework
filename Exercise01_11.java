

public class Exercise01_11 {
   /* This program displays the solution to the following exercise:
   
    Problem 1.11
    "The U.S. Census Bureau projects population based on the following assumptions
        * One birth every 7 seconds
        * One death every 13 seconds   
        * One new international migration every 45 seconds
    Write a program to display the population for each of the next five years. Assume that the
        current population is 312,032,486, and one year has 365 days. Hint: In Java, if two integers
        perform division, the result is an integer. The fractional part is truncated. For example, 5 /
        4 is 1 (not 1.25) and 10 / 4 is 2 (not 2.5). To get an accurate result with the fractional
        part, one of the values involved in the division must be a number with a decimal point. For
        example, 5.0 / 4 is 1.25 and 10 / 4.0 is 2.5.
     
     
        --Written by Adrian Daniel with autofill on VS Code--
   */
    public static void main(String[] args) {
        
        //Initial population
        int populationStart = 312032486;
        int currentYear = 2025; 
        System.out.println("Given the current population in " + currentYear + "is " + populationStart + ", we can project the population for the next five years.");

        //Seconds in a year
        int YearInSeconds = 365 * 24 * 60 * 60;
        
        //Births, deaths, and migrations in a year
        double birthsPerYear = YearInSeconds / 7;
        double deathsPerYear = YearInSeconds / 13;
        double migrationsPerYear = YearInSeconds / 45;
        
        //Population change in a year
        double populationChangeInYear = birthsPerYear - deathsPerYear + migrationsPerYear;
        
        //Display the population for each of the next five years
        System.out.println("Below is the projected population for the five years following " + currentYear + " :");
        
        int newYear = currentYear + 1;
        double newPopulation = populationStart + populationChangeInYear;
        System.out.println("Population for " + newYear + " is about: " + (int)newPopulation);

        newYear += 1; 
        newPopulation += populationChangeInYear;
        System.out.println("Population for " + newYear + " is about: " + (int)newPopulation);
        
        newYear += 1; 
        newPopulation += populationChangeInYear;
        System.out.println("Population for " + newYear + " is about: " + (int)newPopulation);  

        newYear += 1; 
        newPopulation += populationChangeInYear;
        System.out.println("Population for " + newYear + " is about: " + (int)newPopulation);  

        newYear += 1; 
        newPopulation += populationChangeInYear;
        System.out.println("Population for " + newYear + " is about: " + (int)newPopulation);  
 

       
    }
}     