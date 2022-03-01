package Java4Methods;

public class MethodOverloading1 {
        //1. Overloading by changing the number of parameters
        //one parameter
        public static void display(int a1){
            System.out.println("Arguments: " + a1);
        }
        //two parameter

        public static void display(int a1, int b1){
            System.out.println("Arguments: " + a1 + " and " + b1);
        }
        //2. Method Overloading by changing the data type of parameters
        // this method accepts int
        public static void display1(int a2){
            System.out.println("Got Integer data.");
        }
        // this method  accepts String object
        public static void display1(String a2){
            System.out.println("Got String object.");
        }

        public static void main(String[] args) {
            display(1);
            display(1, 4);
            display1(2);
            display1("Hello");
        }



}
