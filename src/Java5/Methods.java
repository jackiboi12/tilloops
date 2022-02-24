package Java5;
//1
public class Methods {
        //FirstClass
        static int average(int fname, int sname){
            int sum = fname+sname;
            return sum/2;
        }

        public static void main(String[] args) {
            System.out.println(average(3,4));


            //Example 1
            int a[] = new int[3];
            try{
                System.out.println(2/0);
            } catch(Exception variableName){
                System.out.println("Error");
                System.out.println(variableName.getLocalizedMessage());
            }
            System.out.println("Hello");








        }


}
