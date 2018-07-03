
public class CashRegister {

    private double cashInRegister;
    private int economicalSold;
    private int gourmetSold;

    public CashRegister() {
        cashInRegister=1000;
        economicalSold=0;
        gourmetSold=0;
    }

    public double payEconomical(double cashGiven) {
        if(cashGiven>=2.5){ 
            economicalSold++;
            cashInRegister+=2.5;
            return cashGiven-2.5;
        }
        // price of the economical lunch is 2.50 euros
        // if the given cash is at least the price of the lunch:
        //    the price of lunch is added to register
        //    the amount of sold lunch is incremented by one
        //    method returns cashGiven - lunch price 
        // if not enough money given, all is returned and nothing else happens        
        return cashGiven;
    }

    public double payGourmet(double cashGiven) {
        if(cashGiven>=4){   
            cashInRegister+=4;
            gourmetSold++;
            return cashGiven-4;
            
        }
        // price of the gourmet lunch is 4.00 euros
        // if the given cash is at least the price of the lunch:
        //    the price of lunch is added to register
        //    the amount of sold lunch is incremented by one
        //    method returns cashGiven - lunch price 
        // if not enough money given, all is returned and nothing else happens
        return cashGiven;
    }


    public String toString() {
        return "money in register " + cashInRegister + " economical lunches sold: " + economicalSold + " gourmet lunches sold: " + gourmetSold;
    }
    public boolean payEconomical(LyyraCard card) {
        if(card.balance()>=2.5){    
            economicalSold++;
            card.pay(2.5);
            return true;
        }
        return false;
        // the price of the economical lunch is 2.50 euros
        // if the balance of the card is at least the price of the lunch:
        //    the amount of sold lunches is incremented by one
        //    the method returns true
        // if not, the method returns false
    }

    public boolean payGourmet(LyyraCard card) {
        if(card.balance()>=4){
            gourmetSold++;
            card.pay(4);
            return true;
        }
        return false;
        // the price of the gourmet lunch is 4.00 euros
        // if the balance of the card is at least the price of the lunch:
        //    the amount of sold lunches is incremented by one
        //    the method returns true
        // if not, the method returns false
    }
    public void loadMoneyToCard(LyyraCard card, double sum) {
    if(sum>0){
        card.loadMoney(sum);
        cashInRegister+=sum;
    }
    }

    // ...

  
}
