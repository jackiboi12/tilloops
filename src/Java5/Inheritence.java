package Java5;
//5

class Person1{
    private int age;
    private String name;
    public void setAge(int a)
    {age = a;}
    public void setName(String n)
    {name=n;}
    public int getAge()
    {return(age);}
    public String getName()
    {return(name);}
}

class Student1 extends Person1{
    private int Rollno;
    public void setRollno(int r)
    { Rollno=r;}
    public int getRollno()
    {return(Rollno);}
}
public class Inheritence {
    public static void main(String[] args) {
        Student1 s1 = new Student1();
        s1.setRollno(100);
        s1.setName("rahul");
        s1.setAge(18);
        System.out.println(s1.getRollno());
        System.out.println(s1.getName());

    }
}

