
public class Person {
    //Attributes
    private String lastName;
    private String firstName;
    private Address home;
    
    //Constructor
    public Person(String lastName, String firstName, Address home)
    {
        this.lastName = lastName;
        this.firstName = firstName;
        this.home = home;
        
    }

    //Methods
    public String toString()
    {
        String personString = this.firstName + " " + this.lastName + ": " + this.home;
        return personString;
    }
}
