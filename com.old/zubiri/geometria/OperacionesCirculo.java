package com.zubiri.geometria;
/*
 * Clase para obtener resultados de distintas operaciones aritméticas.
 */
public class OperacionesCirculo {

	static final double pi = 3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679;
	private double radio = 0;

	public OperacionesCirculo(double valoradio) {

		radio = valoradio;

	}

	//public double circunferencia(double radio) {
	public double circunferencia() {

		double result;
		result = 2 * pi * radio;
		return result;

	}

	//public double area(double radio) {
	public double area() {

		double result;
		result = pi * radio * radio;
		return result;

	}
/*
	public double getRadio() {

		return radio;

	}



	public void setRadio(double rad) {

		radio = rad;

	}*/

}
