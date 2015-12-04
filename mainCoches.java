import java.util.Scanner;
class mainCoches
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner( System.in );
		// Pide el numero de coches a crear
		System.out.println( "Introduce el numero de coches que quieres crear." );
		int tamano = input.nextInt();

		String control;
		int i = -1;

		// Atributos que se van a enviar al objeto
		String marca;
		String modelo;
		String color;
		float consumo;
		float combustible;
		float km;
		////////////////////////////////////////

		// Se crea un array "coche" de tamaño "tamano"
		Coche[] coche = new Coche[ tamano ];

		do {

			i++;

			// Se crea un objeto coche
			coche[i] = new Coche();
				
			System.out.println( "Marca: " );	
				marca = input.nextLine();
			
			System.out.println( "Modelo: " );	
				modelo = input.nextLine();
			
			System.out.println( "Color: " );	
				color = input.nextLine();
			
			System.out.println( "Consumo: " );	
				consumo = input.nextFloat();
			
			System.out.println( "Combustible: " );	
				combustible = input.nextFloat();
			
			System.out.println( "km: " );
				km = input.nextFloat();
			// Se inicializan los atributos de coche[i]
			// En esta variante, los datos se le envían al método ALTA.
			coche[i].ALTA( marca, modelo, color, consumo, combustible, km );

			// Control para salir
			System.out.println( "Escriba \"fin\" para terminar." );
			control = input.nextLine();

		} while( i < tamano - 1  || !control.equals("fin") );
	}
}
