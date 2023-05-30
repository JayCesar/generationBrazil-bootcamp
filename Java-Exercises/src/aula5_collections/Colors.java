package aula5_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Colors {
	// Link to exercise: https://docs.google.com/document/d/1u8PbJTYGHgWoJIkHF-sJJcD25RWvmVAX/edit
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> colorsList = new ArrayList<>();
		ArrayList<String> otherList = new ArrayList<>(); // It is just a test
		
		System.out.print("Quantas corers serão digitadas? ");
		int colorsAmount = sc.nextInt();
		sc.nextLine();
		
		System.out.println();
		
		for(int i = 0; i < colorsAmount; i++) {
			System.out.print("Digite uma cor: ");
			colorsList.add(sc.nextLine());
			System.out.println();
		}
		
		// Lista todas as cores
		System.out.println("\nListar todas as cores: ");
		colorsList.forEach(color -> System.out.println(color));
		
		// Ordenada a lista
		Collections.sort(colorsList);

		// Imprime ela ordenada
		System.out.println("\nOrdenar as cores: ");
		colorsList.forEach(color -> System.out.println(color));
		
		// Apenas um teste:
		colorsList.forEach(color -> otherList.add(color));
		System.out.println("\nOrdenar as cores - outra lista: ");
		otherList.forEach(color -> System.out.println(color));
		
		sc.close();

	}

}


