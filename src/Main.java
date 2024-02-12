public class Main {
    public static void main(String[] args){
        author author = new author();
        author.setLastName("Пушкин");
        author.setFirstName("Константин");
        author.setAge(21);
        author author1 = new author("Василий", "Артемонов");
        book book1 = new book("пока все дома", 2025, author);
        book book2 = new book("Надо", 2027, author1);
        System.out.println(author);
        System.out.println(author1);
        System.out.println(book1);
        book1.setPublicationDate(2031);
        System.out.println(book1);
    }
}