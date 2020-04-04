package company.dz11;

import java.io.*;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class ProgramMethod {
    final static String path = "..\\MyBooks.dat";

    public static void main(String[] args) {
        ArrayList<Books> newBook = new ArrayList<Books>();// десериализация в новый список

        createBooks();
        groupingByAutorName(readFromFile(newBook));
    }

    private static void createBooks() {
        ArrayList<Books> listBook = new ArrayList<Books>();// создадим список объектов, которые будем записывать
        listBook.add(new Books("Басни", "Крылов А.И."));
        listBook.add(new Books("Евгений Онегин", "Пушкин А.С."));
        listBook.add(new Books("Линия грез", "Лукьяненко С.В."));
        listBook.add(new Books("Императоры иллюзий", "Лукьяненко С.В."));
        listBook.add(new Books("Пол короля", "Аберкромби Дж."));

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path))) {// записываем в файл объекты
            oos.writeObject(listBook);

        } catch (IOException e) {
            System.out.println("ошибка записи в файл ");
        }
    }

    private static ArrayList readFromFile(ArrayList<Books> newBook) {

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path))) {

            newBook = ((ArrayList<Books>) ois.readObject());

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Ошибка вывода или нет сериализации");
        }
            return newBook;

    }
    private static void groupingByAutorName(ArrayList<Books> newBook) {
        newBook.stream()
                .collect(Collectors.groupingBy(Books::getAutorBook))
                .entrySet().forEach(System.out::println);
    }
}

class Books implements Serializable {
    private String nameBook;
    private String autorBook;

    public Books(String nameBook, String autorBook) {
        this.nameBook = nameBook;
        this.autorBook = autorBook;
    }

    public String getAutorBook() {
        return autorBook;
    }

    @Override
    public String toString() {
        return nameBook;
    }

}
