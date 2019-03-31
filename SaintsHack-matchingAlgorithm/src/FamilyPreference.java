public class FamilyPreference {

    /**
     * Initializing the family preference to take parameters gender, major, religion, hobbies
     */
    private char gender;
    private String major;
    private String religion;
    private String hobbies;
    private boolean pets;
    private Student student;
    private int matchPercentage = 100;

    public FamilyPreference(Student student, HostFamily family, char gender, String major, String religion, String hobbies) {
        this.gender = gender;
        this.major = major;
        this.religion = religion;
        this.hobbies = hobbies;
        this.student = student;
        this.pets = family.pets();

    }

    /**
     * Checkes whether gender preference and student gender are a match
     *
     * @return true if match, false otherwise
     */
    private boolean genderPreferenceMatch() {
        return this.gender == student.getGender();
    }

    /**
     * Checkes whether major preference and student major are a match
     *
     * @return true if match, false otherwise
     */
    private boolean majorPreferenceMatch() {
        return this.major.equals(student.getCollegeMajor());
    }

    /**
     * Checkes whether religious preference and student religion are a match
     * @return true if match, false otherwise
     */
    private boolean religionPreferenceMatch() {
        return this.religion.equals(student.getReligion());
    }

    /**
     * Checkes whether any hobby preference and student hobbies are a match
     * @return true if match, false otherwise
     */
    private boolean hobbyPreferenceMatch() {
        for (String value : student.getHobbies()) {
            if (value.equals(this.hobbies)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Checks whether the student's pet preference and family's pet preference match
     */
    private boolean petPreferenceMatch() {
        return student.getPetPreference() == pets;
    }

    /**
     * Determines the match percentage based
     * @return returns a percentage of the total match from 0%-100%
     */
    public int matchPercentage() {
        if (!hobbyPreferenceMatch()) {
            matchPercentage-=25;
        } if (!religionPreferenceMatch()) {
            matchPercentage-=25;
        } if (!majorPreferenceMatch()) {
            matchPercentage-=15;
        } if (!genderPreferenceMatch()) {
            matchPercentage-=25;
        } if (!petPreferenceMatch()){
            matchPercentage = 0;
        }
        return matchPercentage;

    }


}

