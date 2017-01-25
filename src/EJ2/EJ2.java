
package EJ2;

import java.util.Scanner;

public class EJ2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float radio=0.0f;
		float longitud=0.0f;
		float area=0.0f;
		
		radio=pedirteclado("Introduce el tamaño del radio de la circunferencia");
		longitud=longitud(radio);
		area=area(radio);
		
		System.out.println("La longitud es : " + longitud);
		System.out.println("El area es : " + area);
		
		

	}
	

	public static float pedirteclado (String cadena){
		Scanner teclado = new Scanner(System.in);
		String aux;
		boolean escorrecto = false;
		float a=0.0f;
		
		do{
			System.out.println(cadena);
			aux=teclado.nextLine();
			try{
				a=Float.parseFloat(aux);
				escorrecto=true;
			}catch(Exception e){
				escorrecto=false;
			}
		}while(!escorrecto);
		 return a;
	
	}


	public static float longitud (float a){
	float longitud=2*(float)Math.PI*a;
		return longitud;
		
	}



	public static float area (float a){
		float area=(float)Math.PI*(float)Math.pow(a, 2);
		return area;
	}

}

