class mainCoches
{
	public static void main(String[] args)
	{
		int tamano = 10;
		Coche[] coche = new coche[ tamano ];

		for( i = 0; i < tamano; i++ )
		{
			// Se crea un objeto coche
			Coche coche[i] = new Coche();

			// Se inicializan los atributos de coche[i]
			coche[i].ALTA();
		}
	}
}
