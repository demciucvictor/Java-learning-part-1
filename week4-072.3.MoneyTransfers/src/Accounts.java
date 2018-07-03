
public class Accounts {
    
    public static void transfer (Account from, Account to, double HowMuch){ 
        from.withdrawal(HowMuch);
        to.deposit(HowMuch);
    }

    public static void main(String[] args) {
        Account A=new Account("A", 100);
        Account B=new Account("B", 0);
        Account C=new Account("C", 0);
        transfer(A,B,50);
        transfer(B,C,25);
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
    }


}
