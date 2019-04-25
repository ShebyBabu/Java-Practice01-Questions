//2. Write a program which accepts an integer number as input from the user and perform the
//following conditional checks:
//a. Print Tom if number is odd and exists between 20 to 30
//b. Print Jerry, if number is even and exists between 20 and 30


import java.util.Scanner;
public class oddOrEven {
    public static void oddEven()    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number: ");   //enter the input
        int number=s.nextInt();

        if(number>=20 && number<=30)        //condition to check if the number is between 20 and 30
        {
            if(number%2!=0)         //if the number is odd then print Tom
            {
                System.out.println("Tom");
            }

            else    {           //if the number is even then print Jerry
                System.out.println("Jerry");
            }
        }

        else            //if the number is not between 20 and 30, then print error
        {
            System.out.println("Not valid input");
        }
    }
    public static void main(String[] args) {
        oddEven();          //function call
    }
}
