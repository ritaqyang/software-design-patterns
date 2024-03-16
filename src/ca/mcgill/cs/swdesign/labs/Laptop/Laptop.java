package ca.mcgill.cs.swdesign.labs.Laptop;
import java.util.*;
public class Laptop {
    private final int aYear;
    private final String aName;
    private List<String> aUsers;

    private final OperatingSystem aOperatingSystem;

    public enum OperatingSystem{
        MACOS, LINUX, WINDOWS
    }

    /**
     * Constructs a new laptop object with the specified year, name, and operating system
     *
     * @param pYear the year the laptop was made
     * @param pName the name of the model of the laptop
     * @param pOperatingSystem the operating system of the laptop (must be one of  MACOS, LINUX, WINDOWS)
     * @throws IllegalArgumentException if the year is negative or if the name or operating system is null
     */
    public Laptop(int pYear, String pName, OperatingSystem pOperatingSystem){
        assert pYear >= 0 : "Year must be non-negative";
        assert pName != null : "Name must not be null";
        assert pOperatingSystem != null : "Operating system must not be null";
        aYear = pYear;
        aName = pName;
        aOperatingSystem = pOperatingSystem;
        aUsers = new ArrayList<>();
    }
    public int getYear() {
        return aYear;
    }
    public String getName() {
        return aName;
    }

    public OperatingSystem getOperatingSystem() {
        return aOperatingSystem;
    }

    /**
     * TODO: implement getUser(), follow good encapsulation principles
     * @return the list of users of the laptop (a copy)
     */
    public List<String> getUsers() {

        return new ArrayList<>(aUsers);
    }

    public void addUser(String pUser){
        assert pUser != null;
        aUsers.add(pUser);
    }


}
