package Java2FlowControl;
//2
public class B_SwitchClass
{
    public static void main(String[] args)
    {
        //The working of the switch-case statement is similar to the Java if...else...if ladder.
        //However, the syntax of the switch statement is cleaner and much easier to read and write.
        //Use the switch statement to select one of many code blocks to be executed.
        //A break can save a lot of execution time because 'it' ignores the execution of all the rest of the code in the switch block.


        //Example 1
        char ch = 'o';
        switch (ch){
            case 'a','A':
                System.out.println("vowel");
                break;
            case'i','I':
                System.out.println("vowel");
                break;
            case'o','O':
                System.out.println("vowel");
                break;
            case'u','U':
                System.out.println("vowel");
                break;
            case'e','E':
                System.out.println("vowel");
                break;
            default:
                System.out.println("Consonant");

        }

        //Example 2
        String size ="Large" ;
        int number;
        // switch statement to check size
        switch (size) {
            case "small":
                number = 38;
                break;
            case "medium":
                number = 40;
                break;
            case "Large":
                number = 42;
                break;
            case "xxl":
                number = 46;
                break;
            default:
                number = +48;
                break;
        }
        System.out.println("Size: " + size);
    }
}
