import java.util.Scanner;
class mainCoches
{
	Scanner input = new Scanner( System.in );
	public static void main(String[] args)
	{
		// Pide el numero de coches a crear
		System.out.pirntln( "Introduce el numero de coches que quieres crear." );
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
			Coche coche[i] = new Coche();
				
			System.out.println( "Marca: " );	
				marca = sc.nextLine();
			
			System.out.println( "Modelo: " );	
				modelo = sc.nextLine();
			
			System.out.println( "Color: " );	
				color = sc.nextLine();
			
			System.out.println( "Consumo: " );	
				consumo = sc.nextFloat();
			
			System.out.println( "Combustible: " );	
				combustible = sc.nextFloat();
			
			System.out.println( "km: " );
				km = sc.nextFloat();
			// Se inicializan los atributos de coche[i]
			// En esta variante, los datos se le envían al método ALTA.
			coche[i].ALTA( marca, modelo, color, consumo, combustible, km );

			// Control para salir
			System.out.println( "Escriba \"fin\" para terminar." );
			control = entrada.nextLine();

		} while( i < tamano - 1  || !control.equals("fin") );
	}
}
