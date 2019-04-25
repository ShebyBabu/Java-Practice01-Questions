//8. Write a program which accepts a number from user as input (set the limit say 1 - 50 or 1 -
//100) User should guess until the the target number is guessed correctly.
//Print separate messages for the following:
//a. Number guessed is more than original number
//b. Number guessed is less than original number
//c. Number guessed matches the original number

import java.util.Scanner;
public class GuessingNumber {
    public static void guessNumber()  {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your guess:   "); //enter the input
        int guessed_number=s.nextInt();

        int target_number=100;          //setting the target number/original number as 100

        if(guessed_number>target_number)
        {
            System.out.println("Number guessed is more than original number");  //if the target is greater than the guessed number
        }

        else if(guessed_number<target_number)
        {
            System.out.println("Number guessed is less than original number");  //if the target is lesser than the guessed number
        }

        else
        {
            System.out.println("Number guessed matches original number");       //if the target number is equal to guessed number
        }
    }
    public static void main(String[] args) {
        guessNumber();              //function call
    }
}
