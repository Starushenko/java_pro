package phonebook;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Note {

    private String contactName;
    private ArrayList<String> contactPhones;

    public Note(String contactName, ArrayList<String> contactPhones) {
        this.contactName = contactName;
        this.contactPhones = contactPhones;
    }
    public String getContactPhones() {
        return contactPhones.get(0);
    }
    public ArrayList<String> getListContactPhones() {
        return contactPhones;
    }
    public String getContactName() {
        return contactName;
    }
    public void setContactPhones(String contactPhones) {
        this.contactPhones.add(String.valueOf(contactPhones));
    }
}
