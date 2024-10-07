package Tema2;
import java.util.Scanner;
public class Ordenados 
{

	public static void main(String[] args) 
	{
		Scanner escaner = new Scanner(System.in);
		
		System.out.println("Introduce un número: ");
		int a = escaner.nextInt();
		
		System.out.println("Introduce otro número");
		int b = escaner.nextInt();
		
		if (a > b)
		{
			System.out.println(a + " es mayor que "+ b);
		}
		
		else
		{
			System.out.println(b + " es mayor que " + a);
		}
		
		escaner.close();

	}

}
