import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the temperature : ");
        float temperature = scanner.nextFloat();

        System.out.println("Convert to Celsius or Fahrenheit? (C or F) : ");
        String convert = scanner.next().toUpperCase();

        float newTemp = (convert.equalsIgnoreCase("C")) ? (temperature-32)* 5/9 : (temperature * 9/5) + 32;

        System.out.printf("New temperature is: %.1f°"+convert, newTemp);

        scanner.close();

    }
}