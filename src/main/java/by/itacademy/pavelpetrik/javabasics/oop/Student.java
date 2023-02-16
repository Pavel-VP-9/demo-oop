package by.itacademy.pavelpetrik.javabasics.oop;

public class Student extends User {
    private static int grant;

    // метод установки значений
    public void setGrant(int newGrant){
        grant = newGrant;
    }

    // метод получения значений
    public int getGrant(){
        return grant;
    }
    //создаем метод getIncome() который возвращает значение grant если есть, иначе 0.
    public int getIncome() {
        if (grant > 0) return grant;
        else return 0;

    }


}

