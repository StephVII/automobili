package org.generation.italy;

public class Auto {
	
	int velocità;
	float carburante, consumoMedio, kmPercorsi;
	
	public void accelera()
	{
		if(velocità <= 190)
			velocità+=10;
	}
	public void rallenta()
	{
		if(velocità >= 10)
			velocità-=10;
	}
	public void visualizzaDati()
	{
		System.out.println("Velocità: "+velocità+"\nCarburante: "+carburante+"\nConsumo medio: "+consumoMedio+"\nChilometri percorsi: "+kmPercorsi);
	}
	public void aggiorna()
	{
		kmPercorsi += velocità;
		carburante-=velocità/consumoMedio;
	}

}
