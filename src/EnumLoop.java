enum Color
{
    RED,
    GREEN,
    YELLOW,
}

public class EnumLoop
{
    public static void main(String[] args)
    {
        for(Color c : Color.values())
        {
            System.out.println(c);
        }
    }
}