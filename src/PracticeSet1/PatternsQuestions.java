package PracticeSet1;

import java.util.Scanner;
public class PatternsQuestions
{
    public static void main(String[] args)
    {
        int n = 4;
        int m = 5;
        //Example 1:Solid rectangle
       //outer loop(rows)->horizontally
        for(int i=1; i<=n;i++)      //for(initialization; condition; increment)
        {
            // inner loop(columns)-> vertically
            for(int j=1;j<=m;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        //Example 2:Hollow rectangle
        //outer loop
        for(int k=1;k<=n;k++) {
            //inner loop
            for(int l=1;l<=m;l++) {
                //cell->(k,l)
                if(k==1 || l==1 || k==n || l==m) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        //Example 3:Half pyramid

        // a)
        int n1,i1,j1;
        Scanner sc1= new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        n1 = sc1.nextInt();
        for(i1=1;i1<=n1;i1++)
        {
            for(j1=1;j1<=i1;j1++)
            {
                System.out.print('*'); //replace '*' with i,j,i+j to get other output
            }
            System.out.println();
        }

        //b
        int n2,j2;
        Scanner sc2= new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        n2 = sc2.nextInt();
        for( ;n2>=1;n2--)
        {
            for(j2=1;j2<=n2;j2++)
            {
                System.out.print("*");   //replace '*' with i,j,i+j to get other output
            }
            System.out.println();
        }

        //Example 4:inverted half pyramid
        for(int i4 =1;i4<=n;i4++ ){
            //inner loop -> space print
            for(int j4=1; j4<=n-i4;j4++){
                System.out.print(" ");
            }

            //inner loop -> star print
            for(int j4=1;j4<=i4;j4++){
                System.out.print("*");
            }
            System.out.println();
        }

        //Example 5:Half pyramid with Numbers
        for(int i5=1;i5<=5;i5++){
            for(int j5=1;j5<=i5;j5++){
                System.out.print(j5+ " ");
            }
            System.out.println();
        }

        //Example 6:Inverted Half pyramid with Numbers
        for(int i6=1;i6<=n;i6++){
            for(int j6=1;j6<=n-i6+1;j6++){
                System.out.print(j6);
            }
            System.out.println();
        }

        //Example 7:Floyd's Triangle
        int number = 1;
        for(int i7=1;i7<=n;i7++){
            for(int j7=1;j7<=i7;j7++){
                System.out.print(number+" ");
                number++;
            }
            System.out.println();
        }

    }
}
