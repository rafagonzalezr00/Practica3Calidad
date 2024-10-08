package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pkg.Cuenta;

class CuentaTest {
	
	Cuenta cuenta12345 = new Cuenta("12345", "user1", 50d);
	Cuenta cuenta67890 = new Cuenta("67890", "user2", 0d);
		
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		//Cuenta=new Cuenta(0d);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	/*@Test
	void testIngresar() {
		Cuenta.Ingresar(500d);
		assertEquals(500, Cuenta.getSaldo());
	}
	
	@Test
	void testRetirar() {
		Cuenta.Retirar(500d);
		assertEquals(-500, Cuenta.getSaldo());
	}*/
	
	@Test
	void test0014() {
		cuenta12345.Ingresar(200d);
		cuenta67890.Retirar(350d);
		cuenta12345.Ingresar(100d);
		cuenta67890.Retirar(200d);
		cuenta67890.Retirar(150d);
		cuenta12345.Retirar(200d);
		cuenta67890.Retirar(50d);
		cuenta67890.Retirar(100d);
		
		System.out.println("Cuenta 12345: " + cuenta12345.getSaldo());
		System.out.println("Cuenta 67890: " + cuenta67890.getSaldo());
	}

}
