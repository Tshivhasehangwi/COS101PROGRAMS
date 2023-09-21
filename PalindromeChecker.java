// This program checks if a string is a palindrome

import java.util.ArrayList;
import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        System.out.println("Hi there this program checks if a word is a palindrome or not");
        String checking = "";
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word,NB: WORD!! to check if it is a palindrome or not: ");

        String palindromeOrNot = scanner.next();
        ArrayList<String> maybePalindrome = new ArrayList<>();

        for (int i = palindromeOrNot.length() - 1; i >= 0; i--) {
            String checker = Character.toString(palindromeOrNot.charAt(i));

            maybePalindrome.add(checker);
        }
        for (int i = 0; i < palindromeOrNot.length(); i++) {
            checking += maybePalindrome.get(i);
        }

        if(checking.equals(palindromeOrNot)){
            System.out.println( palindromeOrNot +" is a palindrome");
        } else  {
           System.out.println(palindromeOrNot + " is not a palindrome");
        }
    }
}