enum Planet
{
    MERCURY(88),
    VENUS(225),
    EARTH(365),
    MARS(687);

    private int days;

    Planet(int days)
    {
        this.days = days;
    }

    public int getDays()
    {
        return days;
    }
}

public class EnumFields
{
    public static void main(String[] args)
    {
        System.out.println(Planet.EARTH.getDays());
    }
}