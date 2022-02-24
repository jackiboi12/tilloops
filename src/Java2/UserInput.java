package Java2;

import java.util.Scanner;

public class UserInput

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

    }

}
