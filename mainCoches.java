class mainCoches
{
	public static void main(String[] args)
	{
		int tamano = 10;
		String control;
		int i = -1;

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
