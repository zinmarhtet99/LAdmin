package com.example.admindrawer.User;

public class Book {


    String Bookid,Title,Author,Edt,publisher,recommand;


    public Book(String bookid, String title, String author, String edt, String publisher, String recommand) {
        Bookid = bookid;
        Title = title;
        Author = author;
        Edt = edt;
        this.publisher = publisher;
        this.recommand = recommand;
    }

    public void setBookid(String bookid) {
        Bookid = bookid;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public void setEdt(String edt) {
        Edt = edt;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setRecommand(String recommand) {
        this.recommand = recommand;
    }

    public String getBookid() {
        return Bookid;
    }

    public String getTitle() {
        return Title;
    }

    public String getAuthor() {
        return Author;
    }

    public String getEdt() {
        return Edt;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getRecommand() {
        return recommand;
    }
}
