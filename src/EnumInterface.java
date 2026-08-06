interface Printableee
{
    void print();
}
enum Fruit implements Printableee
{
    APPLE,
    MANGO,
    ORANGE;

    @Override
    public void print()
    {
        System.out.println("Fruit is" + this);
    }
}

public class EnumInterface
{
    public static void main(String[] args)
    {
        Fruit.APPLE.print();
    }
}