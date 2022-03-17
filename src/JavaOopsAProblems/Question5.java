package JavaOopsAProblems;

public class Question5 {
    public static void main(String[] args) {
        //for Loop VS for-each loop
        //Using for loop
        char[] vowels1 = {'a', 'e', 'i', 'o', 'u'};
        //iterating through an array using a for loop
        for(int i =0;i< vowels1.length;++i){
            System.out.println(vowels1[i]);
        }

        //Using for-each loop
        char[] vowels2 = {'a', 'e', 'i', 'o', 'u'};
        // iterating through an array using the for-each loop
        for(char item:vowels2){
            System.out.println(item);
        }

    }
}
