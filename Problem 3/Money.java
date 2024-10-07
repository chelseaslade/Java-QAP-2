
public class Money {
    //Attributes
    private long dollars;
    private long cents;

    //Constructors
    public Money(double userAmount)
    {
        this.dollars = (long) Math.floor(userAmount);
        double doubleCents = Math.round(((userAmount - Math.floor(userAmount)) * 100));

        this.cents = (long) doubleCents;
    }

    public Money(Money amount)
    {
        this.dollars = amount.dollars;
        this.cents = amount.cents;
    }

    //Methods
    public void add(Money amount)
    {
        //Add cents
        this.cents = this.cents + amount.cents;

        //Check to see if cents overflow and add $1
        if (this.cents >= 100)
        {
            this.dollars = this.dollars + 1;
            this.cents = this.cents - 100;
        }

        //Add dollars
        this.dollars = this.dollars + amount.dollars;
    }

    public void subtract(Money amount) 
    {
        //Subtract cents
        this.cents = this.cents - amount.cents;

        //Check to see if cents go negative, borrow $1
        if (this.cents < 0)
        {
            this.dollars = this.dollars - 1;
            this.cents = this.cents + 100;
        }

        //Subtract dollars
        this.dollars = this.dollars - amount.dollars;
    }

    public int compareTo(Money amount)
    {
        //+1 if variable is <amount, 0 if equal, +1 if >amount

        //Check dollars first
        if (this.dollars > amount.dollars) 
        {
            return 1;
        } else if (this.dollars < amount.dollars) {
            return -1;
        }
        
        //Check cents second
        if (this.cents > amount.cents) {
            return 1; 
        } else if (this.cents < amount.cents) {
            return -1;
        }
        
        //If all equal, return 0
        return 0;
    }

    public boolean equals(Money amount)
    {
        //Return false if amounts not equal, true if they are
        boolean equalCheck = false;

        if ((this.dollars == amount.dollars) && (this.cents == amount.cents))
        {
            equalCheck = true;
        }

        return equalCheck;
    }

    public String toString()
    {
        return String.format("$%d.%02d", this.dollars, this.cents);
    }
}
