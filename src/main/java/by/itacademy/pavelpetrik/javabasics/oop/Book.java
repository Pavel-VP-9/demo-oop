package by.itacademy.pavelpetrik.javabasics.oop;

public class Book {
    // Поля скрыли от внешненго доступа
    private  int numberId;
    private String title; // название
    private String author; // автор
    private String publishing; // издательство
    private int yearOfPublication; //год издания
    private int numberOfPage; // количество страниц
    private double price; // цена

    //Методы установки значений
    public void setNumberId( int newNumberId){
        numberId = newNumberId;
    }

    public void setTitle(String newTitle) {
        title = newTitle;
    }
    public void setAuthor(String newAuthor){
        author = newAuthor;
    }

    public void setPublishing(String newPublishing) {
        publishing = newPublishing;
    }

    public void setYearOfPublication(int newYearOfPublication) {
        yearOfPublication = newYearOfPublication;
    }

    public void setNumberOfPage(int newNumberOfPage) {
        numberOfPage = newNumberOfPage;
    }

    public void setPrice(double newPrice) {
        price = newPrice;
    }
    //Методы получения значений

    public int getNumberId() {
        return numberId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublishing() {
        return publishing;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public int getNumberOfPage() {
        return numberOfPage;
    }

    public double getPrice() {
        return price;
    }
}



