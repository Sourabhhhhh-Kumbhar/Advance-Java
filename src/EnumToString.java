
enum Language {

    JAVA,
    PYTHON,
    CPP;

    @Override
    public String toString()
    {
        return "Language: " + name();
    }

}
public class EnumToString
{

    public static void main(String[] args)
    {

        System.out.println(Language.JAVA);

    }

}