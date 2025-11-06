import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello there, Welcome to Weight Conversion Program!");
        System.out.println("1. Convert lbs to kgs");
        System.out.println("2. Convert kgs to lbs");

        System.out.print("Choose an option: ");
        int choice = scanner.nextInt();

        if(choice == 1) {
            System.out.println("Please enter the weight in lbs : ");
            double weight = scanner.nextDouble();
            double newWeight = weight * 0.453592;
            System.out.printf("Weight in kgs : %.2f", newWeight);
        }else if(choice == 2) {
            System.out.println("Please enter the weight in kgs : ");
            double weight = scanner.nextDouble();
            double newWeight = weight * 2.204623;
            System.out.printf("Weight in lbs : %.2f", newWeight);
        }else{
            System.out.println("Invalid choice");
        }

        scanner.close();
    }
}