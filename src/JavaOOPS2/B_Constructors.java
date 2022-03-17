package JavaOOPS2;
//TOPIC NOT FULLY DONE
public class B_Constructors {
    private String name;

    //constructor
    B_Constructors(){
        System.out.println("Constructor Called:");
        name = "Programiz";
    }

    public static void main(String[] args) {
        //cons is invoked while
        //creating an object of the main class
        B_Constructors obj = new B_Constructors();
        System.out.println("The name is " + obj.name);
    }
}
