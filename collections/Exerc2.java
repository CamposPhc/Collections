package collections;

import java.util.Iterator;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exerc2 {

	public static void main(String[] args) {

		Set<Integer> lista = new HashSet<Integer>();
		Scanner ler = new Scanner(System.in);
		
		for (int x=1; x<11; x++) {
			System.out.println("\nDigite o "+x+ " numero:");
			int num = ler.nextInt();
			lista.add(num);
			
		}
		
		System.out.println("\nNumeros adicionados:");
		for(int x:lista) {
			System.out.println(x);
		}
		
		Iterator<Integer> iLista = lista.iterator();
		while(iLista.hasNext());
		System.out.println(iLista.next());
		
		
	}

}
