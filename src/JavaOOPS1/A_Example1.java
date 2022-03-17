package JavaOOPS1;
public class A_Example1 {
    public static void main(String[] args) {
        Employee e1=new Employee();
        Employee e2=new Employee();

        e1.insert(101,"Ajeet",23333);
        e2.insert(222,"Ajay",22222);
        e1.display();
        e2.display();
    }
}
class Employee{
    int id;
    String name;
    float salary;
    void insert(int i, String n, float s){
        id = i;
        name = n;
        salary = s;
    }
    void display(){
        System.out.println(id+" " + name + " " + salary);
    }
}

