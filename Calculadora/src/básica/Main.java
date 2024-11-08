package básica;

import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	private static double calcular(double op1, double op2, int operacion) {
		double res = 0;
		switch (operacion) {
		case 1: {
			res = op1 + op2;
			break;
		}
		case 2: {
			res = op1 - op2;
			break;
		}
		case 3: {
			res = op1 * op2;
			break;
		}
		case 4: {
			res = op1 / op2;
			break;
		}
		default: {
			System.out.println("Operación no contemplada");
		}
		}

		return res;
	}

	public static void main(String[] args) {
		double op1, op2, resultado;
		int operacion = 0;

		System.out.println("###############");
		System.out.println("##CALCULADORA##");
		System.out.println("###############");

		System.out.println("¿Qué operación quieres realizar?");
		System.out.println("1.Suma");
		System.out.println("2.Resta");
		System.out.println("3.Multiplicación");
		System.out.println("4.División");
		operacion = sc.nextInt();
		System.out.println("Introduce el primer operador");
		op1 = sc.nextDouble();
		System.out.println("Introduce el segundo operador");
		op2 = sc.nextDouble();

		resultado=calcular(op1, op2, operacion);
		System.out.println("El resultado  de tu operación es: " + resultado);
	}

}
