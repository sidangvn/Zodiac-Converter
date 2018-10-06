//I pledge my Honor that I have not cheated, and will not cheat, on this assignment._Si Dang

//Goals of this program are to know how while loop works with invalid condition and update statement works 

import java.util.Scanner; //For input values

public class TravelingSong
{
   public static void main(String[] args)
   {
   
   //Set up input
   Scanner input = new Scanner(System.in);
   
   //Variable to store
   int a, b = 100; 
      
   //Input values to store
   System.out.print("How many verses (1 to 100)? ");
   a = input.nextInt();
   
   //perform input validation
   while (a <= 0 || a > 100)
      {
         System.out.print("How many verses (1 to 100)? ");     
      a = input.nextInt();
      }
   //Adjust the verses for each iteration 
   while ((100- a) < b)
     {
     System.out.println("\n" +b + " bottles of beer on the wall.\n" +
                        b + " bottles of beer.\n" +
                        "If one of those bottles should happen to fall\n" +
                        (b-1)+" bottles of beer on the wall.\n");
                        b--;
                        }}}
   
   