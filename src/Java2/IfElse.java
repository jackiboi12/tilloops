package Java2;
//1
//if-else:if statement is the most simple decision making statement. It is used to decide whether a certain statement or block of statements will be executed or not,
// We can use the else statement with if statement to execute a block of code when the condition is false
public class IfElse {
    public static void main(String[] args) {
        //Example 1
        int a = 10;

        if (a < 15)
            System.out.println("i is smaller than 15");
        else
            System.out.println("i is greater than 15");

        //Example 2
        int n = 0;
        if(n==0)
        {
            System.out.println("Nothing");
            System.out.println("Bye");
        } //{} used when we have to print more than 2 lines
        else if(n%2==0)     //Use else if to specify a new condition to test, if the first condition is false
                System.out.println("Even");
        else
                System.out.println("Odd");

        //Example 3
        int i = 5;
        int j =0;
        // if(i>6)
        //    j=1;
        //else
        //   j=2;
        j = i>6?1:2;    // Ternary operator: ?: ->condition(use expr1 when true otherwise use expr2)expr1:expr2
        System.out.println(j);

        //Example 4
        int b = 11;
        if(b<15)
        {
            if(b>8)
            {
                System.out.println("b is greater than 8");
            }
            if(b>12)
            {
                System.out.println("b is greater than 12 also");
            }
        }
        else
            System.out.println("b is smaller than 10");



    }
}
