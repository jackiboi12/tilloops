package optional6;
//return type
public class second {
    public static void main(String[] args) {
        second obj = new second();
        int x = 10;
        int y = 20;
        int get_result = obj.add(20,30);
        System.out.println(get_result);

    }
public int add(int num1, int num2){
        int result = num1+num2;
        return result;

}

}
