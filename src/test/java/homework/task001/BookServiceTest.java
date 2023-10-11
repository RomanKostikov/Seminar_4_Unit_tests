package homework.task001;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

// Подключаем расширение Mockito к тестируемому классу
@ExtendWith(MockitoExtension.class)
class BookServiceTest {
    // Создаем заглушку типа Mock для интерфейса BookRepository
    @Mock
    private BookRepository mockBockService;

    // Внедряем мокируемую заглушку в конструктор класса BookService
    @InjectMocks
    private BookService bookService;

    /**
     * Тестируем поведение метода findBookById класса BookService
     */
    @Test
    public void findBookByIdShouldReturnBook() {
        /* Задаем поведение заглушки:
            когда будет вызван метод findById() с аргументом 1,
            данный метод должен вернуть книгу с:
                id = 1;
                title = SomeTitle;
                author = SomeAuthor;
         */
        when(mockBockService.findById("1")).thenReturn(new Book("1", "SomeTitle", "SomeAuthor"));

        /* Создаем ожидаемый id и получаем id книги при вызове метода findBookById() класса BookService.
            Примечание: данные операции можно опустить если реализовать методы equals() и hashCode() в классе Book
                        и провести сравнение ожидаемого и получаемого объекта.
         */
        String expectIdBook = "1";
        String actualIdBook = bookService.findBookById("1").getId();

        // Проверяем что у заглушки один раз был вызван метод findById() с аргументом 1
        verify(mockBockService).findById("1");
        // Проверяем что ожидаемый id равен id полученного объекта
        assertEquals(expectIdBook, actualIdBook, "Метод findBookById возвращает объект с не корректным ID");
    }

    /**
     * Проверяем поведение метода findAllBooks класса BookService
     */
    @Test
    public void findAllBooksShouldReturnListBooks() {
        /* Задаем поведение заглушки:
            когда будет вызван метод findAllBooks(),
            данный метод должен вернуть список с 4 книгами
         */
        when(mockBockService.findAll())
                .thenReturn(new ArrayList<>(Arrays.asList(
                        new Book("1"),
                        new Book("2"),
                        new Book("3"),
                        new Book("4")
                )));
        // Задаем ожидаемый размер листа книг и получаем размер листа при вызове метода findAllBooks класса BookService
        int expectedSizeListBooks = 4;
        int actualSizeListBooks = bookService.findAllBooks().size();

        // Проверяем что у заглушки один раз был вызван метод findAll()
        verify(mockBockService).findAll();
        // Проверяем что размер листа равен полученному
        assertEquals(expectedSizeListBooks,
                actualSizeListBooks,
                "Метод findAllBooks возвращает некорректный размер листа с книгами");
    }
}