package org.generation.italy;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int risposta;
		String scelta;
		Auto auto;
		
		Auto a1 = new Auto();
		Auto a2 = new Auto();
		
		a1.velocità = 0;
		a1.kmPercorsi = 0;
		a1.carburante = 30f;
		a1.consumoMedio = 20;
		
		a2.velocità = 0;
		a2.kmPercorsi = 0;
		a2.carburante = 50f;
		a2.consumoMedio = 23;
		
		System.out.println("Benvenuto.");
		auto = a1;
		do
		{
			System.out.println("\nQuale auto vuoi guidare? (1 o 2)");
			risposta = Integer.parseInt(sc.nextLine());
			
			if(risposta == 1)
				auto = a1;
			else if(risposta == 2)
				auto = a2;
			else
				System.out.println("L'auto scelta non è valida.");
			
			
				System.out.println("Cosa vuoi fare? (accelera/decelera)");
				scelta = sc.nextLine();
				if(scelta.equals("accelera"))
					auto.accelera();
				else if(scelta.equals("decelera"))
					auto.rallenta();
				else
					System.out.println("Comando invalido.");
				a1.aggiorna();
				a1.visualizzaDati();
				System.out.println("\n");
				a2.aggiorna();
				a2.visualizzaDati();
			
		}
		while(true);
		
		
		
		
		
	}

}
