import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class DateNextDateOkTest {

    @ParameterizedTest
    @CsvSource(value = {
            "1700, 6, 20, 1700, 6, 21",
            "2005, 4, 15, 2005, 4, 16", 
            "3456,3,27,3456,3,28",
            "1500,2,17,1500,2,18",
            "1700,6,29,1700,6,30",
            "1800,11,29,1800,11,30",
            "3453,1,29,3453,1,30",
            "444,2,29,444,3,1",
            "2005,4,30,2005,5,1",
            "3453,1,30,3453,1,31",
            "3456,3,30,3456,3,31",
            "1901,7,31,1901,8,1",
            "3453,1,31,3453,2,1",
            "3456,12,31,3457,1,1",

    })
    public void testNextDate_VariousInputs(int inputYear, int inputMonth, int inputDay, int expectedYear,
            int expectedMonth, int expectedDay) {
       
        Date date = new Date(inputYear, inputMonth, inputDay);

        Date nextDate = date.nextDate();

        
        assertEquals(expectedYear, nextDate.getYear());
        assertEquals(expectedMonth, nextDate.getMonth());
        assertEquals(expectedDay, nextDate.getDay());

    }
}
