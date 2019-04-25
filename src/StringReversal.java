import java.util.Scanner;

//9. Write a program to reverse any string without using String Buffer.
//Input : london
//Output : nodnol
public class StringReversal {
    public static void reversalOfString() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the string: ");       //enter a string
        String input = s.nextLine();
        char[] word = input.toCharArray();          //convert string to array of characters
        int length = word.length;                   //length of the array
        char[] reverse = new char[length];          //initiating an array of reverse


        for (int i = length - 1; i >= 0; i--) {     //reversing the array of characters using for loop
            reverse[i] = word[i];
            System.out.print(reverse[i]);           //printing the reversed string
        }
    }
    public static void main (String[] args) {
        reversalOfString();                 //function call
        }
        }


