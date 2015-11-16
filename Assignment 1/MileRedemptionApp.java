/****************************************************************
 Name: William Dew
 
 Program: 1
 
 Due Date: 6/30/2014
 
 Note: this program does no input validity checking. This part of
 the program contains the main() method, which contains the loop for
 user interaction. The main() method gets the command line arguments.
 
 Addtional Note: This is the driver program.
*****************************************************************/
import java.io.*;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Arrays;
import java.util.ArrayList

public class MileRedemptionApp
{
  public static void main(String[] args) throws IOException //Throwing an exception
  {
    String s;   //initializes the user input variable for the yes or no character input
    
    int mi, mo; //initializes the user input variables for months and miles
    
    while(args.length > 0)
    {
    
      //initial prompt
    
      System.out.println("---------------------------------------------");
    
      System.out.println("List of destination cities you can travel to:");
    
      System.out.println("Hyderbad");
    
      System.out.println("New York");
    
      System.out.println("Paris");
    
      System.out.println("Sidney");
    
      System.out.println("---------------------------------------------");
    
    
      Scanner fileScan; //initializes fileScan
    
      if(args.length > 0)
      {
        Scanner fileScan = new Scanner(new File(args[0])); //condition if the argument is greater than zero, we initiate the file scan
      }
      try
      {
        Scanner fileScan = new Scanner(new File("miles.txt")); //scans for the file for the assignment
      }
      
      catch(Exception e)
      {
        //Exception handling statement when the program cannot access the file
        System.out.print("Could not find miles.txt file!");
        System.exit(0);
      }
      
      MileRedeemer m = new MileRedeemer(); //initiates a variable for the class MileRedeemer and its subclasses
                                            
      m.readDestination(fileScan); //reads the destination data
     
      System.out.println("Please input your total accumulated miles: ");  //Asks user for total miles
      mi = fileScan.nextInt(); //user input for total miles
      
      System.out.println("Please input your month of departure (1-12): ");  //Asks user for the month of departure
      mo = fileScan.nextInt(); //user input for the month of departure
      
      System.out.println("Your accumulated miles can be used to redeem the following tickets:\n\n");
      
      System.out.println("\n* A trip to" + m.getCityNames() + ", " + m.redeemMiles()); //Prompt for printing the eligibility
     
      //Remaining miles
      System.out.println("Your remaining miles: " + m.remainingMiles()) //Prints out the remaining miles
      
      try
      {
        System.out.println("Do you want to continue (y/n)?  ");  //Asks user whether or not to continue
        s = fileScan.next();
        if(s = "y" && s = "Y")
          fileScan.nextLine();
      }
      catch(Exception e)
      {
        //Exception handling statement when the user enters an incorrect character
        System.out.print("Exception occured during character mismatch! Please try again.");
        System.exit(0);
      }
   }
  }
}


  
 
  
 
  
  
  