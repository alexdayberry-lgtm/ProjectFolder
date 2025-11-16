/**
 * Person class for storing a person's name.
 * This class is used to demonstrate JavaDocs.
 *
 * @author Alex
 * @version 1.0
 */
public class Person {

    /**
     * The name of the person.
     */
    private String name;

    /**
     * Creates a Person object with a given name.
     *
     * @param name the person's name
     */
    public Person(String name) {
        this.name = name;
    }

    /**
     * Returns the name of the person.
     *
     * @return the person's name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets a new name for the person.
     *
     * @param name the new name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns a readable version of the person.
     *
     * @return a string with the person's name
     */
    @Override
    public String toString() {
        return "Person Name: " + name;
    }
}
