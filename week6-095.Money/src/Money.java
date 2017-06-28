
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }
    
    public Money plus(Money added) {
        int euros = this.euros + added.euros;
        int cents = this.cents + added.cents;
        
        if(cents >= 100) {
            euros++;
            cents -= 100;
        }
        
        return new Money(euros, cents);
    }
    
    public boolean less(Money compared) {
         
        if(euros < compared.euros) 
            return true;
        else if(euros == compared.euros && cents < compared.cents)
                return true;
        else
            return false;
    }
    
    public Money minus(Money decremented) {
        int euros = this.euros;
        int cents = this.cents;
        
        euros = euros - decremented.euros;
        if(euros < 0)
            return new Money(0, 0);
         
        if(cents - decremented.cents < 0) {
            euros--;
            cents = 100 + cents - decremented.cents;
        } else
            cents = cents - decremented.cents;
        return new Money(euros, cents);
        
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

}
