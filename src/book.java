public class book {
    private String title;
    private int publicationDate;
    private author author;

    public book(String title, int publicationDate, author author) {
        this.title = title;
        this.publicationDate = publicationDate;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(int publicationDate) {
        this.publicationDate = publicationDate;
    }

    public author getAuthor() {
        return author;
    }

    public void setAuthor(author author) {
        this.author = author;
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        book book = (book) object;
        return publicationDate == book.publicationDate && java.util.Objects.equals(title, book.title) && java.util.Objects.equals(author, book.author);
    }

    public int hashCode() {
        return java.util.Objects.hash(super.hashCode(), title, publicationDate, author);
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "book{" +
                "title=" + title +
                ", publicationDate=" + publicationDate +
                ", author=" + author +
                '}';
    }
}
