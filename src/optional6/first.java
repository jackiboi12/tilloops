package optional6;

public class first {
    public static void main(String[] args) {
        sparta();   //calling first function
        add(2,8);   //calling Second function

    }

//function should be inside main class
//First function (outside main method)
public static void sparta(){
    System.out.println("Hello sparta");
}

//Second function (outside main method)
public static void add(int a , int b){
    System.out.println(a+b);
    System.out.println((a+b)*2);


}

}
