package Tema2While;

//Importo la clase Scanner para guardar el valor que introduzca por teclado.
import java.util.Scanner;

public class WhileEjercicio4 
{

	public static void main(String[] args) 
	{
		
		//Declaro las variables que voy a usar e inicializo a "0" tres de ellas
				Scanner escaner = new Scanner(System.in);
				int num;
				int suma = 0;
				int i = 0;
				int num0 = 0;
				double media = 0.0;
				
				
				//Pido un numero entero positivo al usuario
				System.out.print("Introduce un número entero, positivo o negativo o 0: ");
				
				// Guardo ese numero en num
				num = escaner.nextInt();
				
				while (i!= 10)
				{
					i++;
					
					//Pido un numero entero positivo al usuario
					System.out.print("Introduce un número entero, positivo o negativo o 0: ");
					
					// Guardo ese numero en num
					num = escaner.nextInt();
					
					switch (num)
					{
					
						case (num> 0):
						{
							
							suma += num;
							System.out.print("La suma de los númerros positivos es: " + suma);
							break;
						}
					
					case (num == 0):
					{
						num0 ++;
						System.out.print("Número de 0 que ha introducido: " + num0);
						break;
					}
					
					case (num<0):
					{	
						media = (double) suma / i;
						System.out.print("La media de los números negativos es: " + media);
						break;
					}
					
				  }
					
			}
				
				
				
				
				//Ciero el escaner
				escaner.close();
	}

}
