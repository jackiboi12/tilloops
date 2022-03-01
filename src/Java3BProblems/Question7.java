package Java3BProblems;
import java.util.Scanner;
// Java program to find the sum of positive numbers

public class Question7 {
    public static void main(String[] args) {
        int sum = 0,number=0;

        //create an object of Scanner class
        Scanner input = new Scanner(System.in);

        //do..while loop continues
        //until entered number is positive
        do{
            //add only positive number
            sum+= number;
            System.out.println("Enter a number");
            number = input.nextInt();

        }while(number>=0);
        System.out.println("Sum = " + sum);
        input.close();

/*
        NOTE:
        The for loop is used when the number of iterations is known.
        And while and do...while loops are generally used when the number of iterations is unknown.

 */

    }
}
