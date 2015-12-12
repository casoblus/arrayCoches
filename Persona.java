import java.util.Scanner;
class Persona 
{
	public String
		nome, 
	       	apelidos, 
		dni;
	
	public void ALTA() 
	{
		Scanner input = new Scanner( System.in );

		System.out.println( "Nome da persoa humana ou non:" );
			nome = input.nextLine();

		System.out.println( "Apelidos da persoa ou entidade: " );
			apelidos = input.nextLine();

		System.out.println( "DNI da persoa ou entidade: " );
			dni = input.nextLine();
	}

	public VER_DATOS() 
	{
		System.out.println( "NOME: " + nome );
		System.out.println( "APELIDOS: " +apelidos );
		System.out.println( "DNI: " +dni );
	}
}
