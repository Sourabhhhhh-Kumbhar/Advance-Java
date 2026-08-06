enum PizzaSize
{
    SMALL(100),
    MEDIUM(200),
    LARGE(300);

    private int price;
    PizzaSize(int price)
    {
        this.price = price;
    }
    public int getPrice()
    {
        return price;
    }
}

public class EnumConstructor
{
    public static void main(String[] args)
    {
        System.out.println(PizzaSize.SMALL.getPrice());
    }
}