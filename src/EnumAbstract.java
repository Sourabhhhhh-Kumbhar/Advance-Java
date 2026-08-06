enum Operationn
{
    ADD {
        public int calculate(int a, int b)
        {
            return a + b;
        }
    },

    SUBTRACT {
        public int calculate(int a, int b)
        {
            return a - b;
        }
    },

    MULTIPLY {
        public int calculate(int a, int b)
        {
            return a * b;
        }
    },

    DIVIDE {
        public int calculate(int a, int b)
        {
            return a / b;
        }
    };

    public abstract int calculate(int a, int b);

}

public class EnumAbstract
{
    public  static void main(String[] args)
    {
        System.out.println(Operationn.SUBTRACT.calculate(1, 2));
        System.out.println(Operationn.MULTIPLY.calculate(1, 2));
    }
}