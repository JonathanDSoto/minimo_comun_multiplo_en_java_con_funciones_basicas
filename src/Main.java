import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);  
		int numeroUno = 0, numeroDos = 0;
		int mcm = 0;
		
		System.out.println("Ingrese el primero n�mero");
		numeroUno = teclado.nextInt();
		
		System.out.println("Ingrese el segundo n�mero");
		numeroDos = teclado.nextInt();
		
		mcm = Mcm(numeroUno,numeroDos);
		System.out.println("El m�nimo com�n m�ltiplo es: "+mcm);
	} 
	
	static int Mcm(int a, int b) {
		boolean flag = false;
		int multiploA = 0, multiploB = 0;
		
		for (int i = 1; i <= 10; i++) {
			multiploA = a*i;
			for (int j = 1; j <= 10; j++) {
				multiploB = b*j;
				if(multiploA==multiploB) {
					return multiploB;
				}
			}
		}
		
		return 0;
	}
	

}