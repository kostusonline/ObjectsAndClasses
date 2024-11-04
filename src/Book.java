// Терских Константин, kostus.online.1974@yandex.ru, 2024
// Домашнее задание по теме "Объекты и классы"
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

public class Book {
    private final String name;
    private final Author author;
    private int yearOfPublication;

    public Book(String name, Author author, int yearOfPublication) {
        if (name == null || author == null) {
            throw new IllegalArgumentException();
        }

        this.name = name;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
    }

    public String getName() {
        return name;
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
}
