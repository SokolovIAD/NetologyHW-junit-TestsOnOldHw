import com.sun.jdi.connect.Connector;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

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
    void equalityOfNumbers() {
        Double a = 1.234, b = 1.432;
        Boolean expected = false;
        boolean result = mtdh.equalityOfNumbers(a, b);
        Assertions.assertEquals(expected, result);
    }


    @Test
    void roundingANumber() {
        Double a = 1.234;
        int expected = 1;
        int result = mtdh.roundingANumber(a);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void integerNumber() {
        Double a = 16.3245;
        int expected = 16;
        int result = mtdh.integerNumber(a);
        Assertions.assertEquals(expected, result);
    }
}