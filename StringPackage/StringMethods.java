package StringPackage;

public class StringMethods {
    public static void main(String[] args) {
        String s1="b";
        String s2="a";
        String s4="a";
        String s3="pragra";
        System.out.println(s1.compareTo(s2)); //compare lexicographically(alphabetically) output is 1
        System.out.println(s2.compareTo(s1)); //-1
        System.out.println(s2.compareTo(s4));//0
        System.out.println(s3.length());//6
        System.out.println(s3.substring(1));//ragra
        System.out.println(s3.substring(2, 5));//agr


        System.out.println(s3.replace("pr", "Ni")); //Niagra
        System.out.println("Ni"+s3.substring(2,6));//Niagra

        String s7=" pragra1";
        System.out.println(s7);
        System.out.println(s7.trim()); //remove white space
        int num=10;
        String str=String.valueOf(num);
        System.out.println(str); //string now 10
        System.out.println(str+10);//1010


        System.out.println(s3.isEmpty()); //true
        System.out.println(s7.concat("institute")); // pragra1institute
        System.out.println(s7.contains("ragr"));//true

        System.out.println(s7.contentEquals("ragr"));//false
        System.out.println(s7.contentEquals(" pragra1"));//true
        String s8="pragraremr"; //9
        System.out.println(s8.lastIndexOf('r'));
        System.out.println(s7.indexOf("a"));
        System.out.println(s7.indexOf('a'));
        System.out.println(s8.lastIndexOf("r"));
        System.out.println(s7.toUpperCase());
        System.out.println(s7);
        System.out.println(s7.length());



//
//        String s1 = "pragra";
//        String s2 = "XYZ";
//        String s3 = "keyboard";
//
//        //System.out.println(s1.compareTo(s2));
//        //System.out.println(s1.concat(s2));
//        System.out.println(s1.replace('A', 'P'));
//        System.out.println(s1.contains("Abc"));
//        System.out.println(s1.contentEquals("Abc"));
//
//        System.out.println(s1.indexOf("A"));
//        System.out.println(s1.isEmpty());
//        System.out.println(s1.toUpperCase());
//
//        // array length ? arr.length ---- > property
//        // length()  -- > method
//        System.out.println(s1.length());
//// p r a g ra
//        System.out.println(s1.lastIndexOf("a"));
//        System.out.println(s1.substring(2));
//
//        // probelm :
//        // create a string as pragra and make it as Niagra.
//        // substring and replace.
//
//        String name = "    Pragra     ";   // op -- Niagra
//        //System.out.println(name.replace("Pr", "Ni"));
//        System.out.println(name);
//
//        System.out.println(name.trim());
//
//        int num = 10;
//        String s = String.valueOf(num);
//        System.out.println(s + 10);



    }
}
