

public class Exercise01_12 {
   /* This program displays the solution to the following exercise:
       
   
    Problem 1.12
    "Assume that a runner runs 24 miles in 1 hour, 40 minutes, and 35seconds. 
        Write a program that displays the average speed in kilometers per hour. 
        (Note 1 mile is equal to 1.6 kilometers.)"

     --Written by Adrian Daniel with autofill on VS Code--
   */
    public static void main(String[] args) {
        
        
        // 1 mile = 1.6 km   -- not the real conversion but it was given in the problem
        // 1 hour = 60 minutes 
        // 1 minute = 60 seconds
        // 1 hour = 3600 seconds
       
        //distance given in miles then converted to km
       double  mi = 24;
       double  km = mi * 1.6;

       //time given in hours, minutes, and seconds then converted to hours
       double secondsRan = 35;
       double minutesRan = 40;
       double hoursRan = 1;
       
       double totalHoursRan = hoursRan + (minutesRan / 60) + (secondsRan / 3600);
       
       float kmPerHour = (float)(km / totalHoursRan); // final answer with float for readability

       System.out.println("The runner's average speed in kilometers per hour is about: " + kmPerHour + " km/h");
     
       
    }
}     