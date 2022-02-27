package optional6;
//Arrays in Java
public class fourth {
    public static void main(String[] args) {
        //Example 1
        char[] a = new char[5];
        a[0] = 'A';
        a[1] = 'B';
        a[2] = 'C';
        a[3] = 'D';
        a[4] = 'E';
        for(int i=0;i<5;i++){
            System.out.println(a[i]);
        }

        //Example 2
        int[] a1 = new int[10];
        for(int i=0;i<5;i++){
            a1[i] = i;
        }
        for(int i=0;i<5;i++){
            System.out.println(a1[i]);
        }

//Arrays adding
        //Example 3
        int num = 5;
        int num1 = 10;
        int farray[] = new int[5];
        int sarray[] = new int[5];
        int tarray[] = new int[5];

        //farray
        for(int i = 0;i<5;i++){
            farray[i] = i;
        }
        System.out.println("Values of farray is ");

        for(int i=0;i<5;i++){
            System.out.print(farray[i]+" ");
        }
        //
        System.out.println();

        //sarray
        for(int i = 0;i<5;i++){
            sarray[i] = num;
            ++num;
        }
        System.out.println("Values of sarray is ");

        for(int i=0;i<5;i++){
            System.out.print(sarray[i]+" ");
        }
        //
        System.out.println();

        //tarray
        for(int i = 0;i<5;i++){
            tarray[i] = num1;
            ++num1;
        }
        System.out.println("Values of tarray is ");

        for(int i=0;i<5;i++){
            System.out.print(tarray[i]+" ");
        }
        //
        System.out.println();

//Multi-dimensional Array
        //Example 4
        int[][] marray = new int[3][3];
        int num2=1;
        for(int i=0;i<3;i++){
            for(int j = 0;j<3;j++){
                marray[i][j] = num2;
                ++num2;
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(marray[i][j]+" ");
            }
            System.out.println(" ");
        }











    }
}
