package JavaOOPS1;

public class A_ObjectsAndClasses {
/*3 ways to initialize object
    1)By reference variable
    2)By method
    3)By constructor
*/
    public static void main(String[] args) {
        //1)By reference variable
        Student s1 = new Student();
        s1.id = 121;
        s1.name = "Aditya";
        Student s2 = new Student();
        s2.id = 234;
        s2.name = "Luffy";
        System.out.println(s1.name + " "+ s1.id);
        System.out.println(s2.name + " "+ s2.id);

        System.out.println();

        //2)By method
        Student1 v1=new Student1();
        Student1 v2=new Student1();
        v1.insertRecord(111,"Karan");
        v2.insertRecord(222,"Aryan");
        v1.displayInformation();
        v2.displayInformation();


    }
}
//1)By reference variable
class Student{
    int id;
    String name;
}
//2)By method
class Student1{
    int rollno;
    String name;
    void insertRecord(int r, String n){
        rollno=r;
        name=n;
    }
    void displayInformation(){System.out.println(rollno+" "+name);}

}

