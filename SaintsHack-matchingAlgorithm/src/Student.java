import java.util.ArrayList;

public class Student {

    /**
     * Initializing Student Object to take parameters first name, last name, college, email address,
     * phone number, their hobbies, and restrictions they have
     */
    private String firstName;
    private String lastName;
    private int age;
    private char gender;
    private String homeCountry;
    private String religion;
    private String collegeMajor;
    private ArrayList<String> sports;
    private ArrayList<String> allergies;
    private String college;
    private String email;
    private int phoneNumber;
    private ArrayList<String> hobbies;
    private ArrayList<String> dietaryRestrictions;

    public Student(String firstName, String lastName, int age, char gender, String homeCountry, String religion,
            String college, String major, String email, int phoneNumber, ArrayList<String> hobbies,
            ArrayList<String> dietaryRestrictions, ArrayList<String> allergies, ArrayList<String> sports) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.homeCountry = homeCountry;
        this.religion = religion;
        this.collegeMajor = major;
        this.college = college;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.hobbies = hobbies;
        this.dietaryRestrictions = dietaryRestrictions;
        this.sports = sports;
        this.allergies = allergies;
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
     * Returns the student's home country
     */
    public String getHomeCountry() {
        return homeCountry;
    }

    /**
     * Return student's gender
     */
    public char getGender() {
        return gender;
    }

    /**
     * Return student's age
     */
    public int getAge() {
        return age;
    }

    /**
     * Returns student's religion
     */
    public String getReligion() {
        return religion;
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
     * Return student's college major or concentration
     */
    public String getCollegeMajor() {
        return collegeMajor;
    }

    /**
     * Returns students hobbies
     */
    public ArrayList<String> getHobbies() {
        return hobbies;
    }

    /**
     * Return if student is partipating in a sport
     */
    public ArrayList<String> getSports() {
        return sports;
    }

    /**
     * Returns student's dietary restrictions
     */
    public ArrayList<String> getRestrictions() {
        return dietaryRestrictions;
    }

    /**
     * Return student's allergies
     */
    public ArrayList<String> getAllergies() {
        return allergies;
    }
}
