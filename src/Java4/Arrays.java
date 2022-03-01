package Java4;
//1
public class Arrays {
    public static void main(String[] args) {

        //Example 1: 1-D Array: type[] arrayname = new type[size];
        int intArray[] = new int[4];
        //intArray is a variable name, int[]-> int array datatype
        intArray[0] = 10;       //indexing starts from zero
        //System.out.println("Element at index 0: " + intArray[0]);
        intArray[1] = 20;
        //System.out.println("Element at index 1: " + intArray[1]);
        intArray[2] = 30;
        //System.out.println("Element at index 2: " + intArray[2]);
        for(int i=0;i<3;i++){
            System.out.println(intArray[i]);
        }

        //Example 2
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        cars[0] = "Opel";   //change an array element
        System.out.println(cars[0]);
        System.out.println(cars.length);    //Array length
        for(int l =0;l< cars.length;l++){
            System.out.println(cars[l]);
        }

        //Example 3a) using for-each loop
        int[] age1= {12,4,5};
        //loop through the array
        //using for loop
        System.out.println("Using for-each loop: ");
        for(int a: age1){
            System.out.println(a);
        }
        //Example 3b)Using For Loop
        // create an array
        int[] age = {12, 4, 5};

        // loop through the array
        // using for loop
        System.out.println("Using for Loop:");
        for(int i = 0; i < age.length; i++) {
            System.out.println(age[i]);
        }
        //2-D Array (generally used to in matrix(2*2) multiplication)

        //Example 4
        //type[][] arrayName = new type[rows][columns]
        int intArray1[][] = {{ 2 , 7 , 9 },{ 3 , 6 , 1 },{ 7 , 4 , 2 }};
        //                     row 1   row 2    row 3
        // position of element: i0      i1        i2     -> index = i
        for(int i =0;i<3;i++){
            for (int j =0;j<3;j++){

                System.out.print(intArray1[i][j]+ "");
            }
            System.out.println();
        }
        System.out.println(intArray1[0][1]);
        System.out.println(intArray1[2][2]);
        System.out.println(intArray1[1][2]);

        // 3-D Array (generally img data is stored in 3-D)

        //Example 5
        int[][][] intArray2 = {{{1,2,10},{3,4,11}},{{5,6,12},{7,8,13}}};
        System.out.println(intArray2[0][1][2]);
        System.out.println(intArray2[1][1][1]);


    }
}
