import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Corredor corredor = new Corredor();
		corredor.VerificarEnergia();
		corredor.Correr();
		corredor.entrenar();
		corredor.recargarEnergia(50);
		corredor.resultado();
		

	}

}
