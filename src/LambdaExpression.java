interface Multiply
{
    int multiply(int a, int b);
}

interface Divide
{
    int divide(int a, int b);
}

public class LambdaExpression
{
    public static void main(String[] args)
    {
        Multiply product = (a , b) ->
        {
            int result = a * b;
            return result;
        };

        Divide divide = (a , b) ->
        {
            int result = a / b;
            return result;
        };

        int answer = product.multiply(5, 8);

        System.out.println("Product is: "  + answer);

        int answer2 = divide.divide(5, 8);

        System.out.println("Divide is: "  + answer2);
    }
}