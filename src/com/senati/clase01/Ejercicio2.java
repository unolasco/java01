package com.senati.clase01;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/*
		
		 Realizar un ejercicio que intercambie el valor de dos variables,
		 es decir crearemos e inicializaremos la variable x igual 5 y la
		 variable y a 2. Cuando finalice el programa y deberá contener 5 y x contendrá 2.

*/
	
//	•	Valores para x,y,aux
		
		byte aux=0;
		byte x =5;
		byte y =2;	
		
		System.out.println("Valor x = " + x);
		System.out.println("Valor y = " + y);
		
		aux=x;
		x=y;
		y=aux;
		
		System.out.println("Nuevo Valor x = " + x);
		System.out.println("Nuevo Valor y = " + y);		
	
}
}
