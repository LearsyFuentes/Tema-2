package Tema2;
import java.util.Scanner;
public class CasiCero 
{

	public static void main(String[] args)
	{
		Scanner escaner = new Scanner(System.in);
		double a;
		
		System.out.println("Introduce un número decimal: ");
		
		a = escaner.nextDouble();
		
		if (a < 1 && a > -1 && a !=0 )
		{
			System.out.println(a + " Es un número casi-cero");
		}
		else
		{
			System.out.println(a + "  No es un número casi-cero");
		}
	
		escaner.close();
	}

}
