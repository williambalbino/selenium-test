package algoritmos;

import java.util.ArrayList;
import java.util.List;

public class Teste {

	
	public static void main(String[] args) {
		
		List<List<Integer>> outer = new ArrayList<List<Integer>>();
		List<Integer> inner1 = new ArrayList<Integer>();
		List<Integer> inner2 = new ArrayList<Integer>();

		
		inner1.add(100);
		inner1.add(200);

		inner2.add(100);
		inner2.add(200);

		outer.add(inner1);
		outer.add(inner2);

		outer.get(0).add(300);

		System.out.println(outer);
		
	}
}
