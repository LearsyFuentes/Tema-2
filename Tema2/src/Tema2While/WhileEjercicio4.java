package Tema2While;

//Importo la clase Scanner para guardar el valor que introduzca por teclado.
import java.util.Scanner;

public class WhileEjercicio4 
{

	public static void main(String[] args) 
	{
		
			//Declaro las variables que voy a usar e inicializo a "0" tres de ellas
			Scanner scanner = new Scanner(System.in);

	        int sumaPositivos = 0;
	        int sumaNegativos = 0;
	        int contadorNegativos = 0;
	        int contadorCeros = 0;
	        int numero = 0;	
				
			// Pedir 10 números al usuario
	        for (int i = 1; i <= 10; i++) 
	        {
		    System.out.println("Introduce el número " + i + ":");
		    int numero1 = scanner.nextInt();
	        }
	        
		    
			// Clasificar el número
		    if (numero > 0)
		    {
		    sumaPositivos += numero; // Sumar positivos
		    } 
		    else if (numero < 0) 
		    	{
		           sumaNegativos += numero; // Sumar negativos
		           contadorNegativos++;     // Contar negativos
		        } 
		    else 
		    	{
		           contadorCeros++;         // Contar ceros
		    	}
				
		           
		           
		    // Calcular la media de los números negativos
		    double mediaNegativos = (contadorNegativos > 0) ? (double) sumaNegativos / contadorNegativos : 0;
		    
		 // Mostrar resultados
		    
	        System.out.println("Suma de los números positivos: " + sumaPositivos);
	        
	        System.out.println("Media de los números negativos: " + mediaNegativos);
		       
	        System.out.println("Cantidad de ceros introducidos: " + contadorCeros);
				
		   //Cierro el escaner
		   scanner.close();
	}

}
