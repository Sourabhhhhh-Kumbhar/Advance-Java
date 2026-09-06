public class ThrowKeyword
{

    static void checkAge(int age)
    {

        try
        {
            // Check if age is less than 18
            if (age < 18)
            {

                // Manually throw an exception
                throw new IllegalArgumentException(
                        "Age must be 18 or above."
                );
            }

            System.out.println("You are eligible.");

        }

        // Handles IllegalArgumentException
        catch (IllegalArgumentException e)
        {
            System.out.println("Error: " + e.getMessage());
        }
    }


    public static void main(String[] args)
    {

        checkAge(15);
    }
}