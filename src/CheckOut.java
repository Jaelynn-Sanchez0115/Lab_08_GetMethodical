
import java.util.Scanner;

public class CheckOut {

    public static void main(String[] args) {
        Scanner pipe = new Scanner(System.in);

        double total = 0.0;
        boolean moreItems = true;

        while (moreItems) {
            double price = SafeInput.getRangedDouble(
                    pipe,
                    "Enter the item price",
                    0.50,
                    10.00
            );

            total += price;

            moreItems = SafeInput.getYNConfirm(
                    pipe,
                    "Do you have another item?"
            );
        }

        System.out.printf("Total cost: $%.2f%n", total);

        pipe.close();
    }
}
