public class Book {
    private String name;
    private Author author;
    private Integer publicationYear;


    public Book(String name, Author author, Integer publicationYear) {
        this.name = name;
        this.author = author;
        this.publicationYear = publicationYear;
    }
    public String toString() {
        return "Название: "+name+", автор: "+author+", год публикации: "+publicationYear;
    }
    public String getName(){
        return name;
    }
    public Author getAuthor(){
        return author;
    }
    public Integer getPublicationYear(){
        return publicationYear;
    }
    public void setPublicationYear(int publicationYear){
        this.publicationYear = publicationYear;
    }

}
