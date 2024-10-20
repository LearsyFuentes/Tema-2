package Tema2While;

//Importo la clase Scanner para guardar el valor que introduzca por teclado.
import java.util.Scanner;

public class WhileEjercicio3 {

	public static void main(String[] args) {
		
		//Declaro las variables que voy a usar e inicializo a "0" tres de ellas
		Scanner escaner = new Scanner(System.in);
		int suma = 0;
		int num;
		double media = 0.0;
		int i = 0;
		
		//Pido un numero entero positivo al usuario
		System.out.print("Introduce un número entero positivo: ");
		
		// Guardo ese numero en num
		num = escaner.nextInt();
		
		//Mientras el numero introducido sea positivo lo guarda y va sumando al contador.
		while (num >= 0)
		{
			suma += num;
			i++;
			System.out.print("Introduce un número entero positivo: ");
			num = escaner.nextInt();
			
		}
		
		media = (double) suma / i;
		
		//Muestro la media de los números enteros positivos introducidos
		System.out.println("La media de los números ingresados es: " + media);
		
		// Cierro escaner
		escaner.close();

	}

}
