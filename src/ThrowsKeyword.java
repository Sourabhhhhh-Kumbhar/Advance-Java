public class ThrowsKeyword
{
    //This method may throw ArithmeticException
    static void divide(int a, int b) throws ArithmeticException
    {
        //If b is 0 ArithmeticException will occur
        int result = a / b;

        System.out.println("Result: " + result);
    }

    public static void main(String[] args)
    {
        try
        {
            //Calling The Method
            divide(10, 0);
        }
        catch (ArithmeticException e)
        {
            //Handling the exception
            System.out.println("Cannot Divide by zero");
        }
    }
}