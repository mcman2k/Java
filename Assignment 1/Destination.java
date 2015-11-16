/****************************************************************
 Name: William Dew
 
 Program: 1
 
 Due Date: 6/30/2014
 
 Note: this program does no input validity checking.
 
 Addtional Notes: Destination Class
*****************************************************************/
public class Destination
  {
    
    private String city;
    private int normalMiles; 
    private int upgradeMiles;
    private int superSaver;
    private int beginMonth;
    private int endMonth;
    
//constructor
   /****************************************************************
   FUNCTION: Destination()   

   ARGUMENTS: String cities, int mile, int extraMiles, int saver, int iBeginMonth,
              int iEndMonth

   RETURNS: nothing - it is the constructor for this class
   ****************************************************************/
    public Destination(String cities, int mile, int extraMiles, int saver,
                       int iBeginMonth, int iEndMonth))
    {
      city = cities;   //initializes city
      normalMiles = mile;  //initializes mile      
      addMiles = extraMiles;  //initializes extraMiles
      superSaver = saver;  //initializes supersaver
      beginMonth = iBeginMonth;
      endMonth = iEndMonth;
    } //end constructor
   
   /****************************************************************
   FUNCTION: getCity()   

   ARGUMENTS: none

   RETURNS: String city    

   NOTES: Returns the cities as a string
   ****************************************************************/
    public String getCity()
    {
      return city;
    }
   /****************************************************************
   FUNCTION: getNormalMiles()

   ARGUMENTS: none

   RETURNS: int normalMiles  

   NOTES: Returns the normalMiles, or initial mileage as an integer
   ****************************************************************/
    public int getNormalMiles()
    {
      return normalMiles;
    }
}