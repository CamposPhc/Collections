package collections;

import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exerc1 {

	public static void main(String[] args) {

		List<String> lista = new ArrayList<String>();
		Scanner ler = new Scanner(System.in);
		
		for(int x=1; x<6; x++) {
			System.out.println("\nDigite a "+x+ " cor ");
			String cor =ler.nextLine();
			lista.add(cor);
			
			
		}
		System.out.println("\nCores adicionadas:");
		for(String cor:lista) {
			System.out.println(cor);
			
			
		}
		Collections.sort(lista);
		System.out.println("\nCores ordenadas");
		for(String cor:lista) {
			System.out.println(cor);
		}
	}

}
