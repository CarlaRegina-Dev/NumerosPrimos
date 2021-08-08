package D2;

import java.util.Scanner;

public class DesafioDoisMain {

	public static void main(String[] args) {		
		Scanner entrada = new Scanner (System.in);
		
			String valor = " ";
			while(DesafioDoisMain.numeroNatural(valor)<=0) {
				System.out.println("Digite um número natural: ");
				valor = entrada.next();			
			}
			
			 int numero = Integer.parseInt(valor);
			 
			 System.out.println("Resultado:");
			 
			 for(int i=numero;i>0;i--){
				 if(DesafioDoisMain.quadradoPerfeito(i) == true) {
					 System.out.println(i + " é Quadrado Pefeito");
				 }else if(DesafioDoisMain.numeroPrimo(i) == true){
						   System.out.println(i + " é número primo");				 
				 } 		 
			 }	 
	} 	
	private static boolean numeroPrimo (int numero){
		 boolean ePrimo = true;
	   for(int i=2;i<numero;i++) {			
			if (numero%i==0 && i!=numero){
				return ePrimo = false;
			}
	   } return ePrimo;
	}			
    private static boolean quadradoPerfeito (int numero){
    	 boolean eQuadradoPerfeito = false;
       for (int i=1;i<=numero;i++) {
   	    	 if ( Math.sqrt(i) - ((int) Math.sqrt(i))>0){
   	    		 eQuadradoPerfeito = false;
   	  	     }else {
   	  	    	 eQuadradoPerfeito = true;
   	  	     }    	   
       } return eQuadradoPerfeito;  
    } 
    private static int numeroNatural(String entrada) {
        for (char caractere : entrada.toCharArray()) {
            if (!Character.isDigit(caractere)) return 0;
        }
        return Integer.parseInt(entrada);
    }   
}
