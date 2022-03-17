package JavaOopsAProblems;
//Find factorial of a number
import java.util.Scanner;

public class Question3 {
    public static void printFactorial(int n ){
        if(n<0){
            System.out.println("invalid Number");
            return;
        }
        int factorial =1;
        for(int i=n;i>=1;i--){
            factorial = factorial*i;
        }
        System.out.println(factorial);
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printFactorial(n);
    }
}
