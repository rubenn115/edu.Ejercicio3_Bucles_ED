/***
 * Ruben Bernal Ramos
 * CSI1
 */

package servicios;

import java.util.Scanner;

/***
 * Implementación de la interfaz Aleatorio
 * rbr - 231123
 */
public class AleatorioImplementacion implements AleatorioInterfaz {

	/***
	 * Método que creará un número aleatorio e irá solicitando al usuario que vaya introduciendo
	 * números para intentar adivinar dicho número
	 * rbr - 231123 
	 */
	public void procedimiento() {
		
		double numAleatorio;
		int numFinal, numIntentos = 10, intento;
		Scanner sc = new Scanner(System.in);
		numAleatorio = Math.random() * 100;
		numFinal = (int)numAleatorio;
		
		do {
			System.out.println("Introduce el número que creas que se ha generado: ");
			intento = sc.nextInt();
			if(intento!=numFinal) {
				System.out.println("Ese no es el número");
				if(intento<numFinal) {
					System.out.println("El número que tienes que adivinar es mayor");
				}else {
					System.out.println("El número que tienes que adivinar es menor");
				}
				numIntentos -= 1;
				System.out.println("Te quedan " + numIntentos + " intentos");
				if(numIntentos==0) {
					System.out.println("Se te han acabdo todos los intentos");
					System.out.println("El número generado era " + numFinal);
					break;
				}
			}else {
				System.out.println("PERFECTO. Has adivinado el número");
			}
		}while (numFinal!=intento);
	}

}
