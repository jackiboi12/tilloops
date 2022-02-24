package Java5;
//2
public class ClassesObject{
    public static void main(String[] args) {
        //ClassFirstObjects
        Person p1 = new Person(33,"Aditya");
//      p1.age = 18;
//      p1.name = "Aditya";
        Person p2 = new Person(31,"Shivam sharma");
//      p2.name = "Adi";
//      p2.age = 19;
        System.out.println(p1.name + " " + p1.age + " " + p2.name + " " + p2.age  );
        p1.eat();
        p2.walk();
        p2.walk(5);
        Developer d1 = new Developer(24,"anuj");
        d1.eat();
        d1.walk();

    }

}
class Developer extends Person{
    public Developer(int age, String name){
        super(age, name);
    }

}

class Person{
    String name;    //property
    int age;        //property

    static int count;

    //constructor

    public Person(){
        count++;
        System.out.println("Creating an object");
    }

    public Person(int age , String name){
        this();     //calling one constructor from another
        this.name = name;
        this.age = age;


    }
    void walk(){    //behaviour
        System.out.println(name + " is walking");
    }
    void eat(){   //behaviour
        System.out.println(name + " is eating");
    }
    void walk(int steps){
        System.out.println(name + " walked "+ steps + " steps");
    }
}