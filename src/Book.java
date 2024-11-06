// Терских Константин, kostus.online.1974@yandex.ru, 2024
// Домашнее задание по теме "Методы объектов"
// SkyPro

// ДЛЯ ПРОВЕРЯЮЩЕГО - КОПИПАСТ ИЗ ТЕКСТА ЗАДАНИЯ:
// Создайте класс Book, который будет содержать в себе данные о
// названии,
// авторе и
// годе публикации книги.
// Убедитесь, что типы полей класса Book выбраны правильно:
// это String, Author int.
// Создайте геттеры для ... всех полей книги.
// Создайте сеттер для поля «Год публикации» у книги.
// https://my.sky.pro/student-cabinet/stream-lesson/145816/homework-requirements

import java.util.Objects;

public class Book {
    private final String title;
    private final Author author;
    private int yearOfPublication;

    public Book(String title, Author author, int yearOfPublication) {
        if (title == null || author == null) {
            throw new IllegalArgumentException();
        }

        this.title = title;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Book that = (Book) o;
        return yearOfPublication == that.yearOfPublication &&
                title.equals(that.title) &&
                author.equals(that.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(yearOfPublication, title, super.hashCode());
    }

    public String toString() {
        return getAuthor() + ": " + "\"" + getTitle() + "\", " + getYearOfPublication();
    }
}
