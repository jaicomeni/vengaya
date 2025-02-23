package prueba;

import java.io.IOException;
import java.util.Scanner;

public class Prueba {
	
	public static void main(String[] args) throws IOException {
		Scanner teclado = new Scanner(System.in);
	 System.out.println("introduce la nota: ");
	 String num = teclado.nextLine();
	 int nota = Integer.parseInt(num);
	 
	 /**
	  * @param a
	  * @author jaico
	  * @version 1.0
	  */
	 
	 if (nota >= 5 && nota <= 10) {
		 System.out.println("Ha aprobado");
	 }
	 
	 else if (nota < 0) {
		 System.out.println("Ha introducido un valor no valido");
	 }
	 
	 else if (nota > 10) {
		 System.out.println("Ha introducido un valor no valido");
	 }
	 
	 else {
		 System.out.println("Ha suspendido");
	 }
}
}
