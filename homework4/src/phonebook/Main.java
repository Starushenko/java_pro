package phonebook;

public class Main {
    public static void main(String[] args) {
        PhoneDirectory phoneDirectory = new PhoneDirectory();
        phoneDirectory.addContact("Bohdan","+380930099960");
        phoneDirectory.addContact("Bohdan","+380687790723");
        phoneDirectory.addContact("Bohdan","+000000000000");
        phoneDirectory.addContact("Starushenko","+38068");
        phoneDirectory.addContact("Starushenko Bohdan","+38093");

        System.out.println(phoneDirectory.findContact("bohdan"));
        System.out.println(phoneDirectory.findContact("Bohdan"));
        System.out.println(phoneDirectory.findAllContact("Bohdan"));


    }
}
