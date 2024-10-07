
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
        this.balance = new Money(0);
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
        String personalsString = owner.toString();
        return personalsString;
    }

    public void charge(Money amount)
    {
        Money compareBalance = new Money(this.balance);
        compareBalance.add(amount);

        if (compareBalance.compareTo(this.creditLimit) > 0)
        {
            //Error message
            System.out.println("Exceeds credit limit");
        }
        else
        {
            //Add amount to balance if does not exceed limit
            this.balance.add(amount);
        }
    }

    public void payment(Money amount)
    {
        //Subtract amount from balance
        this.balance.subtract(amount);
    }

}
