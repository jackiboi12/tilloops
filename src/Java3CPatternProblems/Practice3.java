package Java3CPatternProblems;

import java.util.Scanner;
public class Practice3
{
    public static void main(String[] args)
    {
        //Program to Find Reverse of a Number
        Scanner sc1= new Scanner(System.in);
        int n,rev=0;
        System.out.print("Enter number to find reverse:");
        n = sc1.nextInt();
        while(n>0)
        {
            rev = (rev*10)+n%10; //logic to find reverse of a number
            n = n/10;
        }
        System.out.println("Reversed number " + rev);

        //Program to Find Sum of Digits of a Number
        Scanner sc2 = new Scanner(System.in);
        int i,sum=0;
        System.out.println("Enter number to find sum of digits:");
        i = sc2.nextInt();
        while(i>0)
        {
            sum = sum + i%10;
            i = i/10;
        }
        System.out.println("Sum of digits =" + sum);

        //Program to Find Sum of Even & Product of Odd Digits of a Number
        Scanner sc3 = new Scanner(System.in);
        int j,sum1=0,prod=1,digit;
        System.out.println("Enter Number");
        j = sc3.nextInt();
        while(j>0)
        {
            digit = j%10;
            if(digit%2==0)
                sum1 = sum1 + digit;
            else
                prod = prod*digit;
            j = j/10;
        }
        System.out.println("sum of Evn numbers= "+ sum1 +" Product of odd numbers= " + prod);

        //Whether number is palindrome or not
        Scanner sc4 = new Scanner(System.in);
        int k,rev1=0,z;
        System.out.println("Enter number ");
        k = sc4.nextInt();
        z=k;
        while(k>0)
        {
            rev1 = (rev1*10)+(k%10);
            k = k/10;
        }
        if(rev1==z)
            System.out.println("Palindrome number");
        else
            System.out.println("Not a palindrome number");

        // Program to Find Product of Digits of a number
        Scanner sc5 = new Scanner(System.in);
        int l,prod1=1;
        System.out.println("Enter number");
        l = sc5.nextInt();
        while(l>0)
        {
            prod1 = prod1*l%10;
            l = l/10;
        }
        System.out.println("Product of digits = " + prod1);

    }

}
