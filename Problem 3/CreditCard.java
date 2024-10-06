
public class CreditCard {
    //Attributes
    private Money balance;
    private Money creditLimit;
    private Person owner;

    //Constructor
    public CreditCard(Person owner, Money creditLimit)
    {
        this.owner = owner;
        this.creditLimit = creditLimit;
    }

    //Methods
    public Money getBalance()
    {
        return this.balance;
    }

    public Money getCreditLimit()
    {
        return this.creditLimit; 
    }

    public String getPersonals()
    {
        return owner.toString();
    }

    public void charge(Money amount)
    {
    }

    public void payment(Money amount)
    {
    }

}
