package Tema2Switch;

import java.util.Scanner;  //Importo la clase Scanner para capturar por teclado

public class NotaEntera 
{

	public static void main(String[] args) 
	{
		Scanner escaner = new Scanner(System.in);
		int a;
		
		System.out.print("Introduce una nota entera de 0 a 10: ");
		a = escaner.nextInt();
		
		switch (a)
		{
		case 0,1,2,3,4:
			System.out.println("insuficiente");
			break;
		case 5:
			System.out.println("Suficiente");
			break;
		case 6:
			System.out.println("Bien");
			break;
		case 7,8:
			System.out.println("Notable");
			break;
		case 9,10:
			System.out.println("Sobresaliente");
			break;
		default:
			System.out.print("Error, por favor introduzca un valor de 0 a 10");
		}
		escaner.close();
	}

}
