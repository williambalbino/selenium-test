package algoritmos;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import test.CadastroTestPositivo;

public class HillClimbing {

	
	
	public static void main(String[] args) {
		
		int[] cadastroPositivo = {2, 3, 4, 2, 2, 1};
		int[] cadastroNegativo = {2, 4, 2, 2, 1};
		int[] compras = {16, 7, 4, 2, 6 };
		
		ordenar(cadastroPositivo);
		ordenar(cadastroNegativo);
		ordenar(compras);
		
//		shuffleArray(cadastroPositivo);
//		System.out.println("Embaralhado");
//	    for(int n: cadastroPositivo){
//	    	System.out.println(n + " ");
//	    }
	    
	  
		
	}
	
	public static void ordenar(int[] vet){
		
		System.out.println("Array sem ordenacao:");
		 
		for (int n : vet) {
			System.out.print(n + " ");
		}
		System.out.println();
		
		for (int i = 1; i < vet.length; i++) {
		    for (int j = 0; j < i; j++) {
		        if (vet[i] > vet[j]) {
		            int temp = vet[i];
		            vet[i] = vet[j];
		            vet[j] = temp;
		            
		        }
		    }
		}
		
		
	
		
		System.out.println("Array em ordem decrescente:");
		 
		for (int n : vet) {
			System.out.print(n + " ");
		}
		System.out.println();
	
				
	}		
	
	

//	public static void shuffleArray(int[] ar){
//	    // If running on Java 6 or older, use `new Random()` on RHS here
//	    Random rnd = ThreadLocalRandom.current();
//	    for (int i = ar.length - 1; i > 0; i--){
//	      int index = rnd.nextInt(i + 1);
//	      // Simple swap
//	      int a = ar[index];
//	      ar[index] = ar[i];
//	      ar[i] = a;
//	      
//	    }
//	  }

}


