public class BasicTryCatch
{
    public static void main(String[] args)
    {
        int i = 0;
        int j = 6;

        try
        {
            j = 5/i;
        }

        catch(Exception e)
        {
            System.out.println("Something went wrong...");
        }

        System.out.println(j);

        System.out.println("Bye");
    }
}
