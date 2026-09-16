public class Finally
{
    public static void main(String[] args)
    {
        try{
            int number = Integer.parseInt("abc");
            System.out.println("Number is: " + number);
        }
        catch(NumberFormatException e){
            System.out.println("Error: Thats not Valid Number" + e.getMessage());
        }
        finally{
            System.out.println("Program Execution Completed");
//            Why it's used: finally guarantees this line prints whether the conversion works or fails
//        — good for things like printing a "done" message,
//            resetting a variable, or logging that a process finished,
//                    regardless of success or error.
        }
    }
}
