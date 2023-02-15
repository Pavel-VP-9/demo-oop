package by.itacademy.pavelpetrik.javabasics.oop;

public class Customer {
    // Поля скрыли от внешненго доступа
    private  int numberId;
    private String lastName;
    private String name;
    private String patronymic; //отчество
    private String address;
    private int numberCreditCard;
    private int numberBankAccount; //номер банковского счета

    // Методы установки значений
    public void setNumberId(int newNumberId) {
        numberId = newNumberId;
    }
    public void setLastName(String newLastName){
        lastName = newLastName;
    }
    public void setName(String newName) {
        name = newName;
    }
    public void setPatronymic(String newPatronymic) {
        patronymic = newPatronymic;
    }
    public void setAddress(String newAddress) {
        address = newAddress;
    }
    public void setNumberCreditCard(int newNumberCreditCard) {
        numberCreditCard = newNumberCreditCard;
    }
    public void setNumberBankAccount(int newNumberBankAccount) {
        numberBankAccount = newNumberBankAccount;
    }
    // Методы получения значений
    public int getNumberId(){
        return numberId;
    }
    public String getLastName(){
        return lastName;
    }
    public String getName(){
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getAddress() {
        return address;
    }

    public int getNumberCreditCard() {
        return numberCreditCard;
    }

    public int getNumberBankAccount() {
        return numberBankAccount;
    }
}


