package Java4;
import java.util.*;
//2
public class Strings1 {
    public static void main(String[] args) {
        //<String_Type> <string_variable> = "<sequence_of_string>";

        //Example 1 (String declaration)
        Scanner sc = new Scanner(System.in);
        String name1 = sc.nextLine(); //sc.nextLine(): for whole line
        System.out.println("Your name is: " + name1);

        //Example 2 (concatenation)
        String fname = "tony";
        String lname = "Stark";
        String fullname = fname + " " + lname;
        System.out.println(fullname);
        System.out.println(fullname.length());

        //Example 3 (charAt)
        for(int i=0;i<fullname.length();i++){
            System.out.println(fullname.charAt(i));
        }

        //Example 4 (compare)
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

        //Example 5 (Substring)
        String sentence1 = "My meme is best";
        //substring(beginning index,ending index)
        String name5 = sentence1.substring(11,sentence1.length());
        System.out.println(name5);
        String sentence2 = "tonystark";
        String name6 = sentence2.substring(4);
        System.out.println(name6);

        //String are Immutable

        //Example 6
        String str = "123";
        int number = Integer.parseInt(str);
        System.out.println(number);

    }
}
