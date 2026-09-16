public class TryCatch
{
    public static Integer divide(int a, int b)
    {
        try
        {
            int result = a / b;
            System.out.println("Division result is: " + result);
            return result;
        }
        catch(ArithmeticException e)
        {
            System.out.println("Cant Do Division With Zero" + e.getMessage());
            return null;
        }
    }
    public static void main(String[] args)
    {
        divide(40,5);
    }
}