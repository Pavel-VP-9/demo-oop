package by.itacademy.pavelpetrik.javabasics.oop;

public class DemoOOP {
    public static void main(String[] args) {
        // Создаем объекты и адаем значение параметров
        Customer customer1 = new Customer();
        customer1.setNumberId(122);
        customer1.setLastName("Petrov");
        customer1.setName("Petr");
        customer1.setPatronymic("Petrovich");
        customer1.setAddress("Minsk, Oktyabrskaya Square, 1 ");
        customer1.setNumberCreditCard(123456789);
        customer1.setNumberBankAccount(987654321);

        Book book1 = new Book();
        book1.setNumberId(978-5-17145223-0);
        book1.setTitle("Дозоры: Ночной Дозор. Дневной Дозор. Сумеречнный дозор.");
        book1.setAuthor(" Лукьяненко Сергей Васильевич, Васильев Владимир Николаевич ");
        book1.setPublishing("ACT");
        book1.setYearOfPublication(2022);
        book1.setNumberOfPage(960);
        book1.setPrice(36.60);

        Car car1 = new Car();
        car1.setNumberId(1234);
        car1.setBrand("Mitsubishi");
        car1.setModel("ASX");
        car1.setYearOfRelease(2014);
        car1.setColour(" Red ");
        car1.setPrice(14900);
        car1.setRegistrationNumber("0777HH-77");

        System.out.println("Номер Id: " + customer1.getNumberId());
        System.out.println("Фамилия: " + customer1.getLastName());
        System.out.println("Имя: " + customer1.getName());
        System.out.println("Отчество: " +customer1.getPatronymic());
        System.out.println("Адрес: " + customer1.getAddress());
        System.out.println("Номер кредитной карточки: " + customer1.getNumberCreditCard());
        System.out.println("Номер банковсого счета: " + customer1.getNumberBankAccount());
        System.out.println( " ");
        System.out.println("Номер Id: " + book1.getNumberId());
        System.out.println("Название книги: " + book1.getTitle());
        System.out.println("Автор книги: " + book1.getAuthor());
        System.out.println("Издательство: " + book1.getPublishing());
        System.out.println("Год издания: " + book1.getYearOfPublication());
        System.out.println("Количество страниц книги: " + book1.getNumberOfPage());
        System.out.println("Цена книги (руб.): " + book1.getPrice());
        System.out.println(" ");
        System.out.println("Номер Id: " + car1.getNumberId());
        System.out.println("Марка автомобиля: " + car1.getBrand());
        System.out.println("Модель автомобиля: " + car1.getModel());
        System.out.println("Год выпуска: " + car1.getYearOfRelease());
        System.out.println("Цвет автомобиля: " + car1.getColour());
        System.out.println("Цена автомобиля($): " + car1.getPrice());
        System.out.println("Регистрационный номер автомобиля: " + car1.getRegistrationNumber());


        Student student1= new Student();
        student1.getGrant();
        System.out.println(student1.getGrant());

         Person person1 = new Person();
         person1.getSalary();
        System.out.println(person1.getSalary());



    }
}



