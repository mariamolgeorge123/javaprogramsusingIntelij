package AssignmentUsingMethods;

import java.util.Scanner;

public class SingleCharacter {
    public void singleData()
    {

        System.out.println("Enter a character");
        Scanner sc=new Scanner(System.in);
        String data=sc.next();
        if(data.length()>1)
        {
            System.err.println("Error. Input letter  is not a single character");
        }
        else {
            if((data.charAt(0)>=65 && data.charAt(0)<=90)||(data.charAt(0)>=97 && data.charAt(0)<=122)) {
                if (data.charAt(0) == 'a' || data.charAt(0) == 'e' || data.charAt(0) == 'i' || data.charAt(0) == 'o' || data.charAt(0) == 'u'
                        || data.charAt(0) == 'A' || data.charAt(0) == 'E'
                        || data.charAt(0) == 'I' || data.charAt(0) == 'O' || data.charAt(0) == 'U') {
                    System.out.println("Input letter  is a Vowel");
                } else {
                    System.out.println("Input letter  is a Consent");
                }
            }
            else
            {
                System.err.println("Error. Input letter is not a  Alphabet");
            }
        }
    }


    public static void main(String[] args) {
        SingleCharacter single=new SingleCharacter();
        single.singleData();
}
}