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
class CalculatorControllerTest {

	/**
	 * Test method for
	 * {@link com.example.calculator.controller.CalculatorController#operation(int, int, java.lang.String)}.
	 */
	private CalculatorService calculatorService;

	private int valor1;
	private int valor2;
	private Integer valorSuma;
	private Integer valorResta;

	@Test
	void testOperationSuma() {
		valor1 = 5;
		valor2 = 4;
		valorSuma = 9;

		calculatorService = new CalculatorServiceImpl();

		try {
			Assert.assertTrue(calculatorService.add(valor1, valor2).equals(valorSuma));
		} catch (Exception e) {

		}
	}

	@Test
	void testOperationResta() {
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
