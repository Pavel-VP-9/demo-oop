package by.itacademy.pavelpetrik.javabasics.oop;

public class Person extends Student {
    private static int salary;
    public void setSalary(int newSalary){

        salary = newSalary;
    }
    public int getSalary(){

        return salary;
    }
    // метод getIncome() и возвращает доход
    // как сумму стипендии и зарплаты (grant + salary).
    public int getIncome(){
        return salary + getGrant();
    }
}
