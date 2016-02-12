package com.wind_now.wntest.beans;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

@Named(value = "book")
@RequestScoped
public class Book {

    private String isbn;
    private String title;
    private int price;
    
    public Book() {
    }

    public String showResult(){
        System.out.println(
                "title = " + this.title
        );
        return "result.xhtml";
    }
    
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
}
