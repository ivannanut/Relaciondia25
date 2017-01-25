package Ej1;

import java.util.Scanner;

public class EJ1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float gradosc; //celsius
		float gradosf; //farhenheit
		
		
		gradosc=pedirteclado("Introduce la cantidad de grados centigrados");
		gradosf=pasargrados(gradosc);
	    System.out.println("Cantidad de grados farhenheit : "+ gradosf);
	}
	
	public static float pedirteclado(String cadena){
		Scanner teclado = new Scanner (System.in);
		String aux;
		float a=0.0f;
		boolean escorrecto =false;
		do{
			System.out.println(cadena);	
			aux = teclado.nextLine();
			try{
				a=Float.parseFloat(aux);
				escorrecto=true;
						
			}catch(Exception e){
				escorrecto=false;
				
			}
				
		}while(!escorrecto);
	
		return a;
	}
	public static float pasargrados (float a){
	 
	    float grados = 32 +(9*a/5);
		return grados;
		
	}
	

}
