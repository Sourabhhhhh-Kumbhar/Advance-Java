enum StudentType
{
    REGULAR(1000, "Regular"),
    PREMIUM(5000, "Premium"),
    VIP(100000, "VIP");

    private int fees;
    private String type;

    StudentType(int fees, String type)
    {
        this.fees = fees;
        this.type = type;
    }
    public int getFees()
    {
        return fees;
    }
    public String getType()
    {
        return type;
    }
}

public class EnumMultipleFields
{
    public static void main(String[] args)
    {
        StudentType s = StudentType.REGULAR;

        System.out.println(s.getType());
        System.out.println(s.getFees());
    }
}