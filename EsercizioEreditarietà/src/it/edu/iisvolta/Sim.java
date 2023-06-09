package it.edu.iisvolta;

import java.time.LocalDate;
import java.util.Scanner;

public class Sim {

	Scanner s=new Scanner(System.in);
	private float credito;
	private String gestore;
	private LocalDate scadenza;
	
	public Sim(String gestore, LocalDate scadenza, float credito) {
		super();
		this.gestore = gestore;
		this.scadenza=scadenza;
		credito=0.0f;
	}

	public void Ricarica(float importo) {
		if(importo<=0.0f)
			System.out.println("Importo errato!!!");
		else {
			credito+=importo;
		}
	}

	public float getCredito() {
		return credito;
	}

	public void setCredito(float credito) {
		if(credito<=0.0f)
			System.out.println("Credito a 0");
		else
			this.credito = credito;
	}

	public String getGestore() {
		return gestore;
	}

	public void setGestore(String gestore) {
		this.gestore = gestore;
	}

	public LocalDate getScadenza() {
		return scadenza;
	}

	public void setScadenza(LocalDate scadenza) {
		this.scadenza = scadenza;
	}
	
	
}
