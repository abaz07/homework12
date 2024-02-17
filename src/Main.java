public class Main {
    public static void main(String[] args){
        Author author = new Author();
        author.setLastName("Пушкин");
        author.setFirstName("Константин");
        author.setAge(21);
        System.out.println(author.hashCode());
        author.setFirstName("Карапузов");
        System.out.println(author.hashCode());
        Author author1 = new Author("Василий", "Артемонов");
        Book book1 = new Book("пока все дома", 2025, author);
        Book book2 = new Book("Надо", 2027, author1);
        System.out.println(author);
        System.out.println(author1);
        System.out.println(book1);
        book1.setPublicationDate(2031);
        System.out.println(book1);

    if(author.equals(author1)){
        System.out.println("объекты равны");
    } else {
        System.out.println("объекты не равны");
    }
    }
}