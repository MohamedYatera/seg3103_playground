import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DateTest {

  @Test
  void nextDate_sample() {
    Date d = new Date(2020, 5, 3);
    assertEquals(new Date(2020, 5, 4), d.nextDate());

  }

  @Test
  public void testNextDate_Year1700() {
    Date date = new Date(1700, 5, 20);
    assertEquals(new Date(1700, 5, 21), date.nextDate());
  }

  @Test
  public void testNextDate_Year2005() {
    Date date = new Date(2005, 4, 15);
    assertEquals(new Date(2005, 04, 16), date.nextDate());
  }
  
  @Test
  public void testNextDate_Year1() {
    Date date = new Date(-1, 10, 20);
    assertThrows(IllegalArgumentException.class, () -> date.nextDate());
  }

}