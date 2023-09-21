import javax.swing.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class GUIBazinga {
    public static void main(String[] args){
        try{
            String file = JOptionPane.showInputDialog("Enter file name or path"); // Asking user for file
            BufferedWriter writer = new BufferedWriter(new FileWriter(file)); // Creating file reader

            String input = JOptionPane.showInputDialog("Enter integers or press quit to stop enter atleast one integer");

            writer.write(input + "\n");

            int iteration = 0;

            ArrayList<Integer> arr = new ArrayList<>();


            while(true) { // loop for user to enter integer values

                input = JOptionPane.showInputDialog("Enter an integer value");

                if(input.equals("quit")){ // break condition
                    break;

                } else{ // adding values to file

                    writer.write(input + "\n");

                    iteration++;

                }
            }

            writer.close();

            BufferedReader reader = new BufferedReader(new FileReader(file));

            String line;
            while((line= reader.readLine()) != null){

                int num = Integer.parseInt(line);

                arr.add(num);
            }
            int sums = 0;

            for(int i=0; i <= iteration; i++){
                sums = arr.get(i) + sums;
            }

            System.out.println("The sum of the 10 integers is: " + sums);

            int min = arr.get(0);

            int max = arr.get(0);

            for(int d =0; d <= iteration ;d++){ // for loop to find maximum value in array

                if(max < arr.get(d)) {
                    max = arr.get(d);
                }
            }

            System.out.println("The maximum value in the array is: " + max);

            for(int d =0; d <= iteration ;d++){ // for loop to find minimum value in array
                if(min > arr.get(d)) {
                    min = arr.get(d);
                }
            }

            System.out.println("The minimum value in the array is: " + min);

        } catch (Exception e){
            System.out.println("Hey dude...whatever you are trying to do won't work");
        }
    }
}