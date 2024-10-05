// Simplifying the print statements in Java

// 1) Simple print(), println(), and printf() functions
class PrintUtil {
    // Creating static methods so no new instance has to be created

    // Simple print() method
    public static void print(String message) {
        // Printing the output using traditional method
        System.out.print(message);
    }

    // Simple println() method
    public static void println(String message) {
        // Printing the output using traditional method
        System.out.println(message);
    }

    // Simple printf() method with formatting
    public static void printf(String format, Object... args) {
        // Printing the formatted output using traditional method
        System.out.printf(format, args);
    }
}
