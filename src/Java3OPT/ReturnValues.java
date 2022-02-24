package Java3OPT;
//3
public class ReturnValues {
    static int myMethod(int x,int y){
        return y + x;
    }

    public static void main(String[] args) {
        System.out.println(myMethod(2,3));
        int z = myMethod(5,6);      //we can store the result
        System.out.println(z);
    }
}
