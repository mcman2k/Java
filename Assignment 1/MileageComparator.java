/****************************************************************
 Name: William Dew
 
 Program: 1
 
 Due Date: 6/30/2014
 
 Note: this program does no input validity checking.
 
 Addtional Notes: Mileage Comparator
*****************************************************************/
import java.util.Comparator;

public class MileageComparator implements Comparator<Destination>
{
  public int compare(Destination d1, Destination d2)
  {
    return (d2.getNormalMiles() - d1.getNormalMiles());
  }
}