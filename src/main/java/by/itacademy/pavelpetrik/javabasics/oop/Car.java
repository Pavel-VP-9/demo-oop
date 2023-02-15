package by.itacademy.pavelpetrik.javabasics.oop;

public class Car {
    // Поля скрыли от внешненго доступа
    private  int numberId;
    private String brand; // марка
    private String model;
    private int yearOfRelease; //год выпуска
    private String colour; //
    private int price; // цена
    private String registrationNumber;

    //Организовали доступ к полям, через Методы установки значений
    public void setNumberId(int newNumberId){
        numberId = newNumberId;
    }

    public void setBrand(String newBrand) {
        brand = newBrand;
    }

    public void setModel(String newModel) {
        model = newModel;
    }

    public void setYearOfRelease(int newYearOfRelease) {
        yearOfRelease = newYearOfRelease;
    }

    public void setColour(String newColour) {
        colour = newColour;
    }

    public void setPrice(int newPrice) {
        price = newPrice;
    }

    public void setRegistrationNumber(String newRegistrationNumber) {
        registrationNumber = newRegistrationNumber;
    }
    // Методы получения значений
    public int getNumberId() {
        return numberId;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public String getColour() {
        return colour;
    }

    public int getPrice() {
        return price;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }
}

