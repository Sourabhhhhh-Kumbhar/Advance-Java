public class ExceptionHandlingg
{
    public static Integer getArrayElement(int[] arr, int index)
    {
        try{
            int value = arr[index];
            System.out.println("Value found: " + value);
            return value;
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error: That index doesnt exist in the array");
            return null;
        }
        catch(Exception e){
            System.out.println("Error: Something went wrong " + e.getMessage());
            return null;
        }
        finally{
            System.out.println("Execution of getArrayElement() done.\n");
        }
    }

    public static void main(String[] args)
    {
        int[] marks = {24,45,67,59,99,23};

        getArrayElement(marks, 2);
        getArrayElement(marks, 19);
        getArrayElement(marks, 5);

    }
}
