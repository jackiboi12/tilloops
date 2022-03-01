package Java2FlowControl;
//2
public class SwitchClass
{
    public static void main(String[] args)
    {
        //The working of the switch-case statement is similar to the Java if...else...if ladder.
        //However, the syntax of the switch statement is cleaner and much easier to read and write.

        //Example 1
        int m = 2;      //case value2 will get executed
        switch(m) {//Use the switch statement to select one of many code blocks to be executed.

            case 1:
                System.out.println("One");
                break; //A break can save a lot of execution time because 'it' ignores the execution of all the rest of the code in the switch block.
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            default:
                System.out.println("No match");
        }

        //Example 2
        int day =3;
        switch (day)
        {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
        }

        //Example 3
        int number = 44;
        String size;
        // switch statement to check size
        switch (number) {
            case 29:
                size = "Small";
                break;
            case 42:
                size = "Medium";
                break;
            // match the value of week
            case 44:
                size = "Large";
                break;
            case 48:
                size = "Extra Large";
                break;
            default:
                size = "Unknown";
                break;
        }
        System.out.println("Size: " + size);
    }
}
