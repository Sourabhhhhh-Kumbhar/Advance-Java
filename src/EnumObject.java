enum Status
{
    PENDING,
    APPROVED,
    REJECTED,
}
class Application
{
    private Status status;

    public Application(Status status)
    {
        this.status = status;
    }
    public void displayStatus()
    {
        System.out.println("Status: " + status);
    }
}
public class EnumObject
{
    public static void main(String[] args)
    {
        Application application = new Application(Status.PENDING);

        application.displayStatus();
    }
}