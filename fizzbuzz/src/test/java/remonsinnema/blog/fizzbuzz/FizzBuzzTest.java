package remonsinnema.blog.fizzbuzz;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class FizzBuzzTest {

  private final FizzBuzz fizzbuzz = new FizzBuzz();

  @Test
  public void test() {
    assertFizzBuzz("1", 1);
    assertFizzBuzz("2", 2);
    assertFizzBuzz("Fizz", 3);
    assertFizzBuzz("4", 4);
    assertFizzBuzz("Buzz", 5);
  }

  private void assertFizzBuzz(String expected, int n) {
    assertEquals(Integer.toString(n), expected, fizzbuzz.get(n));
  }

}
