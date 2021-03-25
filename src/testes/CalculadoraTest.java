package testes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import codigos.Calculadora;

class CalculadoraTest {

	Calculadora calc = new Calculadora();

	@Test
	void testSum() {
		System.out.println("Test sum");
		double result = calc.somar(5, 5);
		assertEquals(10, result);
	}

	@Test
	void testSub() {
		System.out.println("Test sub");
		double result = calc.subtrair(5, 5);
		assertEquals(0, result);
	}

	@Test
	void testMultiplication() {
		System.out.println("Test Mult");
		double result = calc.multiplicar(5, 5);
		assertEquals(25, result);
	}

	@Test
	void testDivision() {
		System.out.println("Test Div");
		double result = calc.dividir(5, 5);
		assertEquals(1, result);
	}

}
