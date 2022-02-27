package optional6;
//method overloading-> func. with same name with different parameters and return types
public class third {
    public static void main(String[] args) {

    float a1 = area(3);
    int a2 = area(20,30);
    System.out.println(a1);
        System.out.println(a2);
    }
    public static int area(int n1, int n2){
        int result = n1*n2;
        return result;
    }

    public static float area(int n){
        float result = 3.14f*n*n;
        return result;

    }
}
