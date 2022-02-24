package Java4;
import java.util.*;
//3
public class Strings2 {
    public static void main(String[] args)
    {
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

        //Example 1
        //char at index 0
        System.out.println(sb.charAt(0));

        //Example 2
        //set char at index 0
        sb.setCharAt(0,'P');
        System.out.println(sb);

        //Example 3
        sb.insert(2,'n');
        sb.insert(1,'T');
        System.out.println(sb);

        //Example 4
        sb.delete(0,1);    //ending index not applicable
        System.out.println(sb);

        //Example 5
        StringBuilder sb1 = new StringBuilder("h");
        sb1.append("e");
        sb1.append("l");
        sb1.append("l");
        sb1.append("o");
        System.out.println(sb1);
        System.out.println(sb1.length());

        //Example 6 (reverse String)
        StringBuilder v1 = new StringBuilder("tony Stark");
        System.out.println("String = " + v1);
        StringBuilder v2 = v1.reverse();       // reverse the string
        System.out.println("Reverse String = " + v2);

















    }
}
