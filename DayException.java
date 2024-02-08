// Ashley Gutierrez Carreto
//December 4th, 2023
//lab 12 HandlingExceptions
// This code extends exxception if the user enter a date that is 
//not in range of the given month
public class DayException extends Exception
{
    DayException()
    {
        super("Invalid day number.");
    }
}