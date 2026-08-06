// Interface
interface Printablee {
    void print();
}

// Enum implementing interface
enum Department implements Printablee {

    HR(101, "Human Resource"),
    IT(102, "Information Technology"),
    SALES(103, "Sales Department");

    private int id;
    private String fullName;

    // Constructor
    Department(int id, String fullName) {
        this.id = id;
        this.fullName = fullName;
    }

    // Getter methods
    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    // Interface method
    @Override
    public void print() {
        System.out.println("Department : " + fullName);
    }

    // Static method
    public static Department searchById(int id) {

        for (Department d : values()) {
            if (d.id == id) {
                return d;
            }
        }
        return null;
    }

    // Override toString()
    @Override
    public String toString() {
        return fullName + " (" + id + ")";
    }
}

// Enum with abstract method
enum Operation {

    ADD {
        public int calculate(int a, int b) {
            return a + b;
        }
    },

    SUBTRACT {
        public int calculate(int a, int b) {
            return a - b;
        }
    },

    MULTIPLY {
        public int calculate(int a, int b) {
            return a * b;
        }
    },

    DIVIDE {
        public int calculate(int a, int b) {
            return a / b;
        }
    };

    public abstract int calculate(int a, int b);
}

// Class containing nested enum
class Employee {

    enum Status {
        ACTIVE,
        INACTIVE,
        LEAVE
    }

    private String name;
    private Status status;
    private Department department;

    Employee(String name, Status status, Department department) {
        this.name = name;
        this.status = status;
        this.department = department;
    }

    void display() {
        System.out.println("\nEmployee Details");
        System.out.println("Name : " + name);
        System.out.println("Status : " + status);
        System.out.println("Department : " + department);
    }
}

// Main class
public class Printable {

    public static void main(String[] args) {

        // Basic enum object
        Department dept = Department.IT;

        // Getter methods
        System.out.println("ID : " + dept.getId());
        System.out.println("Name : " + dept.getFullName());

        // Interface method
        dept.print();

        // values()
        System.out.println("\nAll Departments");
        for (Department d : Department.values()) {
            System.out.println(
                    d.name() +
                            " | Ordinal = " + d.ordinal() +
                            " | " + d
            );
        }

        // valueOf()
        Department d1 = Department.valueOf("HR");
        System.out.println("\nvalueOf() : " + d1);

        // ==
        if (dept == Department.IT) {
            System.out.println("Department is IT");
        }

        // Switch
        switch (dept) {

            case HR:
                System.out.println("Handles Recruitment");
                break;

            case IT:
                System.out.println("Handles Software");
                break;

            case SALES:
                System.out.println("Handles Marketing");
                break;
        }

        // Static method
        Department found = Department.searchById(103);
        System.out.println("\nSearch by ID : " + found);

        // Abstract method enum
        System.out.println("\nOperations");
        System.out.println("10 + 20 = " + Operation.ADD.calculate(10,20));
        System.out.println("20 - 5 = " + Operation.SUBTRACT.calculate(20,5));
        System.out.println("5 * 8 = " + Operation.MULTIPLY.calculate(5,8));
        System.out.println("20 / 4 = " + Operation.DIVIDE.calculate(20,4));

        // Nested enum inside class
        Employee emp = new Employee(
                "Rahul",
                Employee.Status.ACTIVE,
                Department.IT);

        emp.display();
    }
}