import java.util.Scanner;

public class EdadLaboral {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//pedir un n�mero y guardarlo en variable
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Cu�ntos a�os tienes?");
		int edad = scan.nextInt();
		
		//comprobar si est� entre 16 y 65
		
		if (edad >= 16 && edad <= 65 ) {
			System.out.println("Dentro");
		} 
		
		//comprobar si est� fuera de 18 y 65
		/*if (edad <16 || edad >65 ) {
			System.out.println("No edad de trabajar");
		}*/
		
		if (edad <16 ) {
			System.out.println("No edad de trabajar por menor");
		}
		
		if (edad >65 ) {
			System.out.println("No edad de trabajar por jubilado");
		}
		
	}

}
