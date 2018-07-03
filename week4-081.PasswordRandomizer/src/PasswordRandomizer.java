import java.util.Random;

public class PasswordRandomizer {
    private int plength;
    private Random random;

    public PasswordRandomizer(int length) {
        this.plength=length;
        this.random= new Random();
    }

    public String createPassword() {
        String alphabet="abcdefghijklmnopqrstuvwxyz";
        String password="";
        int i=0;
        while (i<this.plength){
            int n=random.nextInt(26);
            char c=alphabet.charAt(n);
            password+=c;
            i++;
        }
        return password;
    }
}
