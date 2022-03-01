package Java3CPatternProblems;

import java.util.Scanner;
public class Practice1
{
    public static void main(String[] args)
    {
    //program to print 1-10
        int i=1;
        while (i<=10)
        {
            System.out.println(i);
            i++;
        }

    //program to print 1 to n
        Scanner sc = new Scanner(System.in);
        int j,n;
        System.out.println("Enter Number up-to which you want to print?");
        n = sc.nextInt();
        j = 1;
        while(j<=n)
        {
            System.out.println(j);
            j = j+1;
        }

    //Number is even or odd
        int a;
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter number:");
        a = sc2.nextInt();
        if(a%2==0)
            System.out.println("Even");
        else
            System.out.println("Odd");

    //Simple calculator(From if)
        int e,f,ch;   //ch represent choice
        Scanner sc3 = new Scanner(System.in);
        System.out.println("Enter First number:");
        e = sc3.nextInt();
        System.out.println("Enter Second number");
        f = sc3.nextInt();
        System.out.println("Enter your choice 1->ADD 2->SUB 3->MULTIPLY 4->DIVIDE \n Enter Your choice");
        ch = sc3.nextInt();
        if(ch==1)
            System.out.println("Addition=" + (e+f));
        else if(ch==2)
            System.out.println("Subtraction=" + (e-f));
        else if(ch==3)
            System.out.println("Multiply=" + (e*f));
        else if(ch==4)
            System.out.println("Divide=" + (e/f));
        else
            System.out.println("Invalid Choice");

    //Simple calculator(From Switch)
        int m,p,ch1;
        Scanner sc4 = new Scanner(System.in);
        System.out.print("Enter First number:");
        m = sc4.nextInt();
        System.out.print("Enter Second Number");
        p = sc4.nextInt();
        System.out.println("Enter your choice 1->ADD 2->SUB 3->MULTIPLY 4->DIVIDE \n Enter Your choice");
        ch1 = sc4.nextInt();
        switch (ch1)
        {
            case 1:
            {
                System.out.println("ADD=" + (m + p));
                break;
            }
            case 2:
            {
                System.out.println("SUB=" + (m - p));
                break;
            }
            case 3:
            {
                System.out.println("MULTIPLY=" + (m * p));
                break;
            }
            case 4:
            {
                System.out.println("DIVIDE=" + (m / p));
                break;
            }
            default:
                System.out.println("Invalid Choice");
        }

        }

    }

