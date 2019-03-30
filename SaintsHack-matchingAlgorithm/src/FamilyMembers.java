import java.util.ArrayList;
import java.util.List;

public class FamilyMembers {

    private ArrayList<String> membersFirstName;
    private List<Integer> membersAges;
    private ArrayList<String> membersOccuptionOrSchool;

    public FamilyMembers(ArrayList<String> membersFirstName, List<Integer> membersAges, ArrayList<String> membersOccuptionOrSchool) {
        this.membersFirstName = membersFirstName;
        this.membersAges = membersAges;
        this.membersOccuptionOrSchool = membersOccuptionOrSchool;
    }

    /**
     * Return member ages
     */
    public List<Integer> getMembersAges() {
        return membersAges;
    }

    /**
     * Return members occuptions or schools
     */
    public ArrayList<String> getMembersOccuptionOrSchool() {
        return membersOccuptionOrSchool;
    }

    /**
     * Adds a member to the family
     * @param firstName the members first name
     * @param age the members age
     * @param occuptionOrSchool the members school or occuption
     */
    public void addFamilyMember(String firstName, int age, String occuptionOrSchool) {
        membersFirstName.add(firstName);
        membersOccuptionOrSchool.add(occuptionOrSchool);
        membersAges.add(age);
    }
}
