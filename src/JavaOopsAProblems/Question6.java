package JavaOopsAProblems;
import java.util.Scanner;
// Java program to find Sum of Positive numbers only
public class Question6 {
    public static void main(String[] args) {
        int sum = 0;

        //create an object of scanner class
        Scanner input = new Scanner(System.in);

        //take integer input from the user
        System.out.println("Enter a number");
        int number = input.nextInt();

        //while loop continues
        //until entered number is positive
        while(number>=0){
            //add only positive number
            sum +=number;
            System.out.println("Enter a number");
            number = input.nextInt();
        }
        System.out.println("sum= " +sum);
        input.close();


    }
}
