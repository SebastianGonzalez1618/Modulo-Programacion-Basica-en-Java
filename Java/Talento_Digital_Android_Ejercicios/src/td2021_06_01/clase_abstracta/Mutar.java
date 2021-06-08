package td2021_06_01.clase_abstracta;

public class Mutar {

	public static void main(String[] args)
	{
		Persona persona = new MalaPersona("Mala Persona", 2019);
		persona.actuar();
		System.out.println("\n- " + persona.getNombre()
							+ " ha mutado y se ha puesto buena persona. - \n");
		persona = new BuenaPersona("Buena persona", 2020);
		persona.actuar();
	}
	
}
