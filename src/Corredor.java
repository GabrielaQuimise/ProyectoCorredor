import java.util.Scanner;
import java.util.Scanner;

public class Corredor {
	private int SumaEnergia;
	private int energia;
	
	public void VerificarEnergia() {
		Scanner ingresar = new Scanner(System.in);
		System.out.println("Ingrese el valor de energia: ");
		energia = ingresar.nextInt();
		
		if( energia >= 0 && energia <100) 
			System.out.println("El valor de energia se encuentra en el rango [0,100] ");
			if(energia > 100) 
				energia = 100;
				System.out.println("El valor de energia es: " + energia);
				if(energia < 0) {
					energia = 0;
					System.out.println("El valor de energia no es mayor o igual a 0, energia = " + energia);
				}
		}
	public void recargarEnergia(int sumaEnergia) {
		if(energia < 100) {
			sumaEnergia = energia + sumaEnergia;
			if(sumaEnergia > 100) {
				System.out.println("Se llegó al máximo de energia, energia = 100");
			}	
		}	
	}
	
	public void Correr() {
		if(energia > 10) {
			energia -=10;
			System.out.println("La energia total al correr es: " + energia);
		}else {
			System.out.println("Se llegó al mínimo de energia, energia = 0");
		}
		}
	
	public void entrenar() {
		if(energia < 100) {
			energia += 15;
		}else {
			System.out.println("Se ha llegado al límite de energía, energia = 100");
			}	
	}
	
	public void resultado()	{
		if(energia >100) {
			System.out.println("Se ha llegado al límite de energía, energia = 100");
		}else { 
			System.out.println("El total de energia es: " + energia);}
		}
	
	
	 
}
