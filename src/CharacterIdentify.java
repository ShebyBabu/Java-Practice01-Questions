//6. Write a program that takes a character from the user as input and determines whether the
//character entered is a capital letter, a small case letter, a digit or a special symbol and display
//appropriately.
//Input: A
//Output: Capital letter

import java.util.Scanner;
public class CharacterIdentify {

    public static void characterIdentify()   {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the character: ");        //enter the input
        String letter=s.nextLine();

        char ch=letter.charAt(0);       //converting the string letter to character

        if(Character.isDigit(ch))       //condition to check if the character is digit or not
        {
            System.out.println("The character is a digit");
        }

        else if(Character.isUpperCase(ch))      //condition to check if the character is in Upper Case or not
        {
            System.out.println("Upper Case");
        }

        else if(Character.isLowerCase(ch))      //condition to check if the character is in Lower Case or not
        {
            System.out.println("Lower Case");
        }

        else                //check if the character is in special character or not
        {
            System.out.println("Special Character");
        }
    }
    public static void main(String[] args) {
    characterIdentify();            //function call
    }

}
