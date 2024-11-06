// Терских Константин, kostus.online.1974@yandex.ru, 2024
// Домашнее задание по теме "Методы объектов"
// SkyPro

// ДЛЯ ПРОВЕРЯЮЩЕГО - КОПИПАСТ ИЗ ТЕКСТА ЗАДАНИЯ:
// Создайте класс Author, который содержит в себе данные об имени и фамилии автора.
// Напишите конструкторы для ... классов, заполняющие все поля.
// Создайте геттеры для всех полей автора ...
// https://my.sky.pro/student-cabinet/stream-lesson/145816/homework-requirements

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o){
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Author that = (Author) o;
        if (!firstName.equals(that.firstName)) {
            return false;
        }

        return lastName.equals(that.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, super.hashCode());
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
}
