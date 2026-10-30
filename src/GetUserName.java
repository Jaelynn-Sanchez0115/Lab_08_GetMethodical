
import java.util.Scanner;

public class GetUserName {

    public static void main(String[] args) {
        Scanner pipe = new Scanner(System.in);

        String firstName = SafeInput.getNonZeroLenString(
                pipe, "Enter your first name");

        String lastName = SafeInput.getNonZeroLenString(
                pipe, "Enter your last name");

        System.out.println("Your name is: " + firstName + " " + lastName);

        pipe.close();
    }
}

