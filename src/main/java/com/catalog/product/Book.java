package com.catalog.product;

/**
 * Class for objects books
 */
public class Book extends Product {

    private int pageNumber;
    private String author;

    private Book() {
    }

    private Book(long id, String title, String description, double price, double quantity, int pageNumber, String author,
                 String image) {
        super(id, title, description, price, quantity, image);
        this.pageNumber = pageNumber;
        this.author = author;
    }

    /**
     * method for get description for book
     * @return returns book description
     */
    public String getDetails() {
        return super.getDetails() + "Page number: " + pageNumber + "\r\n " + "Author: " + author + "\r\n ";
    }


    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    /**
     * method for get author for book
     * @return returns book author
     */
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public static void getDefaultImage() {
        System.out.println("book default image");
    }


    public static Book createItem() {
        return new Book();
    }

    public static Book createItem(long id, String title, String description, double price, double quantity, int pageNumber, String author, String image) {
        return new Book(id, title, description, price, quantity, pageNumber, author, image);
    }
}
