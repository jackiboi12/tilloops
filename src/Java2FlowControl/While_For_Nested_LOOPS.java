package Java2FlowControl;
//4
public class While_For_Nested_LOOPS
{
    public static void main(String[] args)
    {
        //While Loop
/*
        Syntax:
        while (testExpression) {
            // body of loop
        }
        Java while loop is used to run a specific code until a certain condition is met.
*/
        //Example 1
        int i = 0,n1=5;
        while (i <=n1) {
            System.out.println(i);
            i++;
        }

        //The Do/While Loop
/*
        Syntax:
        do {
        // body of loop
        } while(textExpression);
        The loop will always be executed at least once,
        even if the condition is false,
        because the code block is executed before the condition is tested
*/
        //Example 2
        int j = 0;
        do
        {
            System.out.println(j);
            j++;
        }
        while(j<5);

        // For Loop
/*
        Syntax:
        for (initialExpression; testExpression; updateExpression) {
            // body of loop
        }
        When you know exactly how many times you want to loop through a block of code,
        use the for loop instead of a while loop
*/
        //Example 3
        for (int k = 5; k > 0; --k) //for (statement 1; statement 2; statement 3)
        {
            System.out.println(k);
        }

        //Example 4
        int sum=0,n=1000;
        //for loop
        for(int loop1=1;loop1<=n;loop1++){
            sum += loop1;   //sum =sum+loop1
        }
        System.out.println("Sum:" + sum);

        //For-Each Loop
/*
        Syntax:
        for(datatype item:array){
            ...
        }
        a)array - an array or a collection
        b)item - each item of array/collection is assigned to this variable
        c)dataType - the data type of the array/collection
        In Java, the for-each loop is used to iterate through elements of arrays and collections (like ArrayList).
*/

        //Example 5
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String l : cars) {
            System.out.println(l);
        }

        //Example 6
        int[] numbers = {3,2,4,22};
        for(int number:numbers){
            System.out.println(number);
        }

        //Example 7
        int[] num1 = {3,4,2,-2,6};
        int sum1 = 0;
        for(int i2: num1){
            sum1 +=i2;
        }
        System.out.println("Sum: "+sum1);


    }
}
