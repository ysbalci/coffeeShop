package concretes;

public class Customers {

    private long id;
    private String firstName;
    private String lastName;
    private int birtOfYear;
    private String natioanlIdentity;

    public Customers(){

    }

    public Customers(long id, String firstName, String lastName, int birtOfYear, String natioanlIdentity) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birtOfYear = birtOfYear;
        this.natioanlIdentity = natioanlIdentity;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBirtOfYear() {
        return birtOfYear;
    }

    public void setBirtOfYear(int birtOfYear) {
        this.birtOfYear = birtOfYear;
    }

    public String getNatioanlIdentity() {
        return natioanlIdentity;
    }

    public void setNatioanlIdentity(String natioanlIdentity) {
        this.natioanlIdentity = natioanlIdentity;
    }
}
