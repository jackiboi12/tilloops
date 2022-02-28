package Java2;
//4
public class While_For_Nested_LOOPS
{
    public static void main(String[] args)
    {
    //Example 1:While Loop
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }

    //Example 2:The Do/While Loop
        /*
        The loop will always be executed at least once,
        even if the condition is false,
        because the code block is executed before the condition is tested
         */
        int j = 0;
        do
        {
            System.out.println(j);
            j++;
        }
        while(j<5);

    //Example 3: For Loop
        /*
        When you know exactly how many times you want to loop through a block of code,
         use the for loop instead of a while loop
        */
        for (int k = 5; k > 0; --k) //for (statement 1; statement 2; statement 3)
        {
            System.out.println(k);
        }

    //Example 4:For-Each Loop->which is used exclusively to loop through elements in an array
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String l : cars) {
            System.out.println(l);
        }

    }
}
