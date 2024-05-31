import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DateTest {

  @Test
  public void testNextDate_Year1700() {
    Date date = new Date(1700, 6, 20);
    assertEquals(new Date(1700, 6, 21), date.nextDate());
  }

  @Test
  public void testNextDate_Year2005() {
    Date date = new Date(2005, 4, 15);
    assertEquals(new Date(2005, 4, 16), date.nextDate());
  }

  @Test
  public void testNextDate_Year1901() {
    Date date = new Date(1901, 7, 20);
    assertEquals(new Date(1901, 7, 21), date.nextDate());
  }

  @Test
  public void testNextDate_Year3456() {
    Date date = new Date(3456, 3, 27);
    assertEquals(new Date(3456, 3, 28), date.nextDate());
  }

  @Test
  public void testNextDate_Year1500() {
    Date date = new Date(1500, 2, 17);
    assertEquals(new Date(1500, 2, 18), date.nextDate());
  }

  @Test
  public void testNextDate_Year17002() {
    Date date = new Date(1700, 6, 29);
    assertEquals(new Date(1700, 6, 30), date.nextDate());
  }

  @Test
  public void testNextDate_Year1800() {
    Date date = new Date(1800, 11, 29);
    assertEquals(new Date(1800, 11, 30), date.nextDate());
  }

  @Test
  public void testNextDate_Year3453() {
    Date date = new Date(3453, 1, 29);
    assertEquals(new Date(3453, 1, 30), date.nextDate());
  }

  @Test
  public void testNextDate_Year444() {
    Date date = new Date(444, 2, 29);
    assertEquals(new Date(444, 3, 1), date.nextDate());
  }

  @Test
  public void testNextDate_Year20052() {
    Date date = new Date(2005, 4, 30);
    assertEquals(new Date(2005, 5, 1), date.nextDate());
  }

  @Test
  public void testNextDate_Year34532() {
    Date date = new Date(3453, 1, 30);
    assertEquals(new Date(3453, 1, 31), date.nextDate());
  }

  @Test
  public void testNextDate_Year34562() {
    Date date = new Date(3456, 3, 30);
    assertEquals(new Date(3456, 3, 31), date.nextDate());
  }

  @Test
  public void testNextDate_Year19012() {
    Date date = new Date(1901, 7, 31);
    assertEquals(new Date(1901, 8, 1), date.nextDate());
  }

  @Test
  public void testNextDate_Year34533() {
    Date date = new Date(3453, 1, 31);
    assertEquals(new Date(3453, 2, 1), date.nextDate());
  }

  @Test
  public void testNextDate_Year34563() {
    Date date = new Date(3456, 12, 31);
    assertEquals(new Date(3457, 1, 1), date.nextDate());
  }



  @Test
  public void testNextDate_Year15002() {
    Date date = new Date(1500, 2, 31);
    assertThrows(IllegalArgumentException.class, () -> date.nextDate());
  }

  @Test
  public void testNextDate_Year15003() {
    Date date = new Date(1500, 2, 29);
    assertThrows(IllegalArgumentException.class, () -> date.nextDate());
  }

  @Test
  public void testNextDate_Year1() {
    Date date = new Date(-1, 10, 20);
    assertThrows(IllegalArgumentException.class, () -> date.nextDate());
  }

  @Test
  public void testNextDate_Year1458() {
    Date date = new Date(1458, 15, 12);
    assertThrows(IllegalArgumentException.class, () -> date.nextDate());
  }

  @Test
  public void testNextDate_Year1975() {
    Date date = new Date(1975, 6, -50);
    assertThrows(IllegalArgumentException.class, () -> date.nextDate());
  }

}