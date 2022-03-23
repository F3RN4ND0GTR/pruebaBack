/**
 * 
 */
package com.example.calculator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.calculator.service.CalculatorService;
import com.example.calculator.utils.Constants;

/**
 * @author Fernando Román
 *
 */
@Controller
public class CalculatorController {

	@Autowired
	public CalculatorService calculatorService;

	@GetMapping("/operation")
	@ResponseBody
	public Integer operation(int valor1, int valor2, String operation) throws Exception {
		if (Constants.SUMA.equals(operation)) {
			return calculatorService.add(valor1, valor2);
		} else if (Constants.RESTA.equals(operation)) {
			return calculatorService.sustract(valor1, valor2);
		} else {
			throw new Exception("Operación no definida");
		}
	}
}