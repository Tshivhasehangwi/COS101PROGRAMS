// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Fibionnacci {
    public static void main(String[] args) {
        int[] arr = new int[10];
        arr[0] = 0;
        arr[1] =1;
        arr[2] =1;

        for(int i=3; i < arr.length; i++){
            arr[i] = arr[i-1] + arr[i-2];
        }
        for(int num: arr){
            System.out.println(num);
        }
    }
}