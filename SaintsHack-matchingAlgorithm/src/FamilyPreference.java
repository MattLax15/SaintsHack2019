public class FamilyPreference {

    /**
     * Initializing the family preference to take parameters gender, major, religion, hobbies
     */
    private char gender;
    private String major;
    private String religion;
    private String hobbies;

    public FamilyPreference(char gender, String major, String religion, String hobbies) {
        this.gender = gender;
        this.major = major;
        this.religion = religion;
        this.hobbies = hobbies;

    }

    /**
     * Checkes whether gender preference and student gender are a match
     *
     * @return true if match, false otherwise
     */
    public boolean genderPreferenceMatch(Student student) {
        return this.gender == student.getGender();
    }

    /**
     * Checkes whether major preference and student major are a match
     *
     * @return true if match, false otherwise
     */
    public boolean majorPreferenceMatch(Student student) {
        return this.major.equals(student.getCollegeMajor());
    }

    /**
     * Checkes whether religious preference and student religion are a match
     * @return true if match, false otherwise
     */
    public boolean religionPreferenceMatch(Student student) {
        return this.religion.equals(student.getReligion());
    }

    /**
     * Checkes whether any hobby preference and student hobbies are a match
     * @return true if match, false otherwise
     */
    public boolean hobbyPreferenceMatch(Student student) {
        for (String value : student.getHobbies()) {
            if (value.equals(this.hobbies)) {
                return true;
            }
        }
        return false;
    }

    


}

