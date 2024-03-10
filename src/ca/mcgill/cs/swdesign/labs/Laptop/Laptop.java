package ca.mcgill.cs.swdesign.labs.Laptop;
import java.util.*;
public class Laptop {
    private int aYear;
    private String aName;
    private List<String> aUsers;
    public Laptop(int pYear, String pName){
        aYear = pYear;
        aName = pName;
        aUsers = new ArrayList<>();
    }
    public int getYear() {
        return aYear;
    }
    public String getName() {
        return aName;
    }

    /**
     * TODO: implement getUser(), follow good encapsulation principles
     * @return
     */
    public String getUsers() {
    }
    public void setYear(int pYear) {
        assert pYear >= 0;
        aYear = pYear;
    }
    public void setName(String pName) {
        assert pName != null;
        aName = pName;
    }
    public String addUser(String pUser){
        assert pUser != null;
        aUsers.add(pUser);
    }
}
