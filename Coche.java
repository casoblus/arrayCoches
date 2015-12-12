import java.util.Scanner;
class Coche
{
	/* Hasta ahora los atributos eran private. 
	 * Como quiero acceder a los atributos de todos los objetos creados en el array, 
	 * los tengo que hacer public o me dirá que no existen.
	 */
	public String marca;
	public String modelo;
	public String color;
	public float consumo;
	public float combustible;
	public float km;
	Scanner sc = new Scanner( System.in );

	// Constructor de clase. 
	// Inicializa los atributos del objeto.
	public void ALTA() 
	{
		// Solicita los valores al usuario 
		// y los asigna a sus atributos
		
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
	}

	//Muestra los atributos del objeto actual
	public void MOSTRAR_ATRIBUTOS()
	{
		System.out.println( "\tEl coche es un" + marca + " " + modelo + ", de color " + color + ".");
		System.out.println( "\tTiene un consumo de " + consumo + " cada 100km, " + km + " kilometros y " + combustible + " litros de combustible." );
	}
	
	// Muestra los atributos de todos los objetos coche contenidos en el array coche
	public void VER_TODOS( Coche[] coche, int n_coches )
	{
		// Recorro el array coche desde 0 hasta n_coches e imprimo sus atributos.
		for( int i = 0; i < n_coches; i++ )
		{
			System.out.println( "\tEl coche es un" + coche[i].marca + " " + coche[i].modelo + ", de color " + coche[i].color + ".");
			System.out.println( "\tTiene un consumo de " + coche[i].consumo + " cada 100km, " + coche[i].km + " kilometros y " + coche[i].combustible + " litros de combustible." );
		}
	}
}
