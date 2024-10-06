
public class Address {
    //Attributes
    private String street;
    private String city;
    private String state;
    private String zip;

    
    //Methods
    public String toString()
    {
        String addressString = this.street + "," + this.city + "," + this.state + "," + this.zip;
        return addressString;
    }
}
