package Tema2While;

//Importo la clase Scanner para obtener valores por telcado
import java.util.Scanner;

public class Ejercicio1 
{

	public static void main(String[] args) 
	{
		//Declaro las variables que voy a usar
		int num;
		int suma = 0;
		Scanner escaner = new Scanner(System.in);
	
		//Pido un numero entero positivo al usuario
		System.out.print("Introduce un número entero positivo ");
		
		// Guardo ese numero en num
		num = escaner.nextInt();
	
		
		while (num >= 0)
		{
			suma = suma + num;
			System.out.print("Introduce un número entero positivo ");
			num = escaner.nextInt();
			
			/*if (num <= 0)
			{
				System.out.println("Ese número es negativo");
			*/}
		}
		
		// Cierro escaner
			escaner.close();
			
			System.out.print("El resultado de la suma es: " + suma);
	}


