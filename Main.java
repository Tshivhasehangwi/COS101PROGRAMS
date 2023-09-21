import java.util.Scanner;

//This program computes a prime number.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insert a number to check if it is prime: ");

        int num = scanner.nextInt();

        if (num % 2 != 0) {
            for (int i = 2; i < num; i++) {
                if (num % i != 0) {
                    System.out.println(num + " is a prime number");
                    break;

                } else if (num % i == 0) {
                    System.out.println(num + " is not a prime number");
                    break;
                }
            }
        } else if (num % 2 == 0 && num != 2) {
            System.out.println(num + " is not a prime number ");

        } else if (num == 2) {
            System.out.println("2 is a prime number");
        }
    }
}