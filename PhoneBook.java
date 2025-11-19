public class PhoneBook {
    private HashTable<String, Contact> contacts;

    public PhoneBook() {
        contacts = new HashTable<>(20);
    }

    public void addContact(String phoneNumber, Contact contact) {
        contacts.put(phoneNumber, contact);
    }

    public Contact findContact(String phoneNumber) {
        return contacts.get(phoneNumber);
    }

    public boolean deleteContact(String phoneNumber) {
        return contacts.remove(phoneNumber);
    }
}
