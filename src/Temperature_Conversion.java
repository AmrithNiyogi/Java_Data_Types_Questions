import java.util.Scanner;

public class Temperature_Conversion {

    public static void celsiusConversion() {
        Scanner sc = new Scanner(System.in);
        float temperature;

        System.out.println("Enter the temperature in Fahrenheit: ");
        temperature = sc.nextFloat();

        float celsiusTemperature = ((temperature - 32) * (5F/9F));

        System.out.println(temperature + "F = " + celsiusTemperature + "C");

    }

    public static void fahrenheitConversion() {
        Scanner sc = new Scanner(System.in);
        float temperature;

        System.out.println("Enter the temperature in Celsius: ");
        temperature = sc.nextFloat();

        float fahrenheitTemperature = (temperature * (9F/5F)) + 32;

        System.out.println(temperature + "C = " + fahrenheitTemperature + "F");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("TEMPERATURE CONVERSIONS");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("Enter your choice: ");
        int choice = sc.nextInt();

        if (choice == 1) {
            fahrenheitConversion();
        }

        else if (choice == 2) {
            celsiusConversion();
        }

        else {
            System.out.println("Invalid Option");
        }
    }
}
