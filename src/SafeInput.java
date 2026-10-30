
import java.util.Scanner;

public class SafeInput {

    // Part A: Get a non-empty string
    public static String getNonZeroLenString(Scanner pipe, String prompt) {
        String retString = "";

        do {
            System.out.print("\n" + prompt + ": ");
            retString = pipe.nextLine();
        } while (retString.length() == 0);

        return retString;
    }

    // Part B: Get any integer
    public static int getInt(Scanner pipe, String prompt) {
        int number;

        while (true) {
            System.out.print(prompt + ": ");

            if (pipe.hasNextInt()) {
                number = pipe.nextInt();
                pipe.nextLine();
                return number;
            } else {
                pipe.nextLine();
                System.out.println("Invalid input. Please enter an integer.");
            }
        }
    }

    // Part C: Get any double
    public static double getDouble(Scanner pipe, String prompt) {
        double number;

        while (true) {
            System.out.print(prompt + ": ");

            if (pipe.hasNextDouble()) {
                number = pipe.nextDouble();
                pipe.nextLine();
                return number;
            } else {
                pipe.nextLine();
                System.out.println("Invalid input. Please enter a number.");
            }
        }
    }

    // Part D: Get an integer within an inclusive range
    public static int getRangedInt(Scanner pipe, String prompt, int low, int high) {
        int number;

        while (true) {
            number = getInt(pipe, prompt + " [" + low + "-" + high + "]");

            if (number >= low && number <= high) {
                return number;
            }

            System.out.println("Please enter a number between " + low + " and " + high + ".");
        }
    }

    // Part E: Get a double within an inclusive range
    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high) {
        double number;

        while (true) {
            number = getDouble(pipe, prompt + " [" + low + "-" + high + "]");

            if (number >= low && number <= high) {
                return number;
            }

            System.out.println("Please enter a number between " + low + " and " + high + ".");
        }
    }

    // Part F: Get a yes/no response
    public static boolean getYNConfirm(Scanner pipe, String prompt) {
        String response;

        while (true) {
            System.out.print(prompt + " (Y/N): ");
            response = pipe.nextLine().trim();

            if (response.equalsIgnoreCase("Y")) {
                return true;
            } else if (response.equalsIgnoreCase("N")) {
                return false;
            } else {
                System.out.println("Please enter Y or N.");
            }
        }
    }

    // Part G: Get a string matching a regular expression
    public static String getRegExString(Scanner pipe, String prompt, String regEx) {
        String input;

        while (true) {
            System.out.print(prompt + ": ");
            input = pipe.nextLine();

            if (input.matches(regEx)) {
                return input;
            }

            System.out.println("Invalid input. Please try again.");
        }
    }

    // Program 06: Print a centered header
    public static void prettyHeader(String msg) {
        for (int i = 0; i < 60; i++) {
            System.out.print("*");
        }
        System.out.println();

        int spaces = 54 - msg.length();
        int leftSpaces = spaces / 2;
        int rightSpaces = spaces - leftSpaces;

        System.out.print("***");

        for (int i = 0; i < leftSpaces; i++) {
            System.out.print(" ");
        }

        System.out.print(msg);

        for (int i = 0; i < rightSpaces; i++) {
            System.out.print(" ");
        }

        System.out.println("***");

        for (int i = 0; i < 60; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}

