import java.util.Scanner;

public class exp8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.println("Choose operation (1.Add 2.Subract 3.Multiply): ");
        int opt = sc.nextInt();

        switch (opt) {
            case 1: System.out.println("Result: " + (num1 + num2));         
                break;
        
            case 2: System.out.println("Result: " + (num1 - num2));
                break;

            case 3: System.out.println("Result: " + (num1 * num2));
                break;

            default: System.out.println("Invalid option!");
        }

        sc.close();
    }
}
