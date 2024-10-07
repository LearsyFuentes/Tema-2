package Tema2;

import java.util.Scanner;//Importo la clase Scanner para capturar por teclado

public class NumerosEnteros
{

	public static void main(String[] args) 
	{
		//Declaro las variables que voy a utilizar
		Scanner escaner = new Scanner(System.in);
		int a;
		int b;
		
		System.out.println("Introduce un numero: ");
		a = escaner.nextInt();
		
		System.out.println("Introduce otro numero: ");
		b = escaner.nextInt();
		
		if (a == b)
		{
			System.out.println("Los dos números son iguales");
								
		}
		
		else
		{
			System.out.println("Los dos numeros son distintos");
			
		}
		
		escaner.close(); //Cierrro escaner
	}

}
