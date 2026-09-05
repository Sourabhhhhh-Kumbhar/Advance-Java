public class DemoTryCatch
{
    public static void main(String[] args)
    {
        try
        {
            int [] numbers = {11,45,23,12,567};

            System.out.println(numbers[7]);
        }

        catch(Exception e)
        {
            System.out.println("Ooops that index does not exist");

        }

        System.out.println("Program keeps running after the error");

    }
}
