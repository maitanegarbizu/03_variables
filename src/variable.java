
public class variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Declaraci�n de la variable -a-
		 -a- Es un identificador de usuario
		*/
		
		byte a = 127;       //Variable entera de 8 bits
		short b = 32767;	//Entero corto, 16 bits
		int c = -2000000000;	//Entero de 32 bits;
		long d = 16;		//Entero de 64 bits
		
		float e = 3.15f;		//Variable de coma flotante de 32 bits
		double f = 3.1416;	//Variable de coma flotante de 64 bits
		
		boolean g = true;	//Variable booleana true o false
		char h = '\n';		//Variable de 16 bits
		String i ="Este es un ejemplo de cadena";  //Variable de cadena
		
		System.out.println("suma de a + b:" + (a+b));
		
		System.out.println("resta de a - b:" + (a-b));
		
		System.out.println("multiplicar  a * b:" + a*b);
		
		System.out.println("dividir  a / b:" + (double)a/b);
		
		System.out.println("Resto de la divi�n entera: a % b" + a % b);
		
	}

}
