import java.lang.reflect.Array;
import java.util.ArrayList;

public class Pets {

    /**
     * Initializes pet object to take parameters number of pets, age of those pets,
     * and type of animal those pets are
     */
    private int numberOfPets;
    private int[] ageOfPets;
    private ArrayList<String> typesOfAnimals;

    public Pets(int numberOfPets, int[] ages, ArrayList<String> typesOfAnimals) {
        this.numberOfPets = numberOfPets;
        this.ageOfPets = ages;
        this.typesOfAnimals = typesOfAnimals;
    }

    /**
     * Returns the total number of pets in the house
     */
    public int getNumberOfPets() {
        return numberOfPets;
    }

    /**
     * Returns if a type of pet (dogs, cat, hamsters, etc...) is in the household
     * @return true if this animal exists in the household, false otherwise
     */
    public boolean searchForAnimalInHousehold(String searchingFor){
        if (typesOfAnimals.indexOf(searchingFor) == -1) {
            return false;
        } else {
            return true;
        }
    }

    /**
     * Returns the ages of the animals in the household
     */
    public int[] getAgeOfPets() {
        return ageOfPets;
    }
}
