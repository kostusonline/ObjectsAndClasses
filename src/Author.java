// Терских Константин, kostus.online.1974@yandex.ru, 2024
// Домашнее задание по теме "Объекты и классы"
// SkyPro

// ДЛЯ ПРОВЕРЯЮЩЕГО - КОПИПАСТ ИЗ ТЕКСТА ЗАДАНИЯ:
// Создайте класс Author, который содержит в себе данные об имени и фамилии автора.
// Напишите конструкторы для ... классов, заполняющие все поля.
// Создайте геттеры для всех полей автора ...
// https://my.sky.pro/student-cabinet/stream-lesson/145816/homework-requirements

public class Author {
    private final String firstName;
    private final String lastName;

    public Author(String firstName, String lastName) {
        if (firstName == null || lastName == null) {
            throw new IllegalArgumentException("Имя и фамилия автора не могут быть пустыми");
        }

        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
