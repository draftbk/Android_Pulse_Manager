package com.example.slf.pulse_manager.object;

/**
 * Created by slf on 16/4/2.
 */
public class Book {
    private String title;
    private String content;
    private int image_book;

    public Book(String title, String content, int image_book) {
        this.title = title;
        this.content = content;
        this.image_book = image_book;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getImage_book() {
        return image_book;
    }

    public void setImage_book(int image_book) {
        this.image_book = image_book;
    }
}
