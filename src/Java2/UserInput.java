package Java2;
//3
import java.util.Scanner;

 class UserInput

{
    public static void main(String[] args)
    {
        //Example 1
        Scanner sc = new Scanner(System.in);    //Here "sc" is a variable name which can be change
        //System.in -> read from keyboard
        System.out.print("Enter number 1: ");
        int a = sc.nextInt();
        System.out.print("Enter number 2: ");
        int b = sc.nextInt();
        int sum = a+b;
        System.out.print("number1 + number2 is ");
        System.out.println(sum);

        //Example 2
        Scanner myObj = new Scanner(System.in);
        String userName;
        System.out.print("Enter username: ");
        userName = myObj.nextLine();
        System.out.println("Username is: " + userName);

        //Example 3
        Scanner input = new Scanner(System.in);
        // Getting float input
        System.out.print("Enter float: ");
        float myFloat = input.nextFloat();
        System.out.println("Float entered = " + myFloat);
        // Getting double input
        System.out.print("Enter double: ");
        double myDouble = input.nextDouble();
        System.out.println("Double entered = " + myDouble);
        // Getting String input
        System.out.print("Enter text: ");
        String myString = input.next();
        System.out.println("Text entered = " + myString);

    }

}
