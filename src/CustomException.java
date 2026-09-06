
//Custom exception
class InvalidSalaryException extends Exception
{
    //Constructor
    InvalidSalaryException(String message)
    {
        super(message);
    }
}

public class CustomException
{
    //Method First
    static void checkSalary(double salary)
    {
        try
        {
            //Check Invalid Salary
            if(salary < 0)
            {
                //Throw custom exception
                throw new InvalidSalaryException("Salary Cannot be Negetive");
            }
            System.out.println("Valid Salary: " + salary);
        }

        catch(InvalidSalaryException e)
        {
            //Handle Custom Exception
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void main(String[] args)
    {
        checkSalary(-10000);
    }
}
