import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);  
		int numeroUno = 0, numeroDos = 0;
		int mcd = 0;
		
		System.out.println("Ingrese el primero número");
		numeroUno = teclado.nextInt();
		
		System.out.println("Ingrese el segundo número");
		numeroDos = teclado.nextInt();
		
		mcd = Mcd(numeroUno,numeroDos);
		System.out.println("El máximo común divisor es: "+mcd);
	} 
	
	static int Mcd(int a, int b) {
		int arregloA[] = new int[a];
		int arregloB[] = new int[b];
		int contadorA = 0, contadorB = 0;
		boolean flag = false;
		
		for (int i = 1; i <= a; i++) {
			if(a%i==0) {
				arregloA[contadorA] = i; 
				contadorA++;
				
			} 	
		} 
		for (int i = 1; i <= b; i++) {
			if(b%i==0) {
				arregloB[contadorB] = i; 
				contadorB++;
			}
		}
		
		if(contadorA<contadorB) {
			
			while(flag == false) { 
				for (int i = contadorA-1; i >= 0; i--) { 
					for (int j = contadorB-1; j >= 0; j--) { 
						if(arregloA[i] == arregloB[j] && arregloA[i]!=0) {
							return arregloA[i];
						}
					}
				} 
			}
			
		}else {
			while(flag == false) { 
				for (int i = contadorB-1; i >= 0; i--) { 
					for (int j = contadorA-1; j >= 0; j--) { 
						if(arregloB[i] == arregloA[j] && arregloB[i]!=0) {
							return arregloB[i];
						}
					}
				} 
			}
		}
		
		return 0;
	}
	

}
