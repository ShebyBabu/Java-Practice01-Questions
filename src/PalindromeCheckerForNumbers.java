//1. Write a program which accepts a number as input and check whether the given number is
//palindrome or not If it is a palindrome then
//a. Add all the even numbers and check whether the sum is more than 25.
//b. Print success and failure messages for all 3 conditions
//Input : 2468642
//Output : 2468642 is palindrome and the sum of even numbers is greater than 25
//Input: 12345
//Output: 12345 is not palindrome
//Input: 12345654321
//Output : 12345654321 is palindrome and sum of even numbers is less than 25


import java.util.Scanner;   //imported packages for scanner classes
public class PalindromeCheckerForNumbers {
    public static void palindromeChecker()

    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number: "); //enter the number to be checked
        int number = s.nextInt();
        int inputNumber = number, originalNumber = number, sum = 0, flag = 0, i;  //initialization
        int length = String.valueOf(number).length();

        int[] arr = new int[length];
        for (i = 0; i < length; i++) {                  //inserting each digit of the number into array
            arr[i] = inputNumber % 10;
            inputNumber = inputNumber / 10;
        }
        int sumOfEven = 0;

        while (number != 0) {                       //finding the remainder and reversing the number method
            int rem = number % 10;
            sum = (sum * 10) + rem;
            number = number / 10;
        }


        int reverseNumber = sum;

        if (originalNumber == reverseNumber) {          //comparison between the original and reversed number
            flag = 1;
        } else {
            flag = 0;
        }

        if (flag == 1) {                    //if the number is palindrome, add the even digits
            for (i = 1; i < length; i++) {
                if (arr[i] % 2 == 0) {
                    sumOfEven = sumOfEven + arr[i];
                }
            }

            if (sumOfEven > 25) {                   //if the sum is greater than 25 then print the following message
                System.out.println(originalNumber + " is palindrome and the sum of the even numbers is greater than 25");
            } else {                                //else print the following message
                System.out.println(originalNumber + " is palindrome and the sum of the even numbers is less than 25");
            }
        } else {                        //print the following message if it is not palindrome
            System.out.println(originalNumber + " is not palindrome");
        }
    }

    public static void main(String[] args) {                //main method
palindromeChecker();                    //palindrome checker method call
    }
}