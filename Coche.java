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
	public void ALTA( String _marca,
			  String _modelo,
			  String _color,
			  float _consumo,
			  float _combustible,
			  float _km ) 
	{
		// asigna los valores recibidos
		// a sus atributos
		
			marca = _marca;
			modelo = _modelo;
			color = _color;
			consumo = _consumo;
			combustible = _combustible; 
			km = _km;
	}

	public void MOSTRAR_ATRIBUTOS()
	{
		System.out.println( "\tEl coche es un" + marca + " " + modelo + ", de color " + color + ".");
		System.out.println( "\tTiene un consumo de " + consumo + " cada 100km, " + km + " kilometros y " + combustible + " litros de combustible." );
	}
}
