// ============================================
// EXCEPTION HANDLING (JAVA)
// ============================================
// WHY IT'S USED:
// At runtime, things can go wrong that you can't always predict —
// bad input, invalid array index, wrong data type, etc.
// Without handling, ONE unexpected error CRASHES the whole program.
// Exception handling lets you catch the error and decide what to do,
// instead of letting the JVM kill your app.

// WHAT IT IS:
// A try-catch block. Java "tries" risky code, and if it throws an
// exception, control jumps to the matching "catch" block.

public class ExceptionHandlingg {

    public static Integer getArrayElement(int[] arr, int index) {
        try {
            // "try" block: code that MIGHT throw an exception goes here
            int value = arr[index];
            System.out.println("Value found: " + value);
            return value;

        } catch (ArrayIndexOutOfBoundsException e) {
            // Runs ONLY if the index doesn't exist in the array
            // (e.g., asking for arr[10] when array only has 5 elements)
            System.out.println("Error: That index doesn't exist in the array!");
            return null;

        } catch (Exception e) {
            // Generic catch-all for any other unexpected error
            // (best practice: catch specific exceptions FIRST, generic LAST)
            System.out.println("Error: Something went wrong -> " + e.getMessage());
            return null;

        } finally {
            // ALWAYS runs, whether an exception happened or not
            // Used for cleanup: closing files, DB connections, etc.
            System.out.println("Execution of getArrayElement() finished.\n");
        }
    }

    public static void main(String[] args) {
        int[] marks = {90, 85, 76, 60, 45};

        getArrayElement(marks, 1);   // Normal case -> works fine, prints 76
        getArrayElement(marks, 10);// Triggers ArrayIndexOutOfBoundsException -> handled gracefully
        getArrayElement(marks, 4);
    }

}