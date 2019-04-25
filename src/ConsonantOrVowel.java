//3. Create a program that accepts a word as input and checks for each single character letter in
//the word whether it is a consonant or vowel.
//Condition:
//a. Print an error message if the input is not a letter
//b. If the input having more than one letter, print the required output
//(Vowel or Consonant) for each letter
//Input : p
//Output : Consonant
//Input : ap
//Output : Vowel Consonant (should it be a - vowel, p - consonant)
//-------------------------------------------------------------------------------------------------------------------------
import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;
import java.util.*;
public class ConsonantOrVowel {
    public static void consonantVowel() {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the word : ");        //enter the word
        String word=s.nextLine();
        //String[] sarray=word.split("");

        /*for(int i=0;i<=sarray.length;i++)
        {
            if(sarray[i]=='a' || sarray[i]=='A' || )
        }*/

        int length=word.length();
        for(int i=0;i<length;i++)
        {
            char ch=word.charAt(i);             //getting each character from the string
            if(Character.isDigit(ch))           //condition to check if the character is digit or not
            {
                System.out.println("Error");        //if the character is digit then print error
            }

            else if(ch=='a' || ch=='A' || ch=='e' || ch=='E' || ch=='i' || ch=='I' || ch=='o' || ch=='O' || ch=='u' || ch=='U')
            {
                System.out.println(ch + ": Vowel");         //condition to check if the character is vowel or not and print
            }

            /*if(Character.isDigit(ch))
            {
                System.out.println(ch + ":Not valid");
            }*/

            else
            {
                System.out.println(ch + ":Consonant");      //if the character is consonant then print consonant
            }


        }
    }
    public static void main(String[] args) {
        consonantVowel();       //function call
    }
}
