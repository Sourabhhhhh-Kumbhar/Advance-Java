public class MultipleCatch
{
    static void demonstrateException()
    {
        try
        {
            //Code that may cause Exceptions

            int[] numbers = {10,20,30,40};

            //This will cause the ArithmeticException
           // int result = 10/0;

            //This will cause ArrayIndexOutOfBoundsException
            System.out.println(numbers[5]);

        }

        //Handles ArithmeticException
        catch(ArithmeticException e)
        {
            System.out.println("cannot divide number by zero");
        }

        //Handles ArrayIndexOutOfBoundsException
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("That index does not exist");
        }
    }

    public static void main(String[] args)
    {
        demonstrateException();
    }
}
