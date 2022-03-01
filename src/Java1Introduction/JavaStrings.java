package Java1Introduction;
//3
public class JavaStrings {
    public static void main(String[] args) {
        //Example 1
        String txt = "HELLO ITS ME GOKU";
        System.out.println("The length of the txt string is: " + txt.length());
        System.out.println(txt.toUpperCase());
        System.out.println(txt.toLowerCase());

        //Example 2
        String firstName = "Aditya";
        String lastName = "Jakhmola";
        System.out.println(firstName + " " + lastName); //concatenation

        //Example 3:The backslash (\) escape character turns special characters into string characters:
        String TXT1 = "We are the so-called \"Vikings\" from the north.";   //The sequence \"  inserts a double quote in a string
        System.out.println(TXT1);
        String TXT2 = "It\'s alright.";     //The sequence \'  inserts a single quote in a string:
        System.out.println(TXT2);
        String TXT3 = "The character \\ is called backslash";       //The sequence \\  inserts a single backslash in a string:
        System.out.println(TXT3);

        //Example 4
        String word = "Hello\nWorld!";
        System.out.println(word);

        //Example 5
        System.out.println(Math.sqrt(100));     //The Math.sqrt(x) method returns the square root
        System.out.println(Math.abs(-333.3));    //The Math.abs(x) method returns the absolute (positive) value

        //Example 6
        boolean isJavaFun = true;
        boolean isCodingEasy = false;
        System.out.println(isCodingEasy);
        System.out.println(isJavaFun);

        //Example 7
        int x = 10;
        int y = 2;
        System.out.println(x>y);    //boolean value

    }
}
