//5. Write a program that reads an unspecified number of integer arguments using Scanner Class
//and adds them together. The program should display total of the given input number and should
//only consider integer value.The program should display an error message if there are any non
//integer values
//Input : 12 23 2 4
//Output : 41
//-------------------------------------------------------------------------------------------------------------------------------

import java.util.Scanner;
public class SumOfNumbers {
    public static void sumNumber(){
    Scanner s=new Scanner(System.in);
        System.out.println("Enter the limit: ");        //enter the limit
    int limit=s.nextInt();
    int sum=0;
        System.out.println("Enter the numbers: ");      //enter the input
        for(int i=0;i<limit;i++)
    {
        int number=s.nextInt();
        sum=sum+number;         //add each number into the sum variable
    }
        System.out.println("The output is   "+sum);
}
    public static void main(String[] args) {
       sumNumber();         //function call
    }
}
