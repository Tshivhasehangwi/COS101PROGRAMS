/* Name:Azwihangwisi Vhuhwavho Tshivhase
Student number: 4258306
4258306p1q2

*/
import java.util.Scanner;

public class FirstProgram {
    public static void main(String[] args) {
        System.out.println("Hello out there.");
        System.out.println("I will add two numbers for you.");
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n1 = keyboard.nextInt();
        System.out.print("Enter another integer: ");
        int n2 = keyboard.nextInt();
        System.out.print("The sum of those two numbers is: ");
        System.out.println(n1 + n2);
    }
}