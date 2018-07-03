
public class Accounts {

    public static void main(String[] args) {
        Account Matt=new Account("Matt's account", 1000);
        Account my=new Account("My account", 0);
        Matt.withdrawal(100);
        my.deposit(100);
        System.out.println(Matt);
        System.out.println(my);
    }

}
