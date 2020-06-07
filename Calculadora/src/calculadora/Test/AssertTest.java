package calculadora.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import calculadora.Calculadora;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

@RunWith(Parameterized.class)
class AssertTest {
		
	@DisplayName("test add parameters")
    @ParameterizedTest(name = "{index} =>exp={0}, a={1}, b={2}")
    @CsvSource({
            "18, 5, 13",
            "2, 1, 1",
            "5, 3, 2",
            "10, 11,-1"
    })
    void sum(int exp, int a, int b) {
		Calculadora cal = new Calculadora();
        assertEquals(exp, cal.add(a, b));
    }

}

