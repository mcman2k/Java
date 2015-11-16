/****************************************************************
 Name: William Dew
 
 Program: 1
 
 Due Date: 6/30/2014
 
 Note: this program does no input validity checking. This class
 carries the logic for redeeming mileage
 
 Additional Notes: MileRedeemer Class
*****************************************************************/
import java.io.*;
import java.util.Scanner;
import static java.lang.System.exit;
import java.util.Arrays;
import java.util.ArrayList;

public class MileRedeemer
{          
      private String[] destination; //initializes private instance of the String[] array destination
      private remainingMiles = 0; //initializes the private instance of remainingMiles to zero
     
//Subtasks
        
   /****************************************************************
   FUNCTION: readDestinations() 

   ARGUMENTS: fileScanner

   RETURNS: nothing

   NOTES: This method uses a Scanner object as the input parameter,
   and is also used to read and parse the destination data into an
   array of Destination objects, which are then sorted by their
   normal mileage.
   ****************************************************************/
       public void readDestinations(Scanner fileScanner) throws IOException
        {
          int i = 0, max, beginningMonth, endMonth; //declares arguments for months, index, and the max value read
                
          //Destination[] destinations = new Destination[20];
          
          //An arraylist is built for the lines to be parsed
          ArrayList<Destination> destinations = new ArrayList<Destination>();
          
          String[] parts, months; //declares the temporary arrays as part of the ArrayList
          
          while(fileScanner.hasNext())
          {
            destinations = fileScanner.nextLine();
            
            parts = destinations.split(";"); //Separates the values for each argument
            
            months = parts[4].split("-"); //separates the month dates into two separate arguments from the arraylist
            
            try
            {  
               //parsed array into separate arguments
                  destinations[i] = new Destination(parts[0], Integer.parseInt(parts[1]), 
                               Integer.parseInt(parts[2]), Integer.parseInt(parts[3]), 
                               Integer.parseInt(months[0]), Integer.parseInt(months[1])); 
               i++;      
            }
            catch(Exception e)
            {
              //Exception handling statement for an error if an element is unsuccessfully added
              System.out.print("Exception occured during adding the element to Destination array in MileRedeemer!");
              System.exit(0);
            }
          }
        //max = i;
        
        //After reading the file, the ArrayList is converted to a normal array of objects
        Destination[] destinations = (Destination[]) destinations.toArray(new Destination[destinations.size()]);
        
        //Arrays.sort(destinations, 0, max - 1, new MileageComparator());
        
        /*for(i = 0; i < max; i++)
        System.out.println(destinations[i].getCity());*/
       }
       
   /****************************************************************
   FUNCTION: getCityNames() 

   ARGUMENTS: none

   RETURNS: String[] array    

   NOTES: This method loops through the array of Destination objects
   and creates an array of String objects from the city names. The array
   is then sorted in ascending order and returned to the main function
   ****************************************************************/
       public String[] getCityNames()
       { 
         String[] cNames = new String[10];
           
         for(int i = 0; i < cNames.length; i++)
         {
           System.out.println(cNames[i].getCity());
         }
         
         Arrays.sort(cNames, 0, cNames.length - 1);
         
         return cNames;
       }
  
   /****************************************************************
   FUNCTION: redeemMiles()   

   ARGUMENTS: int miles, int months

   RETURNS: String[] array

   NOTES: For this method, miles is the total availabl miles, and month
   is the desired month of departure. This method should mainly return
   an array of String objects containing descriptions of redeemed tickets
   to be printed out by the main program. It should also save the miles
   remaining after the tickets have been redeemed.
   ****************************************************************/
       public String[] redeemMiles(int miles, int month) //miles and months are both used for user input or fileScan
       {
         String[] rMiles = new String[10]
         
         for(int k = 0; k < rMiles.length; k++)
         {
           System.out.println(rMiles[k].getNormalMiles(miles)); //for each destination in the array
           
           if(month.nextInt() >= beginMonth && month.nextInt <= endMonth) //if userInput.month >= start month and userInput.month <= end month
           {
             if(remainingMiles >= superSaver) //if remaining mileage >= supersaver mileage
             {
               remainingMiles = normalMiles - addMiles; //deduct that amount from remaining mileage
               
               if(remainingMiles >= addMiles) //if the remaining mileage >= upgrade mileage
               {
                 remainingMiles -= addMiles; 
                 String rMiles = new rMiles[remainingMiles]; //adds the amount to the temporary array as economy
                 System.out.printf("economy class");    
                 
               }
               else
                 System.out.printf("first class");   //add it as the first class
             }
            }
           else if(remainingMiles >= normalMiles) //if the remaining mileage >= normal mileage
            {
              remainingMiles = (remainingMiles - normalMiles); //deduct the normal mileage from the remaining mileage 
              String rMiles = new rMiles[remainingMiles];  //add to the temporary array
            }

         Arrays.sort(rMiles, 0, rMiles.length - 1, new MileageComparator()); //sorts the array of values in order

         return rMiles; //returns the array
       }
          
   /****************************************************************
   FUNCTION: getRemainingMiles()

   ARGUMENTS: none

   RETURNS: int - the remaining miles    

   NOTES: This method should return the remaining miles.
   ****************************************************************/
       public int getRemainingMiles()
      { 
         return remainingMiles;
      }
}


