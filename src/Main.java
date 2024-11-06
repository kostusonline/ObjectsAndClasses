// Терских Константин, kostus.online.1974@yandex.ru, 2024
// Домашнее задание по теме "Методы объектов"
// SkyPro

public class Main {
    public static void main(String[] args) {
        final Author[] authors = new Author[2];
        authors[0] = new Author("Эрнест", "Хемингуэй");
        authors[1] = new Author("Фёдор", "Достоевский");

        final Book[] books = new Book[2];
        books[0] = new Book("Прощай, оружие!", authors[0], 1936);
        books[1] = new Book("Записки из мёртвого дома", authors[1], 1862); // первое издание

        printBooks(books);

        books[1].setYearOfPublication(1865); // третье издание
        printBooks(books);
    }

    private static void printBooks(Book[] books) {
        if (books == null) {
            return;
        }

        for (var book : books) {
            if (book == null) {
                continue;
            }
            System.out.println(book);
        }
    }
}