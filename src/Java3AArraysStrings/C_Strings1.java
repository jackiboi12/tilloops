package Java3AArraysStrings;

public class C_Strings1 {
    public static void main(String[] args) {
        //Strings is a class in java,
        //It is derived datatype,also immutable.

/*
        Ways to create String objects:

        1)By string literals: by using ""
        ex: String str1 = "Hello";
            String str2 = "Hello";
            Every time a string literal is created , JVM will check whether that
            string already exists in String constant pool or not. If string already exist then a reference
            to the pooled instance is returned.otherwise a nw string instance is created in the pool.
            so, only one object will get created

        2)By new keyword: by using new keyword
        ex: String str1 = new String("hello");
            String str2 = new String("hello");
            Every time a string object is created in JVM will create it in heap memory.
            in this case JVM will not check whether the string already exist or not.
            even if it existed then also for every String object memory will get created.
 */

        //Example 1
        String str1 = "Hello ADITYA     ";
        System.out.println(str1.length());
        Integer strLength = 17;
        System.out.println(str1.charAt(2));     //returns char at specified index
        System.out.println(str1.replaceAll("l","@"));      //replaces all the occurence
        System.out.println(str1);
        System.out.println(str1.trim());    //eliminates white spaces

        System.out.println(str1.substring(2,4));       //print char btw range
        System.out.println(str1.compareTo("World"));
        System.out.println(strLength.toString());       //Integer to String

        //Example 2
        int a = 10;
        Integer aLength = 1;
        String str2 = String.valueOf(a);        //converts given type such as int, long, float, char etc. into String
        System.out.println(str2+10);    //concatenation of Strings
        System.out.println(aLength.toString());
    }
}
