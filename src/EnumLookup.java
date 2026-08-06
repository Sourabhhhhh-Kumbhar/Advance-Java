import java.sql.Array;

enum Grade {

    A(90),
    B(80),
    C(70),
    D(60);

    private int minMarks;

    Grade(int minMarks) {
        this.minMarks = minMarks;
    }

    public int getMinMarks() {
        return minMarks;
    }

    public static Grade fromMarks(int marks) {
        for (Grade g : Grade.values()) {
            if (marks >= g.minMarks) {
                return g;
            }
        }
        return D;
    }
}

public class EnumLookup
{
    public static void main(String[] args)
    {
        System.out.println(Grade.fromMarks(80));
    }
}