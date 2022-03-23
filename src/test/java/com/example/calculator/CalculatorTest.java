/**
 * 
 */
package com.example.calculator;

import org.junit.Assert;
import org.junit.Test;

import com.example.calculator.service.CalculatorService;
import com.example.calculator.service.impl.CalculatorServiceImpl;

/**
 * @author Fernando Román
 *
 */
public class CalculatorTest {
	
	private CalculatorService calculatorService;

	private int valor1;
	private int valor2;
	private Integer valorSuma;
	private Integer valorResta;

	/**
	 * Test method for {@link com.example.calculator.service.impl.CalculatorServiceImpl#add(int, int)}.
	 */
	@Test
	public void testAdd() {
		valor1 = 5;
		valor2 = 4;
		valorSuma = 9;

		calculatorService = new CalculatorServiceImpl();

		try {
			Assert.assertTrue(calculatorService.add(valor1, valor2).equals(valorSuma));
		} catch (Exception e) {

		}
	}

	/**
	 * Test method for {@link com.example.calculator.service.impl.CalculatorServiceImpl#sustract(int, int)}.
	 */
	@Test
	public void testSustract() {
		valor1 = 5;
		valor2 = 4;
		valorResta = 1;

		calculatorService = new CalculatorServiceImpl();

		try {
			Assert.assertTrue(calculatorService.sustract(valor1, valor2).equals(valorResta));
		} catch (Exception e) {

		}
	}
}
