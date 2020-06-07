package calculadora.Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import calculadora.Calculadora;

import static java.time.Duration.ofMillis;
import static org.junit.jupiter.api.Assertions.assertTimeout;


import org.junit.jupiter.api.AfterAll;



public class CalculadoraTest {
	
	
	Calculadora cal;
	
		@BeforeAll
	static void setUpBeforeClass1() throws Exception {
		System.out.println("Iniciamos las pruebas");		
	}

	
	@AfterAll
	static void setUpAfterClass() throws Exception {
		System.out.println("Terminamos las pruebas");		
	}
	
	@BeforeEach
	void setUp() throws Exception {
		System.out.println("before()");
		cal = new Calculadora();
	}
	
	@AfterEach
	void tearDown() throws Exception {
		System.out.println("After()");
		cal.clear();
	}

		
	
	@Test
	public void testsum() {
		System.out.println("SUM()");
		assertEquals(5, cal.add(3,2));
	}
	
	@Test
	public void testsub() {
		System.out.println("SUB()");
		assertEquals(5, cal.sub(10, 5));
	}
	
	
	@Test
	public void testdiv() {
		System.out.println("Duv()");
		assertEquals(2, cal.div(10, 5));
	}
	
	@Test
	public void testdivcero() {
		System.out.println("Duvcero()");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
		     cal.div(5, 0);
		    });
		}
	
	
	@Test
	public void testtime() {
		System.out.println("TIme2()");
		assertTimeout(ofMillis(1), () -> {
	        // Perform task that takes less than 2 minutes.
			//Thread.sleep(100);
			cal.add(59,10002);
	    });
	
	}
	
	/* @Test
	  void timeoutExceededWithPreemptiveTermination() {
	        // The following assertion fails with an error message similar to:
	        // execution timed out after 10 ms
	        assertTimeoutPreemptively(ofMillis(100), () -> {
	            // Simulate task that takes more than 10 ms.
	            cal.operacionOptima();;
	        });
	    }*/

}
