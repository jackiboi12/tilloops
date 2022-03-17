package JavaOOPS2;

public class C_MethodOverloading {

    static int plusMethod(int x, int y){
        return x+y;
    }
    static double plusMethod(double x, double y){
        return x+y;
    }

    public static void main(String[] args) {
        int myNum1 = plusMethod(8,5);
        double myNum2 = plusMethod(3.4,53.4);
        //Multiple methods can have the same name as long as the number and/or type of parameters are different.
        System.out.println("int: " + myNum1);
        System.out.println("double: " + myNum2);
    }
}

