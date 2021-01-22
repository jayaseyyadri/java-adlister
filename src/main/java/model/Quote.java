package model;

import model.Author;

public class Quote {


    private long id;
    private String content;
    private Author author ;


//    make relationships with objects no need to create author id which is the foreign key

    public Quote(){}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

}
