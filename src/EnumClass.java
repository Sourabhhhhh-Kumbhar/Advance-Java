class Mobile
{
    enum Brand
    {
        SAMSUNG,
        APPLE,
        ONEPLUS
    }
}

public class EnumClass
{
    public static void main(String[]args)
    {
        Mobile.Brand b = Mobile.Brand.ONEPLUS;
        System.out.println(b);
    }
}

