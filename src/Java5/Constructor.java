package Java5;
//4


import javax.swing.*;

public class Constructor {
    private int l,b,h;
    public Constructor(){
        l =10;b=8;h=4;
    }
    public Constructor(int L , int B, int H){
        l=L;b=B;h=H;
    }
    public static void main(String[] args) {
        Constructor b1 = new Constructor();
        System.out.println(b1.b);
        Constructor b2 = new Constructor(20,32,2);
        System.out.println(b2.l);




    }
}
