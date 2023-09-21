import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class sumArray {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many numbers are you going to enter: ");
        byte n = scanner.nextByte();

        int[] arr = new int[n];
        int i =0;
        System.out.print("Enter an integer: ");

        int num = scanner.nextInt();

        while(true){
            arr[i] = num;
            i++;
            if( i == n){
                break;
            }
            System.out.print("Enter an integer: ");

             num = scanner.nextInt();



        }
        int sumofArray =0;
        for(int a= 0; a< arr.length; a++){
            sumofArray = sumofArray+ arr[a];

        }
        System.out.println(sumofArray);
    }
}
