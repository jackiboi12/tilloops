package Java5;
//
class Pen{
    String color;
    String type;
    public void write(){
        System.out.println("Writing something");
    }
    public void printColor(){
        System.out.println(this.color);
    }
}

class Student{
    String name;
    int age;
    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
}

public class OOPS {
    public static void main(String args[]){
/*        Pen pen1 = new Pen();
        pen1.color = "Blue";
        pen1.type = "Gel";
        pen1.write();

        Pen pen2 = new Pen();
        pen2.color = "Red";
        pen2.type = "Ball";

        pen1.printColor();
        pen2.printColor();
*/
        Student s1 = new Student();
        s1.name = "Aman";
        s1.age = 24;
        s1.printInfo();





    }
}
