
public class CreditCardDemo {
    
    public static void main(String[] args)
    {
        final Money LIMIT = new Money(1000);
        final Money FIRST_AMOUNT = new Money(200);
        final Money SECOND_AMOUNT = new Money(10.02);
        final Money THIRD_AMOUNT = new Money(25);
        final Money FOURTH_AMOUNT = new Money(990);

        Person owner = new Person("Christie", "Diane", new Address("237J Harvey Hall", "Menomonie", "WI", "54751"));

        CreditCard visa = new CreditCard(owner, LIMIT);
        System.out.println(visa.getPersonals());

    }
}
