package com.example.calculator.service.impl;

import com.example.calculator.service.CalculatorService;

public class CalculatorServiceImpl implements CalculatorService {

	@Override
	public Integer add(int valor1, int valor2) {
		return valor1 + valor2;
	}

	@Override
	public Integer sustract(int valor1, int valor2) {
		return valor1 - valor2;
	}
}
