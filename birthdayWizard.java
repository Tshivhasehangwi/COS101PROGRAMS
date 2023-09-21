/* Name: Azwihangwisi Vhuhwavho Tshivhase
Student number: 4258306
4258306p1q3
*/

import java.util.Scanner;

public class birthdayWizard {
    public static void main(String[] args){
        System.out.println("Welcome to the birthday Wizard. Provide me with an age");
        System.out.println("and your year of birth and I will tell you if you have turned that age and what year it was");
        System.out.println("or if you are currently that age, or what year you will turn that age. ");

        Scanner scanner = new Scanner(System.in);

        System.out.println("");
        System.out.print("What age are you checking for, write only a positive whole number, don't be dumb now: ");
        int ageCheck = scanner.nextInt();
        System.out.println("What was the year you were born in and no it was not after 2023,");
        System.out.print("unless you are running this program in the future >_< : ");

        int birthYear = scanner.nextInt();

        int yearCheck = ageCheck + birthYear ;

        if(yearCheck > 2023) {
            System.out.println("You will turn " + ageCheck + " in the year " + yearCheck);

        }else if (yearCheck == 2023){
            System.out.println("You are currently " + ageCheck + " or you will turn " + ageCheck + " later in the year");

        }else if (yearCheck < 2023) {
            System.out.println("You turned " +ageCheck + " in the year " + yearCheck);
        }
    }

}
