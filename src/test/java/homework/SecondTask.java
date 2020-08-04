package homework;

public class SecondTask {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Иванов", "89213736655");
        phoneBook.add("Иванов", "+79115556655");
        phoneBook.add("Иванов", "+74954433221");
        phoneBook.add("Сидоров", "89115222334");
        phoneBook.add("Петров", "89064422114");
        phoneBook.add("Сергеев", "89052345310");
        phoneBook.add("Сергеев", "89997771234");

        phoneBook.get("Иванов");
        phoneBook.get("Сидоров");
        phoneBook.get("Петров");
        phoneBook.get("Сергеев");
    }
}
