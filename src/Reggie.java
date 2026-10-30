
import java.util.Scanner;

public class Reggie {

    public static void main(String[] args) {
        Scanner pipe = new Scanner(System.in);

        // Get and validate SSN
        String ssn = SafeInput.getRegExString(
                pipe,
                "Enter your SSN (###-##-####): ",
                "^\\d{3}-\\d{2}-\\d{4}$"
        );
        System.out.println("SSN accepted: " + ssn);

        // Get and validate UC M number
        String mNumber = SafeInput.getRegExString(
                pipe,
                "Enter your UC M number (M followed by 5 digits): ",
                "^(M|m)\\d{5}$"
        );
        System.out.println("M number accepted: " + mNumber);

        // Get and validate menu choice
        String choice = SafeInput.getRegExString(
                pipe,
                "Enter a menu choice (O)pen, (S)ave, (V)iew, or (Q)uit: ",
                "^[OoSsVvQq]$"
        );
        System.out.println("Menu choice accepted: " + choice);

        pipe.close();
    }
}

