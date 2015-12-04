import java.util.Scanner;
class Coche
{
	private String marca;
	private String modelo;
	private String color;
	private float consumo;
	private float combustible;
	private float km;
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

	public void MOSTRAR_ATRIBUTOS()
	{
		System.out.println( "\tEl coche es un" + marca + " " + modelo + ", de color " + color + ".");
		System.out.println( "\tTiene un consumo de " + consumo + " cada 100km, " + km + " kilometros y " + combustible + " litros de combustible." );
	}
}
