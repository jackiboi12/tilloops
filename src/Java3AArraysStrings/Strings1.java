package Java3AArraysStrings;
import java.util.*;
//2
public class Strings1 {
    public static void main(String[] args) {

        //Example 1 (concat and charAt)
        String fname = "tony";
        String lname = "Stark";
        String fullname = fname.concat(lname);      //String fullname = fname + " " + lname;
        System.out.println(fullname);

        System.out.println(fullname.length());      //length of a string

        System.out.println(fullname.charAt(0));     //The charAt() method returns the character at the specified index in a string.
        for(int i=0;i<fullname.length();i++){
            System.out.println(fullname.charAt(i));
        }

        //Example 2A (compare)
        String name2 = "tony";
        String name3 = "tony";
        //1 s1>s2: positive value
        //2 s1==s2: 0
        //3 s1<>>s2: negative value
        if(name2.compareTo(name3)==0)
        {
            System.out.println("String are equal");
        }
        else{
            System.out.println("String are not equal");
            }

        //Example 2B(compare two strings with Boolean)
        String lang1 = "JAVA", lang2 = "C++";
        boolean sameLang = lang1.equals(lang2);
        System.out.println(sameLang);

        //Example 3 (Substring)
        String sentence1 = "My meme is best";
        //substring(beginning index,ending index)
        String name5 = sentence1.substring(11,sentence1.length());
        System.out.println(name5);

        //String are Immutable

        //Example 4
        String str = "123";
        int number = Integer.parseInt(str);
        System.out.println(number);

        //Example 5 (String declaration)
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name1 = sc.nextLine();       //sc.nextLine(): for whole line
        System.out.println("Your name is: " + name1);

        //Example 6(new keyword)
        String lang3 = new String("JAVA PROGRAMMING");
        System.out.println(lang3);

    }
}
