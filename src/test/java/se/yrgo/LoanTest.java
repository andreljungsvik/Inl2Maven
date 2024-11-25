package se.yrgo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import se.yrgo.models.*;
import se.yrgo.utilities.GenderType;

import java.time.LocalDate;

public class LoanTest {

	//VG
	@Test
	public void testDueDate() {
		GenderType gender = GenderType.MALE;
		Book book1 = new Book(1, "boken", "", "", "", 0);
		Customer customer = new Customer("bok", "lars", "eriksson", "södravägen 12", "0735383854", "lars@eriksson.se", 12345, gender);
		Loan loan = new Loan(1, customer, book1);


		LocalDate expectedDueDate = LocalDate.now().plusDays(14);
		LocalDate acutalDueDate = loan.getDueDate();

		assertEquals(expectedDueDate, acutalDueDate, "Due date should be 14 days from today.");
   }
}