package com.example.calculator.service;

import org.springframework.stereotype.Service;

@Service
public interface CalculatorService {

	public Integer add(int valor1, int valor2);

	public Integer sustract(int valor1, int valor2);

}
