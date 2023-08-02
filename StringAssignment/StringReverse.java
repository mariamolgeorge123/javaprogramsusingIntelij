package StringAssignment;

import java.util.Scanner;

public class StringReverse {

        public void reverse(String str)
        {
//            for(int i=str.length()-1;i>=0;i--)
//            {
//                System.out.print(str.charAt(i));
//            }
            int len=str.length();
            char[] ch=str.toCharArray();
            for (int i = str.length()-1; i>=0 ; i--) {
                System.out.print(ch[i]);
            }
    }

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
        System.out.println("Enter String");
        String s=sc.next();
        StringReverse st=new StringReverse();
        st.reverse(s);
    }
}
