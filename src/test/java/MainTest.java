import org.testng.annotations.Test;
import org.testng.Assert;
import com.calculator.Main;

public class MainTest {
  @Test
  public void testPositiveNumbersWithAllEqualNumbers () {
    double a = 5, b = 5, c = 5, d = 5;
    double expected = 1;
    double actual = Main.A(a, b, c, d);
    Assert.assertEquals(actual, expected, 0.001);
  }

  @Test
  public void testWithRandomPositiveNumbers () {
    double a = 1, b = 4, c = 3, d = 7;
    double expected = 0.5;
    double actual = Main.A(a, b, c, d);
    Assert.assertEquals(actual, expected, 0.001);
  }

  @Test
  public void testWithZeroNumerator () {
    double a = 0, b = 0, c = 3, d = 7;
    double expected = 0;
    double actual = Main.A(a, b, c, d);
    Assert.assertEquals(actual, expected, 0.001);
  }

  @Test
  public void testWithPositiveNumeratorAndZeroDenominator () {
    double a = 2, b = 1, c = 0, d = 0;
    double expected = Double.POSITIVE_INFINITY;
    double actual = Main.A(a, b, c, d);
    Assert.assertEquals(actual, expected, 0.001);
  }

  @Test
  public void testWithZeroNumeratorAndDenominator () {
    double a = 0, b = 0, c = 0, d = 0;
    double expected = Double.NaN;
    double actual = Main.A(a, b, c, d);
    Assert.assertEquals(actual, expected);
  }

  @Test
  public void testWithNegativeNumeratorAndZeroDenominator () {
    double a = -2, b = -1, c = 0, d = 0;
    double expected = Double.NEGATIVE_INFINITY;
    double actual = Main.A(a, b, c, d);
    Assert.assertEquals(actual, expected, 0.001);
  }

  @Test
  public void testWithNegativeNumeratorAndPositiveDenominator () {
    double a = -2, b = -4, c = 4, d = 6;
    double expected = -0.6;
    double actual = Main.A(a, b, c, d);
    Assert.assertEquals(actual, expected, 0.001);
  }

  @Test
  public void testWithPositiveNumeratorAndNegativeDenominator () {
    double a = -2, b = 4, c = 4, d = -6;
    double expected = -1;
    double actual = Main.A(a, b, c, d);
    Assert.assertEquals(actual, expected, 0.001);
  }

  @Test
  public void testWithAllNegativeNumbers () {
    double a = -2, b = -1, c = -4, d = -5;
    double expected = 0.3333333333333333;
    double actual = Main.A(a, b, c, d);
    Assert.assertEquals(actual, expected, 0.001);
  }

  @Test
  public void testWithDecimalNumbers () {
    double a = -2.5, b = 1.27, c = 9.99, d = 4.7;
    double expected = -0.08373042886;
    double actual = Main.A(a, b, c, d);
    Assert.assertEquals(actual, expected, 0.001);
  }
}
