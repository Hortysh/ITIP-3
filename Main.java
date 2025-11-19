public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.addContact("89995553322",
                new Contact("Иван", "ivan@mail.com", "Коллега по работе"));

        phoneBook.addContact("80000000000",
                new Contact("Анна", "anna@gmail.com", "Соседка"));

        System.out.println(phoneBook.findContact("89995553322"));

        phoneBook.deleteContact("80000000000");

        System.out.println(phoneBook.findContact("80000000000"));
    }
}
