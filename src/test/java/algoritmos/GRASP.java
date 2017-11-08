package algoritmos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GRASP {

	public static void main(String[] args) {

		// int[] cadastroPositivo = {2, 3, 4, 2, 2, 1};
		// int[] cadastroNegativo = {4, 2, 2, 1};
		// int[] compras = {16, 7, 4, 2, 6 };
		List<Integer> cPositivos = new ArrayList(); //CRIACAO DAS LISTAS
		List<Integer> cNegativos = new ArrayList();
		List<Integer> compras = new ArrayList();

		List<List<Integer>> solucao1 = new ArrayList<List<Integer>>();	//CRIACAO DAS LISTAS PARA SEGUNDA PARTE
		List<List<Integer>> solucao2 = new ArrayList<List<Integer>>();	//DO ALGORITMO
		List<List<Integer>> solucao3 = new ArrayList<List<Integer>>();
		List<Integer> temps = new ArrayList<Integer>();

		cPositivos.add(2);
		cPositivos.add(3);
		cPositivos.add(4);
		cPositivos.add(2);
		cPositivos.add(2);
		cPositivos.add(1);

		cNegativos.add(2);
		cNegativos.add(4);
		cNegativos.add(2);
		cNegativos.add(2);
		cNegativos.add(1);

		compras.add(16);
		compras.add(7);
		compras.add(4);
		compras.add(2);
		compras.add(6);
		
		
		//embaralhando array e adicionando
//		for (int n : cPositivos) {
//			Collections.shuffle(cPositivos);
//			solucao1.add(new ArrayList<Integer>(cPositivos));
//			Collections.shuffle(cPositivos);
//			solucao2.add(cPositivos);
//		}

//		 for (int n : cNegativos) {
//		 Collections.shuffle(cNegativos);
//		 cNegativos = new ArrayList<Integer>(cNegativos);
//		 solucao2.add(cNegativos);
//		 }
		//
		 for (int n : compras) {
		 Collections.shuffle(compras);
		 compras = new ArrayList<Integer>(compras);
		 solucao3.add(compras);
		 }

//		System.out.println(solucao1);
//		 System.out.println(solucao2);
		 System.out.println(solucao3);

		for (int i = 0; i < solucao3.size(); i++) {
			for (int j = 0; j < solucao3.size(); j++) {
				for (int k = 0; k < compras.size(); k++) {
					
					int temp = 0;
					
					int a = solucao3.get(i).get(k);
					int b = solucao3.get(j).get(k);
					
					if (a == b) {
						System.out.println(a + " igual a " + b);
						temp = a;
						temps.add(temp);
					} else	if (a > b) {
						System.out.println(a + " maior que " + b);
						temp = a;
						temps.add(temp);
					} else {
						System.out.println(b + " maior que " + a);
						temp = b;
						temps.add(temp);
					}
				}
				Collections.reverse(temps);  //:?????
				System.out.println(temps);
				temps.removeAll(temps);
			}
		}
	}

	public static void ordena(List a) {
		System.out.println("antes: " + a.toString());
		List<Integer> b = null;

		for (int i = 0; i < a.size(); i++) {
			Collections.shuffle(a);
			b = a;

			System.out.println("depois: " + b.toString());
		}
		ArrayList<Integer> solucao = null;
		solucao.addAll(b);
	}

}
