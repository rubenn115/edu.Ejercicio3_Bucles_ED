/***
 * Ruben Bernal Ramos
 * CSI1
 */

package controladores;

import servicios.AleatorioInterfaz;
import servicios.AleatorioImplementacion;

/***
 * Clase principal de la aplicación
 * rbr - 231123
 */
public class Principal {
	
	/***
	 * Método principal de la aplicación
	 * rbr - 231123
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Instancio la interfaz con su implementación
		AleatorioInterfaz ai = new AleatorioImplementacion();
		
		//Llamo al método que tiene el procedimiento de la aplicación
		ai.procedimiento();

	}

}
