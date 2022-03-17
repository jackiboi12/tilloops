package JavaOOPS1;
public class A_Example2 {
    public static void main(String[] args) {
        Rectangle r1= new Rectangle();
        r1.length = 5;
        r1.width =4;
        r1.calculationArea();
        Rectangle r2 = new Rectangle();
        r2.insertValue(6,4);
        r2.calculationArea();
    }
}
class Rectangle{
    int length;
    int width;
    void insertValue(int l ,int w){
        length = l;
        width = w;
    }
    void calculationArea(){
        System.out.println(length*width);
    }
}

