
import java.util.Scanner;

public class FavNumbers {

    public static void main(String[] args) {
        Scanner pipe = new Scanner(System.in);

        int favoriteInteger = SafeInput.getInt(
                pipe, "Enter your favorite integer");

        double favoriteDouble = SafeInput.getDouble(
                pipe, "Enter your favorite double");

        System.out.println("Your favorite integer is: " + favoriteInteger);
        System.out.println("Your favorite double is: " + favoriteDouble);

        pipe.close();
    }
}
