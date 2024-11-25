import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DateTest {
  //test
  @Test
  void nextDate_a() {
    Date today = new Date(1700, 6, 40);
    Date expectedTomorrow = new Date(1700, 6, 41);
    assertEquals(expectedTomorrow, today.nextDate());
  }
  //test
  @Test
  void nextDate_b() {
    Date today = new Date(2000, -1, 2);
    Date expectedTomorrow = new Date(2000, -1, 2);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_endOfFebLeapYear() {
    Date today = new Date(2020, 2, 29);
    Date expectedTomorrow = new Date(2020, 3, 1);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_endOfFebNonLeapYear() {
    Date today = new Date(2019, 2, 28);
    Date expectedTomorrow = new Date(2019, 3, 1);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_endOfMonthApril() {
    Date today = new Date(2021, 4, 30);
    Date expectedTomorrow = new Date(2021, 5, 1);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_endOfMonthJune() {
    Date today = new Date(2021, 6, 30);
    Date expectedTomorrow = new Date(2021, 7, 1);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_endOfMonthSept() {
    Date today = new Date(2021, 9, 30);
    Date expectedTomorrow = new Date(2021, 10, 1);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_endOfMonthNov() {
    Date today = new Date(2021, 11, 30);
    Date expectedTomorrow = new Date(2021, 12, 1);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_regularDay() {
    Date today = new Date(2021, 7, 15);
    Date expectedTomorrow = new Date(2021, 7, 16);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_endOfYear() {
    Date today = new Date(2021, 12, 31);
    Date expectedTomorrow = new Date(2022, 1, 1);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void date_invalidDay_lessThan1() {
    assertThrows(
        IllegalArgumentException.class,
        () -> new Date(2021, 1, 0));
  }

  @Test
  void date_invalidDay_moreThan31() {
    assertThrows(
        IllegalArgumentException.class,
        () -> new Date(2021, 1, 32));
  }

  @Test
  void date_invalidDay_30DayMonth() {
    assertThrows(
        IllegalArgumentException.class,
        () -> new Date(2021, 4, 31));
  }

  @Test
  void date_invalidDay_febNonLeapYear() {
    assertThrows(
        IllegalArgumentException.class,
        () -> new Date(2021, 2, 29));
  }

  @Test
  void date_invalidDay_febLeapYear() {
    assertThrows(
        IllegalArgumentException.class,
        () -> new Date(2020, 2, 30));
  }
  

  // _______________________________________________________________

 

  @Test
  void nextDate_tc01() {
    Date today = new Date(1700, 6, 20);
    Date expectedTomorrow = new Date(1700, 6, 21);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc02() {
    Date today = new Date(2005, 4, 15);
    Date expectedTomorrow = new Date(2005, 4, 16);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc03() {
    Date today = new Date(1901, 7, 20);
    Date expectedTomorrow = new Date(1901, 7, 21);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc04() {
    Date today = new Date(3456, 3, 27);
    Date expectedTomorrow = new Date(3456, 3, 28);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc05() {
    Date today = new Date(1500, 2, 17);
    Date expectedTomorrow = new Date(1500, 2, 18);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc06() {
    Date today = new Date(1700, 6, 29);
    Date expectedTomorrow = new Date(1700, 6, 30);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc07() {
    Date today = new Date(1800, 11, 29);
    Date expectedTomorrow = new Date(1800, 11, 30);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc08() {
    Date today = new Date(3453, 1, 29);
    Date expectedTomorrow = new Date(3453, 1, 30);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc09() {
    Date today = new Date(444, 2, 29);
    Date expectedTomorrow = new Date(444, 3, 1);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc10() {
    Date today = new Date(2005, 4, 30);
    Date expectedTomorrow = new Date(2005, 5, 1);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc11() {
    Date today = new Date(3453, 1, 30);
    Date expectedTomorrow = new Date(3453, 1, 31);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc12() {
    Date today = new Date(3456, 3, 30);
    Date expectedTomorrow = new Date(3456, 3, 31);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc13() {
    Date today = new Date(1901, 7, 31);
    Date expectedTomorrow = new Date(1901, 8, 1);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc14() {
    Date today = new Date(3453, 1, 31);
    Date expectedTomorrow = new Date(3453, 2, 1);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc15() {
    Date today = new Date(3456, 12, 31);
    Date expectedTomorrow = new Date(3457, 1, 1);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_invalid_tc16() {
    assertThrows(
        IllegalArgumentException.class,
        () -> new Date(1500, 2, 31));
  }

  @Test
  void nextDate_invalid_tc17() {
    assertThrows(
        IllegalArgumentException.class,
        () -> new Date(1500, 2, 29));
  }

  @Test
  void nextDate_invalid_tc18() {
    assertThrows(
        IllegalArgumentException.class,
        () -> new Date(-1, 10, 20));
  }

  @Test
  void nextDate_invalid_tc19() {
    assertThrows(
        IllegalArgumentException.class,
        () -> new Date(1458, 15, 12));
  }

  @Test
  void nextDate_invalid_tc20() {
    assertThrows(
        IllegalArgumentException.class,
        () -> new Date(1975, 6, -50));
  }

}