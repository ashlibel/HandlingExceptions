//Ashley Gutierrez Carreto
//November 4, 2023
//Lab 12 Handling Exceptions
//A code that converts dates to a numerical month-day format. If the user 
//inputs a number that is doesn't have logical sense then a specific 
//exception will occur depedning on the error that has been made.
import java.util.Scanner;
public class HandlingExceptions
{
    public static void main (String [] args)
    {
        // user inputs data
        Scanner keyboard = new Scanner (System.in);
        //System.out. println ("Type the month and day in the format of month/day");
        boolean success = false;
        while (success == false)
        {
            try
            {
                System.out. println ("Type the month and day in the format of month/day");
                String date = keyboard.nextLine();
                int slashPosition = date.indexOf ("/"); 
         
                if (slashPosition == -1)
                throw new NumberFormatException();
           
                if ( date == " ")
                success = true;
           
                String month = date.substring (0, slashPosition);
                String day = date.substring (slashPosition + 1);
               
                int monthNumber = Integer.parseInt(month);
                int dayNumber = Integer.parseInt(day);
        
                //if exception for the user to put input month in range of 1-12
                if (monthNumber < 1 || monthNumber > 12)
                throw new MonthException(); 
            
                // if exception for all the days    
                if (dayNumber < 1 || (monthNumber == 2 && dayNumber > 28)||
                ((monthNumber == 4||monthNumber == 6 || monthNumber == 9 ||
                monthNumber == 11) && dayNumber > 30)|| ( (monthNumber == 1
                || monthNumber == 3 || monthNumber == 5|| monthNumber == 7
                || monthNumber == 8 || monthNumber == 10|| monthNumber == 12) 
                && dayNumber > 31))
       
                { 
                    System.out.println (" " + " " + dayNumber);
                    throw new DayException(); 
            
                }
        
                String[]monthNames = {"January ", "February ", "March " , "April ",
                                      "May ","June ", "July ", "August ", "September ",
                                      "October ", "November ", "December " };
                System.out.println( monthNames[monthNumber -1] + dayNumber);
            } 
            catch (NumberFormatException e)
            {
                System.out.println ("Date expected in format month/day.");
                System.exit (0);
            }

            catch (MonthException e)
            {
                System.out.println (e.getMessage());
                System.exit (0);
            }
            catch (DayException e)
            {
                System.out.println (e.getMessage());
                System.exit (0);
            }
        }
    }
}