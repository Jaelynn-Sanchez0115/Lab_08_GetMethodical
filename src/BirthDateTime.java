
import java.util.Scanner;

public class BirthDateTime {

    public static void main(String[] args) {
        Scanner pipe = new Scanner(System.in);

        int year = SafeInput.getRangedInt(
                pipe, "Enter birth year", 1950, 2015);

        int month = SafeInput.getRangedInt(
                pipe, "Enter birth month", 1, 12);

        int day;

        switch (month) {
            case 2:
                day = SafeInput.getRangedInt(
                        pipe, "Enter birth day", 1, 29);
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                day = SafeInput.getRangedInt(
                        pipe, "Enter birth day", 1, 30);
                break;

            default:
                day = SafeInput.getRangedInt(
                        pipe, "Enter birth day", 1, 31);
                break;
        }

        int hours = SafeInput.getRangedInt(
                pipe, "Enter birth hour (1-24)", 1, 24);

        int minutes = SafeInput.getRangedInt(
                pipe, "Enter birth minutes", 1, 59);

        System.out.println();
        System.out.println("Birth Date and Time");
        System.out.println("Date: " + month + "/" + day + "/" + year);
        System.out.printf("Time: %02d:%02d%n", hours, minutes);

        pipe.close();
    }
}

