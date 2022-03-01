package Java3BProblems;
//Function to add 2 numbers and return the sum
import java.util.Scanner;

public class Question1 {
    public static int calculateSum(int a, int b){
        int sum = a+b;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("First number: ");
        int a = sc.nextInt();
        System.out.print("Second number: ");
        int b = sc.nextInt();
        int sum = calculateSum(a,b);
        System.out.println("sum of 2 numbers is: " + sum);

    }
}
