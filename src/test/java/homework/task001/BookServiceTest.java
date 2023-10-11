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

// ���������� ���������� Mockito � ������������ ������
@ExtendWith(MockitoExtension.class)
class BookServiceTest {
    // ������� �������� ���� Mock ��� ���������� BookRepository
    @Mock
    private BookRepository mockBockService;

    // �������� ���������� �������� � ����������� ������ BookService
    @InjectMocks
    private BookService bookService;

    /**
     * ��������� ��������� ������ findBookById ������ BookService
     */
    @Test
    public void findBookByIdShouldReturnBook() {
        /* ������ ��������� ��������:
            ����� ����� ������ ����� findById() � ���������� 1,
            ������ ����� ������ ������� ����� �:
                id = 1;
                title = SomeTitle;
                author = SomeAuthor;
         */
        when(mockBockService.findById("1")).thenReturn(new Book("1", "SomeTitle", "SomeAuthor"));

        /* ������� ��������� id � �������� id ����� ��� ������ ������ findBookById() ������ BookService.
            ����������: ������ �������� ����� �������� ���� ����������� ������ equals() � hashCode() � ������ Book
                        � �������� ��������� ���������� � ����������� �������.
         */
        String expectIdBook = "1";
        String actualIdBook = bookService.findBookById("1").getId();

        // ��������� ��� � �������� ���� ��� ��� ������ ����� findById() � ���������� 1
        verify(mockBockService).findById("1");
        // ��������� ��� ��������� id ����� id ����������� �������
        assertEquals(expectIdBook, actualIdBook, "����� findBookById ���������� ������ � �� ���������� ID");
    }

    /**
     * ��������� ��������� ������ findAllBooks ������ BookService
     */
    @Test
    public void findAllBooksShouldReturnListBooks() {
        /* ������ ��������� ��������:
            ����� ����� ������ ����� findAllBooks(),
            ������ ����� ������ ������� ������ � 4 �������
         */
        when(mockBockService.findAll())
                .thenReturn(new ArrayList<>(Arrays.asList(
                        new Book("1"),
                        new Book("2"),
                        new Book("3"),
                        new Book("4")
                )));
        // ������ ��������� ������ ����� ���� � �������� ������ ����� ��� ������ ������ findAllBooks ������ BookService
        int expectedSizeListBooks = 4;
        int actualSizeListBooks = bookService.findAllBooks().size();

        // ��������� ��� � �������� ���� ��� ��� ������ ����� findAll()
        verify(mockBockService).findAll();
        // ��������� ��� ������ ����� ����� �����������
        assertEquals(expectedSizeListBooks,
                actualSizeListBooks,
                "����� findAllBooks ���������� ������������ ������ ����� � �������");
    }
}