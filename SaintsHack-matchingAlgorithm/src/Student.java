import java.util.ArrayList;

public class Student {

    /**
     * Initializing Student Object to take parameters first name, last name, college, email address,
     * phone number, their hobbies, and restrictions they have
     */
    private String firstName;
    private String lastName;
    private String college;
    private String email;
    private int phoneNumber;
    private ArrayList<String> hobbies;
    private ArrayList<String> restrictions;

    public Student(String firstName, String lastName, String college, String email, int phoneNumber, ArrayList<String> hobbies, ArrayList<String> restrictions) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.college = college;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.hobbies = hobbies;
        this.restrictions = restrictions;
    }

    /**
     * Returns the student's full name and email address in an array
     */
    public ArrayList<String> getName() {
        ArrayList<String> fullname = new ArrayList<>();
        fullname.add(firstName);
        fullname.add(lastName);
        return fullname;
    }

    /**
     * Returns the student's email address
     */
    public String getEmail() {
        return email;
    }

    /**
     * Returns the student's phone number
     */
    public int getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Returns the student's college
     */
    public String getCollege() {
        return college;
    }

    /**
     * Returns students hobbies
     */
    public ArrayList<String> getHobbies() {
        return hobbies;
    }

    /**
     * Returns student's restrictions
     */
    public ArrayList<String> getRestrictions() {
        return restrictions;
    }
}
