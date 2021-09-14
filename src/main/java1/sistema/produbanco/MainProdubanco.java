package sistema.produbanco;

import java.util.Scanner;

public class MainProdubanco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		Scanner teclado2 = new Scanner(System.in);
		int clave;
		String datos;
		String contraseña = "85AB";
		String salir = "0";
			System.out.println("Ingrese su clave: ");
			datos = teclado.nextLine();
			boolean resultado = contraseña.equals(datos);
			boolean resultado2 = salir.contains(datos);
		do {

			if (resultado == true) {
				System.out.println("#########################");
				System.out.println("****BANCO PRODUBANCO****");
				System.out.println("Elija una opcion: ");
				System.out.println("1. Realizar Transferencia");
				System.out.println("2. Consultar Transacciones");
				System.out.println("3. SALIR");
				System.out.println("#########################");
			} else if (resultado == false) {
				System.out.println("Su contraseña no es correcta");
				System.out.println("Ingrese su clave: ");
				datos = teclado.nextLine();
			} else if (resultado2 == true) {
				
			}
		} while (resultado2 == true);
		System.out.println("Gracias por preferirnos");
	}
}