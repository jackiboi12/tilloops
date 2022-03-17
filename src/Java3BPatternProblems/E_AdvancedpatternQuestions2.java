package Java3BPatternProblems;

public class E_AdvancedpatternQuestions2 {
    public static void main(String[] args) {
        //Example 1:0-1 Triangle
        int n =5;
        //outerloop
        for(int i1=1;i1<=n;i1++){
            for(int j1=1;j1<=i1;j1++){
                int sum = i1+j1;
                if(sum%2==0){
                    System.out.print("1 ");
                } else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }

        //Example 2:
            for(int i=1; i<=n; i++) {
                //spaces
                for(int j=1; j<=n-i; j++) {
                    System.out.print(" ");
                }

                //numbers
                for(int j=1; j<=i; j++) {
                    System.out.print(i+" ");
                }
                System.out.println();
            }

        //Example 3:Inverted Half pyramid with Numbers
        for(int i6=1;i6<=n;i6++){
            for(int j6=1;j6<=n-i6+1;j6++){
                System.out.print(j6);
            }
            System.out.println();
        }

        //Example 4:Floyd's Triangle
        int number = 1;
        for(int i7=1;i7<=n;i7++){
            for(int j7=1;j7<=i7;j7++){
                System.out.print(number+" ");
                number++;
            }
            System.out.println();
        }

        //Example 5:Floyd's Triangle
        int number1 = 1;
        for(int i7=1;i7<=n;i7++){
            for(int j7=1;j7<=i7;j7++){
                System.out.print(number1+" ");
                number1++;
            }
            System.out.println();
        }

    }
}
