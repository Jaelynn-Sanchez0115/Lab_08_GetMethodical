
public class CtoFTableDisplay {

    public static void main(String[] args) {

        System.out.printf("%10s %15s%n", "Celsius", "Fahrenheit");
        System.out.println("---------------------------");

        for (int Celsius = -100; Celsius <= 100; Celsius++) {
            double Fahrenheit = CtoF(Celsius);

            System.out.printf("%10d %15.2f%n", Celsius, Fahrenheit);
        }
    }

    public static double CtoF(double Celsius) {
        return (Celsius * 9.0 / 5.0) + 32;
    }
}
