package optional6;
//final and Enumeration
public class sixth {
    public static void main(String[] args) {
        //Syntax of final keyword: final data-type variable-name = value;

        //Example 1
        //Declares final variable
        final double PI = 3.1415;

        double radius = 5.34;
        double area = PI*radius*radius;
        System.out.println("Area of circle is " + area);

        //Enumeration: Defined as a list that contains constants
        //It is a cass type which mean it includes variable, methods..
        //don't use NEW operator to instantiate it
        //Syntax of Enumeration:
        //enum enum-name{
        //  const1, const2....constN
        //  }

        //Example 2
        //using CLASS 1
        //Declares a variable of type Direction
        //instantiate the enumDirection
        Direction direction = Direction.East;
        System.out.println("value: " + direction);

    }
    //CLASS 1
    enum Direction{
        East,West,North,south
    }
}
