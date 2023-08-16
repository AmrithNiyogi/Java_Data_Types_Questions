import java.util.Scanner;

public class InchesMeterConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of inches: ");
        float inches = sc.nextFloat();

        float meters = inches * 0.0254F;

        System.out.println(inches + " inches = " + meters + " meters");
    }
}
