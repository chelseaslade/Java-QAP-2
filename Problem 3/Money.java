
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
        amount.dollars = this.dollars;
        amount.cents = this.cents;
    }

    //Methods
    public void add(Money amount)
    {
        //Add cents
        this.cents += amount.cents;

        //Check to see if cents overflow and add $1
        if (this.cents >= 100)
        {
            this.dollars += 1;
            this.cents -= 100;
        }

        //Add dollars
        this.dollars += amount.dollars;
    }

    public void subtract(Money amount) 
    {
        //Subtract cents
        this.cents -= amount.cents;

        //Check to see if cents go negative, borrow $1
        if (this.cents < 0)
        {
            this.dollars -= 1;
            this.cents += 100;
        }

        //Subtract dollars
        this.dollars -= amount.dollars;
    }

    public int compareTo(Money amount)
    {
        //+1 if variable is <amount, 0 if equal, +1 if >amount
        if ((this.dollars == amount.dollars) && (this.cents == amount.cents))
        {
            return 0;
        }

        else if (this.dollars > amount.dollars)
        {
            return 1;
        }

        else 
        {
            return -1;
        }

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
        String moneyString = "$" + this.dollars + "." + this.cents;
        return moneyString;
    }
}
