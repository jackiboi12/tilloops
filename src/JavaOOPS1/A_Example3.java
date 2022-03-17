package JavaOOPS1;
class Account{
    int acc_no;
    String name;
    float amount;
    //Method to initialize  objects
    void insert(int a,String n, Float amt){
        acc_no = a;
        name = n;
        amount = amt;
    }
    //deposit method
    void deposit(float amt){
        amount = amount+amt;
        System.out.println(amt+" deposited");
    }
    //withdraw method
    void withdraw(float amt){
        if(amount<amt){
            System.out.println(" Insufficient Balance");

        }else{
            amount = amount-amt;
            System.out.println(amt+" withdrawn");
        }
    }
    //method to check the balance of the account
    void checkBalance(){
    System.out.println("Balance is: "+amount);
    }
    //method to display the values of an object
    void display(){System.out.println(acc_no+" "+name+" "+amount);}
}


public class A_Example3 {
    public static void main(String[] args) {
    Account a1 = new Account();
    a1.insert(2312313,"Ankit",1000f);
    a1.display();
    a1.checkBalance();
    a1.deposit(40000);
    a1.checkBalance();
    a1.withdraw(15000);
    a1.checkBalance();
    }
}
