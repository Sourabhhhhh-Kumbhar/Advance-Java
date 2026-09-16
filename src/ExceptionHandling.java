// ============================================
// EXCEPTION HANDLING (JAVA)
// ============================================
// WHY IT'S USED:
// At runtime, things can go wrong that you can't always predict —
// bad input, dividing by zero, invalid array index, etc.
// Without handling, ONE unexpected error CRASHES the whole program.
// Exception handling lets you catch the error and decide what to do,
// instead of letting the JVM kill your app.

// WHAT IT IS:
// A try-catch block. Java "tries" risky code, and if it throws an
// exception, control jumps to the matching "catch" block.

public class ExceptionHandling {

    public static Integer divideNumbers(int a, int b) {
        try {
            // "try" block: code that MIGHT throw an exception goes here
            int result = a / b;
            System.out.println("Division successful! Result: " + result);
            return result;

        } catch (ArithmeticException e) {
            // Runs ONLY if an ArithmeticException occurs above
            // (e.g., dividing by zero — Java throws this, not a crash-crash)
            System.out.println("Error: You can't divide by zero!");
            return null;

        } catch (Exception e) {
            // Generic catch-all for any other unexpected error
            // (best practice: catch specific exceptions FIRST, generic LAST)
            System.out.println("Error: Something went wrong -> " + e.getMessage());
            return null;

        } finally {
            // ALWAYS runs, whether an exception happened or not
            // Used for cleanup: closing files, DB connections, etc.
            System.out.println("Execution of divideNumbers() finished.\n");
        }
    }

    public static void main(String[] args) {
        divideNumbers(10, 2);   // Normal case -> works fine, prints 5
        divideNumbers(10, 0);   // Triggers ArithmeticException -> handled gracefully
    }
}