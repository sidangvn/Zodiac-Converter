//I pledge my Honor that I have not cheated, and will not cheat, on this assignment._Si Dang

//Goals of this program are to know how to use qualsIgnorEcase and logical operators
import java.util.Scanner; //For input values

public class Fusion
{
   public static void main(String[] args)
   {
   
   //Set up input object
   Scanner input = new Scanner(System.in);
   
   //Variable to store
   String f, s;
   String Garnet ="Garnet", Pearl="Pearl", Amethyst="Amethyst", Steven="Steven", Connie="Connie";
   
   //Input objects
   System.out.print("Who is the first gem? ");
   f = input.nextLine();
   System.out.print("Who is the second gem? ");
   s = input.nextLine();
   
   //if else if statement
   if ((Garnet.equalsIgnoreCase(f)&& Pearl.equalsIgnoreCase(s)) || (Pearl.equalsIgnoreCase(f) && Garnet.equalsIgnoreCase(s)))
      System.out.println("\nWhen " + f +" and " + s + " fuse, they create Sardonyx.");
      else if((Garnet.equalsIgnoreCase(f)&& Amethyst.equalsIgnoreCase(s)) || (Amethyst.equalsIgnoreCase(f) && Garnet.equalsIgnoreCase(s)))
         System.out.println("\nWhen " + f +" and " + s + " fuse, they create Sugilite.");
         else if((Pearl.equalsIgnoreCase(f)&& Amethyst.equalsIgnoreCase(s)) || (Amethyst.equalsIgnoreCase(f) && Pearl.equalsIgnoreCase(s)))
            System.out.println("\nWhen " + f +" and " + s + " fuse, they create Opal.");
            else if((Steven.equalsIgnoreCase(f)&& Amethyst.equalsIgnoreCase(s)) || (Amethyst.equalsIgnoreCase(f) && Steven.equalsIgnoreCase(s)))
               System.out.println("\nWhen " + f +" and " + s + " fuse, they create Smoky Quartz.");
               else if((Connie.equalsIgnoreCase(f)&& Steven.equalsIgnoreCase(s)) || (Steven.equalsIgnoreCase(f) && Connie.equalsIgnoreCase(s)))
                   System.out.println("\nWhen " + f +" and " + s + " fuse, they create Stevonnie.");
                   else
                   System.out.print("\nNo know fusion");//if input values are not matching with these conditions above, the program will move to this line then end the program.
                   }}

