import java.util.Scanner;

public class ParImpar {

	/*
	 *el programa pedir� al usuario un n�mero
	 *como resultado dir� si el n�mero es par o impar 
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner lector = new Scanner(System.in);
		
		System.out.println("Introduce un numero");
		int a = lector.nextInt();
		
		if (a%2 == 0 ) {
			System.out.println("Par");
		} else{

			System.out.println("Impar");
			
			}
		
		/*if (!(a%2 == 0 )) {
			System.out.println("Par");
		} else{

			System.out.println("Impar");
			
			}*/
	}

}
