package se.yrgo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import se.yrgo.models.*;

public class BookCatalogTest {

    private BookCatalog bc;
    private Book book1;

    public BookCatalogTest() {
        bc = new BookCatalog();
        Book book1 = new Book(1, "Learning Java", "", "", "", 0);
        bc.addBook(book1);
    }

    //G
    @Test
    public void testAddABook() {
        BookCatalog bc = new BookCatalog();
        Book book1 = new Book(1, "Test", "", "", "", 0);
        bc.addBook(book1);
    }

    //G
    @Test
    public void testFindBook() {
        BookCatalog bc = new BookCatalog();
        Book book1 = new Book(1, "Test", "", "", "", 0);
        bc.addBook(book1);
        try {
            Book foundBook = bc.findBook("Test");
            assertEquals(book1, foundBook);
        } catch (BookNotFoundException e) {
            fail("Boken hittades inte även fast den borde lagts till.");
        }
    }

    //G
    @Test
    public void testFindBookIgnoringCase() {
        BookCatalog bc = new BookCatalog();
        Book book1 = new Book(1, "Test", "", "", "", 0);
        bc.addBook(book1);
        try {
            Book foundBook = bc.findBook("TEST");
            assertEquals(book1, foundBook);
        } catch (BookNotFoundException e) {
            fail("Boken hittades inte även fast den borde lagts till.");
        }
    }

    //G
    @Test
    public void testFindBookWithExtraSpaces() {
        BookCatalog bc = new BookCatalog();
        Book book1 = new Book(1, "Test", "", "", "", 0);
        bc.addBook(book1);
        try {
            Book foundBook = bc.findBook("   Test    ");
            assertEquals(book1, foundBook);
        } catch (BookNotFoundException e) {
            fail("Boken hittades inte även fast den borde lagts till.");
        }
    }

    //VG
    // This test should throw BookNotFoundException in order to pass.
    @Test
    public void testFindBookThatDoesntExist() throws BookNotFoundException {
        BookCatalog bc = new BookCatalog();
        Book book1 = new Book(1, "Test", "", "", "", 0);
        bc.addBook(book1);

        assertThrows(BookNotFoundException.class, () -> bc.findBook("Nonexistent Book"));
    }

}
