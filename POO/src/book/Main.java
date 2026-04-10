package book;

public class Main {
    public static void main(String[] args) {

        Book booOne = new Book("Jhon Doe", "Java", 2022);
        Book booTwo = new Book("Jane Smith", "Python", 2021);

        System.out.println(booOne);
        System.out.println(booTwo);
    }
}
