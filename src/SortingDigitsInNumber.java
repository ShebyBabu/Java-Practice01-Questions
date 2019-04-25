//7. Write a program which accepts a number as input from user and perform the following:
//a. sort the number in non-increasing order
//b. after sorting sum all the even numbers, the sum should be greater than 15 .
//c. if sum is more than 15,then print output as true or false.
//Input : 234534
//Output : Sorted number in non-increasing order : 544332
//
//Sum of even numbers : 10
//False
//
//-------------------------------------------------------------------------------------------------------------------------------

import java.util.Scanner;
public class SortingDigitsInNumber {
    public static void sortNumber() {
        Scanner s=new Scanner(System.in);
        int i,j,temp,sum=0;

        System.out.println("Enter the number"); //enter the input number
        int number=s.nextInt();
        int length=String.valueOf(number).length();     //finding the length of the number

        int[] unsorted_array=new int[length];
        for(i=0;i<length;i++)
        {
            unsorted_array[i]=number%10;
            number=number/10;
        }


        System.out.println("The unsorted list :     ");
        for(i=length-1;i>=0;i--)
        {
            System.out.println(unsorted_array[i]);
        }

        System.out.println("The sorted list :       ");
        for(i=0;i<length;i++)
        {
            for(j=i+1;j<length;j++)
            {
                if(unsorted_array[i]<unsorted_array[j])
                {
                    temp=unsorted_array[j];
                    unsorted_array[j]=unsorted_array[i];
                    unsorted_array[i]=temp;
                }
            }
        }

        System.out.println("The sorted list :     ");
        for(i=0;i<length;i++)
        {
            System.out.println(unsorted_array[i]);
        }

        for(i=0;i<length;i++)
        {
            if(unsorted_array[i]%2==0)
            {
                sum=sum+unsorted_array[i];
            }

        }
        System.out.println("The sum is :    "+sum);

        if(sum>15)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");

        }
    }
    public static void main(String[] args) {
        sortNumber();
    }
}
