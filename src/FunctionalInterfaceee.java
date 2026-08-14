@FunctionalInterface
interface Calculator
{
    int calculate(int a, int b);
}

public class FunctionalInterfaceee
{
    public static void main(String[] args)
    {
        //Lambda Expression
        Calculator add = (a , b) -> a + b;

        //Calling the Method
        int result = add.calculate(10, 20);

        System.out.println("Result = " + result);
    }
}