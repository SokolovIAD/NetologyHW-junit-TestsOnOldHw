import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

class MethodsTest {
    Methods mtdh;

    @BeforeEach
    public void beforeEach() {
        mtdh = new Methods();
    }

    @AfterEach
    public void afterEach() {
        mtdh = null;
    }

    @Test
    void testIsDoubleNumber() {
        Double input = 1.234;
        assertThat(input, instanceOf(Double.class));
    }

    @Test
    void testPrintInfo() {
        String expected = "123";
        assertThat(expected, anyOf(containsString("1"), containsString("2"), containsString("3")));
    }

    @Test
    void testEqualityOfNumbers() {
        Double a = 1.234, b = 1.432;
        Boolean expected = false;
        boolean result = Methods.equalityOfNumbers(a, b);
        assertThat(expected, equalTo(result));
    }

    @Test
    void testRoundingANumber() {
        Double a = 1.234;
        int expected = 1;
        int result = Methods.roundingANumber(a);
        assertThat(expected, equalTo(result));
    }

    @Test
    void testIntegerNumber() {
        Double a = 16.3245;
        int expected = 16;
        int result = Methods.integerNumber(a);
        assertThat(expected, equalTo(result));
    }

}