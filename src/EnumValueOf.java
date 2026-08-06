enum Season
{
    SPRING,
    SUMMER,
    WINTER,
}

public class EnumValueOf
{
    public static void main(String[]args)
    {
        Season s = Season.valueOf("WINTER");

        System.out.println(s);
    }
}