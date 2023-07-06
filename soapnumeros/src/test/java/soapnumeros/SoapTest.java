package soapnumeros;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class SoapTest {
	
	
	@Test
	public void TestNumberToWords() {
		
		//assertEquals para validar que el tiempo de respuesta sea 200.
		assertEquals("five",SoapNumerosApi.numberToWords(5).replaceAll("\\s",""));
		
	}
	
	
	@Test
	public void TestNumberToDollar() {
		
		//assertEquals para validar que el tiempo de respuesta sea 200.
		assertTrue(SoapNumerosApi.numberToDollars(5).contains("dollars"));
		
	}


}
