package Java4Methods;

public class JavaMethods1 {
    public static void main(String[] args) {
        myMethod();                             //Method1
        myMethod("Aditya",18);       //Method2
        int sum = myMethod(5,10);         //Method3
        System.out.println(sum);
        myMethod(17);                      //Method4
    }
        //Method1
        static void myMethod(){
            System.out.println("myMethod runs successfully");
        }
        //static means that the method belongs to the Main class and not an object of the Main class.
        //void means that this method does not have a return value

        //Method2
        static void myMethod(String fname,int age){
            System.out.println("Name: "+fname+ " Age: " + age);
        }

        //Method3
        static int myMethod(int x,int y){
            return y + x;
        }

        //Method4(AMethodWithIfElse)
        static void myMethod(int age) {
            // If age is less than 18, print "access denied"
            if (age < 18) {
                System.out.println("Access denied - You are not old enough!");
                // If age is greater than, or equal to, 18, print "access granted"
            } else {
                System.out.println("Access granted - You are old enough!");
            }
        }




}
