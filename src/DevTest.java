
import java.util.Scanner;

public class DevTest {

    public static void main(String[] args) {
        Scanner pipe = new Scanner(System.in);

        // Part A: getNonZeroLenString
        System.out.println("\n--- Part A: getNonZeroLenString ---");
        String name = SafeInput.getNonZeroLenString(
                pipe, "Enter your name");
        System.out.println("You entered: " + name);

        // Part B: getInt
        System.out.println("\n--- Part B: getInt ---");
        int number = SafeInput.getInt(
                pipe, "Enter an integer");
        System.out.println("Integer entered: " + number);

        // Part C: getDouble
        System.out.println("\n--- Part C: getDouble ---");
        double decimal = SafeInput.getDouble(
                pipe, "Enter a decimal number");
        System.out.println("Double entered: " + decimal);

        // Part D: getRangedInt
        System.out.println("\n--- Part D: getRangedInt ---");
        int rangedInt = SafeInput.getRangedInt(
                pipe, "Enter a number from 1 to 10", 1, 10);
        System.out.println("Ranged integer: " + rangedInt);

        // Part E: getRangedDouble
        System.out.println("\n--- Part E: getRangedDouble ---");
        double rangedDouble = SafeInput.getRangedDouble(
                pipe, "Enter a number from 1.0 to 10.0", 1.0, 10.0);
        System.out.println("Ranged double: " + rangedDouble);

        // Part F: getYNConfirm
        System.out.println("\n--- Part F: getYNConfirm ---");
        boolean answer = SafeInput.getYNConfirm(
                pipe, "Do you like programming?");
        System.out.println("Your answer was yes: " + answer);

        // Part G: getRegExString
        System.out.println("\n--- Part G: getRegExString ---");
        String ssn = SafeInput.getRegExString(
                pipe,
                "Enter an SSN (###-##-####)",
                "^\\d{3}-\\d{2}-\\d{4}$");
        System.out.println("Accepted SSN: " + ssn);

        // Test prettyHeader
        System.out.println("\n--- prettyHeader test ---");
        SafeInput.prettyHeader("Message Centered Here");

        pipe.close();
    }
}

