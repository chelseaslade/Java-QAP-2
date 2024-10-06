
public class Money {
    //Attributes
    private long dollars;
    private long cents;

    //Constructors
    public Money(double amount)
    {
    }

    public Money(Money amount)
    {
    }

    //Methods
    public void add(Money amount)
    {
    }

    public void subtract(Money amount) 
    {
    }

    public int compareTo(Money amount)
    {
    }

    public boolean equals(Money amount)
    {
    }

    public String toString()
    {
        String moneyString = this.dollars + "." + this.cents;
        return moneyString;
    }
}
