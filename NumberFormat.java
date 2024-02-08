// Ashley Gutierrez Carreto
//December 4th, 2023
//lab 12 HandlingExceptions
// This code extends exxception if the user enter a date that is 
//not in the right format
public class NumberFormat extends Exception
{
    NumberFormant()
    {
        super("Invalid number format.");
    }
}