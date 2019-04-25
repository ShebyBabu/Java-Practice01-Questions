//4. Write a program using a loop to print the following output. 1 2 2 3 3 3 4 4 4 4 5 5 5 5 5 6 6 6 6
//6 6 . . . nth iteration.
//Input: 5
//Output : 1 2 2 3 3 3 4 4 4 4 5 5 5 5 5


import java.util.Scanner;
public class Pattern {
    public static void patternMaker()   {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the limit: ");        //enter the limit
        int limit=s.nextInt();

        for(int i=1;i<=limit;i++)       //nested for loop for pattern making
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args) {

        patternMaker();     //function call
    }
}
