package Java1;

public class BasicOfJava
{
    public static void main(String[] args)
    {
        //Example 1
        int myNum = 15;
        myNum = 20;  // myNum is now 20 change variable value
        System.out.println(myNum);
        short myNum1 = 3223;
        System.out.println(myNum1);
        float myNum2 = 334.4424f; //f is must
        System.out.println(myNum2);


        //Primitive Data types
/*
        Data Type	        Size	            Description
        byte	            1 byte	    Stores whole numbers from -128 to 127
        short	            2 bytes	    Stores whole numbers from -32,768 to 32,767
        int	             4 bytes	    Stores whole numbers from -2,147,483,648 to 2,147,483,647
        long	            8 bytes	    Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        float	            4 bytes 	    Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
        double	            8 bytes	    Stores fractional numbers. Sufficient for storing 15 decimal digits
        boolean	            1 bit	    Stores true or false values
        char	            2 bytes	    Stores a single character/letter or ASCII values
*/

/*
        Java Type Casting:
        Type casting is when you assign a value of one primitive data type to another type.
        In Java, there are two types of casting:

        Widening Casting (automatically) - converting a smaller type to a larger type size
        byte -> short -> char -> int -> long -> float -> double

        Narrowing Casting (manually) - converting a larger type to a smaller size type
        double -> float -> long -> int -> char -> short -> byte
*/

        //Example 2: Widening casting(Widening casting is done automatically when passing a smaller size type to a larger size type:)
        int num_1 = 9;
        double num_2 = num_1;
        System.out.println(num_1);
        System.out.println(num_2);

        //Example 3
        int a = 9;
        double b = a;                    // Automatic casting: int to double
        System.out.println(a);
        System.out.println(b);
        System.out.println();

        //Example 4: Narrowing Casting(Narrowing casting must be done manually by placing the type in parentheses in front of the value:)
        double num_3 = 9.3434d;
        int num_4 = (int)num_3;
        System.out.println(num_3);      //Output 9.3434d
        System.out.println(num_4);      // Outputs 9

        //Example 5
        double c = 5.6d;
        int d = (int)c;                 //Manual casting: double to int
        System.out.println(c);
        System.out.println(d);

        //Arithmetic Operators
/*
        Operator	    Name	        Description	                                    Example
            +	        Addition	    Adds together two values	                     x + y
            -	        Subtraction	    Subtracts one value from another	             x - y
            *	        Multiplication	Multiplies two values	                         x * y
            /	        Division	    Divides one value by another	                 x / y
            %	        Modulus	        Returns the division remainder	                 x % y
            ++	        Increment	    Increases the value of a variable by 1	          ++x
            --	        Decrement	    Decreases the value of a variable by 1	          --x
*/
        //Java Assignment Operators
/*
        Operator	        Name	                           Example
        ==	                Equal to	                        x == y
        !=	                Not equal	                        x != y
        >	                Greater than	                    x > y
        <	                Less than	                        x < y
        >=	                Greater than or equal to	        x >= y
        <=	                Less than or equal to	            x <= y

        //Java Logical Operators

/*
                Operator	   Name	                            Description	                                                             Example
                  && 	    Logical and	                Returns true if both statements are true	                                x < 5 &&  x < 10
                  || 	    Logical or	                Returns true if one of the statements is true	                            x < 5 || x < 4
                  !	        Logical not	                Reverse the result, returns false if the result is true	                    !(x < 5 && x < 10)

 */

        //Example 6
        int x = 5;
        ++x;    //Increases the value of a variable by 1
        System.out.println(x);
        --x;    //Decreases the value of a variable by 1
        System.out.println(x);

        //Example 7
        int y = 10;
        y += 5;   //y = y + 5
        System.out.println(y);

        //Example 8
        int a1 = 5;
        int b1 = 3;
        System.out.println(a1 >= b1); // Greater than or equal to

        //Example 9
        int q = 5;
        System.out.println(q > 3 && q < 10);    //&&(Logical and):Returns true if both statements are true
        int w = 5;
        System.out.println(w > 3 || w < 4);     //||(Logical or	):Returns true if one of the statements is true
        int e = 5;
        System.out.println(!(e > 3 && e < 10));     //!(Logical not	):Reverse the result, returns false if the result is true

        //Example 10
        //Example 1
        int a2 = 10;
        int b2 = 0;
        int c2 = 10;
        int d2 = 0;
        b2 = a2++;
        d2 = ++c2;
        System.out.println(a2);
        System.out.println(b2);
        System.out.println(c2);
        System.out.println(d2);
    }
}
