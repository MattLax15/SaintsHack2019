import java.lang.reflect.Array;
import java.util.ArrayList;

public class HostFamily {

    /**
     * Initializes the host family object to take parameters of a main contact's first and last name,
     * number of family members, if family has pets, family's zipcode, and main contact's email and phone
     */
    private String mainContactFirstName;
    private String mainContactLastName;
    private int numberOfFamilyMembers;
    private boolean pets;
    private int zipcode;
    private String emailAddress;
    private int phoneNumber;

    public HostFamily (String firstName, String lastName, int familyMembers, boolean pets,
                       int zipcode, String email, int phone) {
        this.mainContactFirstName = firstName;
        this.mainContactLastName = lastName;
        this.numberOfFamilyMembers = familyMembers;
        this.pets = pets;
        this.zipcode = zipcode;
        this.emailAddress = email;
        this.phoneNumber = phone;

    }

    /**
     * Returns the main contact's full name
     */
    public ArrayList<String> getFullName() {
        ArrayList<String> fullName = new ArrayList<>();
        fullName.add(mainContactFirstName);
        fullName.add(mainContactLastName);
        return fullName;
    }

    /**
     * Return if family has pets
     */
    public boolean pets() {
        return pets;
    }

    /**
     * Returns the location of the family's permanent residence
     */
    public int getZipcode() {
        return zipcode;
    }

    /**
     * Return email information
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Return phone number information
     */
    public int getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Returns how many family members are in the household
     */
    public int getNumberOfFamilyMembers() {
        return numberOfFamilyMembers;
    }
}
