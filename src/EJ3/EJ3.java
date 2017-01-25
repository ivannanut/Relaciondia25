package EJ3;

import java.util.Scanner;

public class EJ3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float km=0.0f;
		float metros=0.0f;
		
		km=pedirteclado("Introduce la cantidad de km|h :");
		metros=pasarametros(km);
		System.out.println("La cantida de m|s es : " + metros);
	}
	
	
	public static float pedirteclado (String cadena){
		Scanner teclado = new Scanner ( System.in);
		String aux;
		boolean escorrecto=false;
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


	public static float pasarametros (float a){
	float metros=a/3.6f;
	return metros;
	}
}