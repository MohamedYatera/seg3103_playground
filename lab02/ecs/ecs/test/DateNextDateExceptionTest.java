import org.junit.Test;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

public class DateNextDateExceptionTest {
  // im not sure how to do this one so i tried using chat gpt

  @Parameterized.Parameters
  public static Collection<Object[]> data() {
    return Arrays.asList(new Object[][] {
      {1500, 2, 31},
      {1500, 2, 31}, 
      {-1, 10, 20}, 
      {1458, 15, 12}, 
    });
  }

  @Test(expected = IllegalArgumentException.class)
  @Parameterized.UsesParameters("data")
  public void testNextDate_InvalidInput_ThrowsException(int year, int month, int day) {
    new Date(year, month, day).nextDate();
  }
}
