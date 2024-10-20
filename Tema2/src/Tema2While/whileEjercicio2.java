package Tema2While;

//Importo la clase Scanner para guardar el valor que introduzca por teclado.
import java.util.Scanner;


public class whileEjercicio2 {

	public static void main(String[] args) 
		{
			//Declaro las variables que voy a usar
			Scanner escaner = new Scanner(System.in);
			int i = 0;
			int num;
			
			//Pido un numero entero positivo al usuario
			System.out.print("Introduce un número entero positivo: ");
			
			// Guardo ese numero en num
			num = escaner.nextInt();
			
			while (num >= 0)
			{
				i++;
				System.out.print("Introduce un número entero positivo ");
				num = escaner.nextInt();
			}
			// Cierro escaner
			escaner.close();
			
			//Mostrar la cantidad de números positivos introducidos.
			System.out.print("La cantidad de números positivos introducidos ha sido: " + i);
		}

}
