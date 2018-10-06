//I pledge my Honor that I have not cheated, and will not cheat, on this assignment._Si Dang

//Goals of this program is to know how swicth statement works.
import java.util.Scanner; //For input values

public class ChineseZodiac
{
   public static void main(String[] args)
   {
   
   //Setup input objects
      Scanner input = new Scanner(System.in);
   
   //Variable to store
      int years, zodiac;
      
   //Input values
      System.out.print("Enter a year: ");
      years = input.nextInt();
      
   //Calculation
      zodiac = years%12;
      
   //Swicth statement
      switch (zodiac){
      case 0:
         System.out.println("The year " + years + " is the year of the mondey");
         break; //use break to stop switch statement when the conditon and case are same
      case 1:
         System.out.println("The year " + years + " is the year of the rooster");
         break;
      case 2:
         System.out.println("The year " + years + " is the year of the dog");
         break;
      case 3:
         System.out.println("The year " + years + " is the year of the pig");
         break;
      case 4:
         System.out.println("The year " + years + " is the year of the rat");
         break;
      case 5:
         System.out.println("The year " + years + " is the year of the ox");
         break;
      case 6:
         System.out.println("The year " + years + " is the year of the tiger");
         break;
      case 7:
         System.out.println("The year " + years + " is the year of the rabbit");
         break;
      case 8:
         System.out.println("The year " + years + " is the year of the dragon");
         break;
      case 9:
         System.out.println("The year " + years + " is the year of the snake");
         break;
      case 10:
         System.out.println("The year " + years + " is the year of the horse");
         break;
      case 11:
         System.out.println("The year " + years + " is the year of the sheep");
         break;
}}}

         

      