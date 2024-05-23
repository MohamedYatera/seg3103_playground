import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class DateNextDateOkTest {

    @ParameterizedTest
    @CsvSource(value = {
            "1700, 6, 20, 1700, 6, 21",
            "2005, 4, 15, 2005, 4, 16", // December is month 11 (0-based)
            "1901, 7, 20, 1901, 7, 21"
    })
    public void testNextDate_VariousInputs(int inputYear, int inputMonth, int inputDay, int expectedYear,
            int expectedMonth, int expectedDay) {
        // Create the input date object
        Date date = new Date(inputYear, inputMonth, inputDay);

        // Call nextDate and get the resulting date
        Date nextDate = date.nextDate();

        // Assert that the resulting date matches the expected values
        assertEquals(expectedYear, nextDate.getYear());
        assertEquals(expectedMonth, nextDate.getMonth());
        assertEquals(expectedDay, nextDate.getDay());
    }
}
