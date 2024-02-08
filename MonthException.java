//Ashley Gutierrez Carreto
//December 4th, 2023
//Lab 12 HandlingExceptions
//This code extends an exceptions if the user inputs a number 
// that is not 1 -12. (Invalid month)
public class MonthException extends Exception
{
    MonthException()
    {
        super("Invalid month number.");
    }
}