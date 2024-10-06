
public class Money {
    //Attributes
    private long dollars;
    private long cents;

    //Constructors
    public Money(double userAmount)
    {
        this.dollars = (long) userAmount;
        this.cents = Math.round((userAmount - this.dollars) * 100);
    }

    public Money(Money amount)
    {
        amount.dollars = this.dollars;
        amount.cents = this.cents;
    }

    //Methods
    public void add(Money amount)
    {
        this.dollars = amount.dollars + this.dollars;
        this.cents = amount.cents + this.cents;
    }

    public void subtract(Money amount) 
    {
        this.dollars = this.dollars - amount.dollars;
        this.cents = this.cents - amount.cents;
    }

    public int compareTo(Money amount)
    {
    }

    public boolean equals(Money amount)
    {
        boolean equalCheck = false;

        return equalCheck;
    }

    public String toString()
    {
        String moneyString = "$" + this.dollars + "." + this.cents;
        return moneyString;
    }
}
