import java.util.Scanner;

public  class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double result = 0;


        System.out.println("Enter the first number : ");
        double num1 = scanner.nextDouble();

        System.out.println("Choose an operator (+, -, *, /, ^) : ");
        char operator = scanner.next().charAt(0);

        System.out.println("Enter the second number : ");
        double num2 = scanner.nextDouble();

        switch(operator){
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> {
                if(num2 == 0){
                    System.out.println("Cannot divide by zero");
                }else{
                    result = num1 / num2;
                }
            }
            case '^' -> result = Math.pow(num1,num2);
            default -> System.out.println("Invalid operation");
        }

        System.out.println(result);
    }
}