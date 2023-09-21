import java.io.BufferedReader;

import java.io.FileReader;
import java.util.Arrays;

//
public class Bazinga {
    public static void main(String[] args) {

        try{
            BufferedReader reader = new BufferedReader(new FileReader("intarray.txt")); // Declaring new BufferWriter
            int i = 0;
            String file;

            int[] arr = new int[10]; // array to store 10 integers that will be read from a file

            while((file = reader.readLine()) != null){ // while loop to read all integers from the text file
               int num = Integer.parseInt(file);
               arr[i] = num;
               i++;
            }
            reader.close();
            System.out.println("Printing all the values stored in the array");

            for(int numero : arr){ // for loop to print all elements in the array
                System.out.print(numero + "\t");
            }

            int sum =0;
            for(int a= 0 ; a< 10; a++){ // for loop to find the sum of numbers in the array
                sum =  arr[a] + sum;
            }
            System.out.println("The sum of values stored in Storage array is: " + sum);

            int min = arr[0];
            int max =arr[0];

            for(int m = 1; m < 10; m++){ // for loop to find maximum value
                if(max < arr[m]){
                    max = arr[m];
                }
            }
            System.out.println("Maximum value in the storage array[" + max +"]");


            for(int m = 1; m < 10; m++){ // for loop to find minimum value
                if(min > arr[m]){
                    min = arr[m];
                }
            }
            System.out.println("Maximum value in the storage array[" + min +"]");

            Arrays.sort(arr);

            System.out.println("Printing the sorted storageArr");

            for(int nums: arr){
                System.out.print(nums + "\t");
            }

        } catch(Exception e){
            System.out.println("Something went wrong...and yes it is your fault.");
        }
    }

}



