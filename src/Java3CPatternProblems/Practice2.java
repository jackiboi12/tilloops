package Java3CPatternProblems;

import java.util.Scanner;
public class Practice2
{
    public static void main(String[] args)
    {
    //Program to find max between two numbers
        int a,b;
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter First number:");
        a = sc1.nextInt();
        System.out.println("Enter second number:");
        b = sc1.nextInt();
        if(a>b)
            System.out.println("Max Number = "+a);
        else
            System.out.println("Max Number = "+b);

    //Program to find max between three numbers
        int e,f,g;
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter First number");
        e = sc2.nextInt();
        System.out.println("Enter Second number");
        f = sc2.nextInt();
        System.out.println("Enter Third Number");
        g = sc2.nextInt();
        if(e>f && e>g)
        {
            System.out.println("Max Number =" + e);
        }
        else if (f>e && f>g)
        {
            System.out.println("Max Number =" + f);
        }
        else
        {
            System.out.println("Max number = " + g);
        }

    //Program to find sum f first "N" Natural numbers
        int n,i,add=0;
        System.out.println("Enter number to find sum ");
        Scanner sc3 = new Scanner(System.in);
        n = sc3.nextInt();
        i = 1;
        while(i<=4)
        {
            add = add+i;
            i = i+1;
        }
        System.out.println("Sum of all numbers is = " +add);

    }

}
