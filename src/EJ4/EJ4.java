package EJ4;

import java.util.Scanner;

public class EJ4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         float catetoM=0.0f;
         float catetom=0.0f;
         float hipotenusa=0.0f;
         
         catetoM=pedirteclado("Introduce el tamaño del cateto mayor");
         catetom=pedirteclado("Introduce el tamaño del cateto menor");
         hipotenusa=pitagoras(catetoM,catetom);
         System.out.println(hipotenusa);
	}
    public static float pedirteclado (String cadena){
    	Scanner teclado = new Scanner (System.in);
    	String aux;
    	boolean escorrecto=false;
    	float a=0.0f;
    	
    	do{
    		System.out.println(cadena);
    		aux=teclado.nextLine();
    		try{
    			a=Float.parseFloat(aux);
    			escorrecto=true;
    		}
    		catch(Exception e){
    			escorrecto=false;
    			
    		}
    	}while(!escorrecto);
    	return a;
    	
    }
	
	public static float pitagoras (float a , float b){
		float hipotenusa=0.0f;
		hipotenusa=(float)Math.sqrt(Math.pow(a, 2)+Math.pow(b, 2));
		return hipotenusa;
	}
		 
		
	}
