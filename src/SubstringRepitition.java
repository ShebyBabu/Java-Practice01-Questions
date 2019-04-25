//10. Write a program for the following condition:
//Given 2 inputs , where input1 is string and input 2 is integer value, the last n characters should
//repeat n number of times in the output String.
//Input1: Stackroute
//Input2: 5
//Output1: Stackrouterouterouterouterouteroute
//
//Input1: Stackroute
//Input2: 2
//Output1: Stackroutetete


import java.util.Scanner;           //imported packages for scanner classes
public class SubstringRepitition {
    public static void substringRepeating()  {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the string: ");       //enter the string
        String string=s.nextLine();
        System.out.println("Enter the value");          //enter the value
        int position=s.nextInt();

        int length=string.length();         //length of the string

        String subString=string.substring(position,length);   //finding the substring from the positon specified till the length of the string
        //System.out.println(subString);


        for(int i=0;i<position;i++) {           //repeat the substring position number of times
            string=string+subString;
        }
        System.out.println(string);


    }
    public static void main(String[] args) {            //main method
        substringRepeating();           //function call
    }

}
