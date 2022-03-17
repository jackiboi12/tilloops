package JavaOOPS1;

public class B_JavaMethods1 {
    public static void main(String[] args) {
        myMethod();                             //Method1

        myMethod("Aditya",18);       //Method2

        int sum = myMethod(5,10);         //Method3

        System.out.println(sum);

        add(2,4);                         //Method4

        myMethod(17);                      //Method5

        //Method 6
        //create OBJ.
        B_JavaMethods1 obj = new B_JavaMethods1();
        int result = obj.additionOfNumber(3,5);
        System.out.println(result);
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

        //Method 4
        public static void add(int a , int b){
            System.out.println(a+b);
            System.out.println((a+b)*2);

        }

        //Method5(AMethodWithIfElse)
        static void myMethod(int age) {
            // If age is less than 18, print "access denied"
            if (age < 18) {
                System.out.println("Access denied - You are not old enough!");
                // If age is greater than, or equal to, 18, print "access granted"
            } else {
                System.out.println("Access granted - You are old enough!");
            }
        }

        //Method6(return type)
        public int additionOfNumber(int num1, int num2){
            int result = num1+num2;
            return result;
        }




}
