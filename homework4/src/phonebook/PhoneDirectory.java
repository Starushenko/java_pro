package phonebook;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PhoneDirectory {
    private List<Note> contactList = new ArrayList<>();

    public void addContact(String name, String phone) {
        ArrayList<String> tempPhone = new ArrayList<>();
        Note note = new Note(name, tempPhone);
        if (contactList.isEmpty()) {
            tempPhone.add(phone);
            contactList.add(note);
        } else {
            for (Note element : contactList) {
                if (element.getContactName().equals(name)) {
                    element.setContactPhones(phone);
                    break;
                } else {
                    tempPhone.add(phone);
                    contactList.add(note);
                    break;
                }
            }
        }
    }


    public String findContact(String name) {
        String tempPhone = null;
        for (Note element : contactList) {
            if (element.getContactName().equals(name)) {
                tempPhone = element.getContactPhones();
            }
        }
        return tempPhone;
    }


    public List<String> findAllContact(String name){
        List<String> tempPhone = null;
        for (Note element : contactList) {
            if (element.getContactName().equals(name)) {
                tempPhone = element.getListContactPhones();
            }
        }
        return tempPhone;
    }

}
