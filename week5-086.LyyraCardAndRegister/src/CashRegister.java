
public class CashRegister {

    private double cashInRegister;
    private int economicalSold;
    private int gourmetSold;

    public CashRegister() {
        cashInRegister = 1000; 
    }

    public double payEconomical(double cashGiven) {
        // price of the economical lunch is 2.50 euros
        if(cashGiven >= 2.50) {
            cashInRegister += 2.50;
            economicalSold++;
            return cashGiven - 2.50;
        } else {
            return cashGiven;
        }
       
    }

    public double payGourmet(double cashGiven) {
        if(cashGiven >= 4.00) {
            cashInRegister += 4.00;
            gourmetSold++;
            return cashGiven - 4.00;
        } else {
            return cashGiven;
        }
       
    }
    
     public boolean payEconomical(LyyraCard card) {
        // the price of the economical lunch is 2.50 euros
        if(card.balance() >= 2.50) {
            economicalSold++;
            card.pay(2.50);
            return true;
        } else {
            return false;
        }
        
    }

    public boolean payGourmet(LyyraCard card) {
        // the price of the gourmet lunch is 4.00 euros
        if(card.balance() >= 4.00) {
            gourmetSold++;
             card.pay(4.00);
            return true;
        } else {
            return false;
        }
       
    }
    
    public void loadMoneyToCard(LyyraCard card, double sum) {
        if(sum >= 0) {
            cashInRegister += sum;
            card.loadMoney(sum);
        }
    }


    public String toString() {
        return "money in register " + cashInRegister + " economical lunches sold: " + economicalSold + " gourmet lunches sold: " + gourmetSold;
    }
}