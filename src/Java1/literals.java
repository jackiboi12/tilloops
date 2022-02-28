package Java1;
//4 OPTIONAL
public class literals {
    public static void main(String[] args) {

        //Literals are data used for representing fixed values.
        //There are 5 types:

        //1)boolean literals-> Stores two values
        boolean flag1 = false;      // Here false is boolean literals
        boolean flag2 = true;       // Here True is boolean literals
        System.out.println(flag2 +" "+ flag1);

        //2)Integer Literals-> Stores numeric value , 4 Types are:
        // a)binary(base 2)
        int binaryNumber = 0b10010;// 0b represents binary
        // b)octal(base 8)
        int octalNumber = 027;
        // c)decimal(base 10)
        int decNumber = 34;
        // d)hexadecimal(base 16)
        int hexNumber = 0x2F; // 0x represents hexadecimal
        //In Java, binary starts with 0b, octal starts with 0, and hexadecimal starts with 0x.
        System.out.println(binaryNumber+" "+octalNumber+" "+decNumber+" "+hexNumber);

        //3)Floating-point Literals->stores either fractional form or exponential form
        double myDouble = 3.4;
        float myFloat = 3.4F;
        double myDoubleScientific = 34.143434e4;     //34.143434*10^4
        System.out.println(myDouble+" "+" "+myFloat+" "+myDoubleScientific );

        //4)Character Literals-> stores unicode characters enclosed in single quotes
        char letter = 'a';
        System.out.println(letter);

        //5)String Literals-> stores sequence of character
        String str1 = "Java is OP";
        System.out.println(str1);
    }
}
