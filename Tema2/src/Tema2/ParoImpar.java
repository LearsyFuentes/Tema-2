package Tema2;

import java.util.Scanner;

public class ParoImpar 
{

	public static void main(String[] args) 
	{
		double a; //Declaro las variables que voy a necesitar		
		Scanner escaner = new Scanner(System.in);
		System.out.println("Introduce un numero: ");//Muestro por pantalla que introduzca un numero
		a = escaner.nextDouble(); //Guardo el numero en "a"
		
		if (a % 2 == 0)
		{
			System.out.println("El numero " +  a + "es par");
							
		}
		
		else
		{
			System.out.println("El numero  " + a + " es impar");
		}	
				
		escaner.close(); //Cierro escaner despues de su uso,

	}

}
