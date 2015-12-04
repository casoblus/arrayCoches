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
		int i;


		// Se crea un array "coche" de tamaño "tamano"
		Coche[] coche = new coche[ tamano ];

		do {

			i++;

			// Se crea un objeto coche
			Coche coche[i] = new Coche();

			// Se inicializan los atributos de coche[i]
			coche[i].ALTA();

			// Control para salir
			System.out.println( "Escriba \"fin\" para terminar." );
			control = entrada.nextLine();

		} while( i < tamano - 1  || !control.equals("fin") );
	}
}
