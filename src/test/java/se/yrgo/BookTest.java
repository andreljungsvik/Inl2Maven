package se.yrgo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import se.yrgo.models.*;

class BookTest {

	//G
	@Test
	public void test2EqualBooks() {
		Book book1 = new Book(1, "boken", "", "", "", 0);
		Book book2 = new Book(1, "boken", "", "", "", 0);

		assertEquals(book1, book2);
	}

	//G
	@Test
	public void test2NonEqualBooks() {
		Book book1 = new Book(1, "boken", "", "", "", 0);
		Book book2 = new Book(2, "den andra boken", "", "", "", 0);

		assertNotEquals(book1, book2);
	}

}
