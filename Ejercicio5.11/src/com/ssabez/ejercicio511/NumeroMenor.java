package com.ssabez.ejercicio511;

import java.util.Scanner;

public class NumeroMenor {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.printf("%s%n%s%n%n%s%n%s",
				"Programa que encuentra el menor de varios enteros",
				"El primer valor leido especifica el numero de valores a introducir",
				"Introduzca un numero entero",
				"----> ");
		
		int num = input.nextInt();
		
		int menor1 = num;
		
		for(int i = 1; i < num; i++) {
			
			System.out.printf("%s%n%s",
					"Introduzca un numero entero",
					"----> ");
			int num2 = input.nextInt();
			
			if(num2 < menor1) {
				menor1 = num2;
			}
			
		}//Fin de for
		
		if(num != 0) {
			System.out.printf("El menor de los numeros ingresados es: %d", menor1);
		}
		else {
			System.out.println("No se introdujeron numeros");
		}
		
	}//Fin de metodo main

}//Fin de declaracion de clase
