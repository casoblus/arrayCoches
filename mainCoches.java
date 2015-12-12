import java.util.Scanner;
class mainCoches
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner( System.in );
		// Pide el numero de coches a crear
		System.out.println( "Introduce el numero de coches que quieres crear." );
		int tamano = input.nextInt();

		String control; // Guarda la opcion elegida por el usuario
		
		// recojo la basura del buffer. 
		// La proxima vez se sobreescribirá la variable
		// de modo que no hago otra.
		control = input.nextLine();

		int i = -1;
		int n_coches = 0; // Contador de coches
		

		// Se crea un array "coche" de tamaño "tamano"
		Coche[] coche = new Coche[ tamano ];

		do {
			// Muestra el menu de opciones disponibles

			System.out.println( "" ); // linea en blanco
			System.out.println( "\t----- MENURE -----" );
			System.out.println( "\t\t[a] Dar de alta nuevo Coche. " );
			System.out.println( "\t\t[s] Mostrar datos de un Coche." );
			System.out.println( "\t\t[t] Mostrar los datos de todos los vehículos dados de alta." );
			System.out.println( "\t\t[n] Ver el numero de coches." );
			System.out.println( "\t\t[q] Salir." );
			System.out.println( "\t----- ---- -----" );
			System.out.println( "" ); // linea en blanco

			System.out.println( "Elije un opcion >>>" ); 
			control = input.nextLine();
			
			switch( control ) 
			{
				case "a":
					i++;
					if ( i < tamano )
					{
						// Se crea un objeto coche
						coche[i] = new Coche();

						// Se inicializan los atributos de coche[i]
						coche[i].ALTA();
						n_coches++; // */

						// n_coches += coche[i].ALTA(); // Coche[i].ALTA() retorna 1 si se ejecuta correctamente.
					} else {
						System.out.println( "\tARRAY LLENO!" );
					}
					break;
				case "s":
					// De que coche?
					System.out.println( "De que coche quieres ver los datos?" );
					int id = input.nextInt();
					// Limpio el buffer
					control = input.nextLine();
					if( id >= 0 && id < n_coches )
					{
						coche[id].MOSTRAR_ATRIBUTOS();	
					} else {
						System.out.println( "El valor "+id+" no existe en la coleccion." );
					}
					break;
				case "t":
					// Datos de todos los coches
					// Comprueba que existe al menos un coche
					if(n_coches > 0)
					{
					// ejecutamos el metodo VER_TODOS() de cualquier objeto coche del array
					// Le pasamos el array de coches y cuantos coches hay 
						coche[n_coches-1].VER_TODOS( coche, n_coches);
					} else {
						System.out.println("No hay coches que mostrar.");
					}
					break;
				case "n":
					break;
				case "q":
					break;
				case "cow": //  La vaca XD 
					System.out.println( "          (__)" );
					System.out.println( "          |OO|" );
					System.out.println( " /--------\\_/" );
					System.out.println( "/ \\       /     MOOOOOOOOOOO!!" );
					System.out.println( "   |W-----|" );
					System.out.println( "   |      | " );
					System.out.println( "#################################" );
					break;
				default:
					System.out.println( "OPCION INCORRECTA!" );
					break;
			}
		} while( !control.equals("q") );
	}
}
