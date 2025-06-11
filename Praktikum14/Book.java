public class Book{
    public String isbn;
    public String title;

    public Book(){

    }

    public Book(String isbn, String title){
        this.isbn = isbn;
        this.title = title;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Book) {
            Book other = (Book) obj;
            return this.isbn.equals(other.isbn) && this.title.equals(other.title);
        }
        return false;
    }

    public String toString(){
        return "ISBN: " + this.isbn + " Title: " + this.title;
    }
}