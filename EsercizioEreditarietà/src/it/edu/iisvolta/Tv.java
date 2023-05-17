package it.edu.iisvolta;

import java.util.ArrayList;
import java.util.Scanner;

public class Tv extends Dispositivo{

	Scanner s=new Scanner(System.in);
	private int pollici;
	private boolean smart;
	private String sistemaOperativo;
	private ArrayList<String> canali=new ArrayList<String>();;
	Canale c=new Canale("", 0, 0);
	
	public Tv(boolean stato, String marca, String modello, int pollici, boolean smart, String sistemaOperativo) {
		super(marca, modello);
		this.pollici = pollici;
		this.smart = smart;
		this.sistemaOperativo = sistemaOperativo;
	}

	public void Sintonizza() {
		if(isStato()) {
			for(int i=0;i<=9;i++) {
				canali.add(Integer.toString(i));
			}
			System.out.println("\nCanali sintonizzati");
		}else
			System.out.println("\nIl televisore è spento!");
	}
	
	public void guardaCanale(int nrCanale) {
		boolean trovato=false;
		for(int i=0;i<canali.size();i++) {
			if(nrCanale-1==i) {
				trovato=true;
				String canale=Integer.toString(nrCanale);
				c.setNome(canale);
				c.setNr(nrCanale);
				c.setFrequenza(nrCanale);
			}
		}
		System.out.println("\nStai guardando il canale: " +c.getNome() +" " +c.getNr() +" " +c.getFrequenza() +" Hz");
			
		if(trovato==false)
			System.out.println("\nCanale non trovato");
	}

	public int getPollici() {
		return pollici;
	}

	public void setPollici(int pollici) {
		this.pollici = pollici;
	}

	public boolean isSmart() {
		return smart;
	}

	public void setSmart(boolean smart) {
		this.smart = smart;
	}

	public String getSistemaOperativo() {
		return sistemaOperativo;
	}

	public void setSistemaOperativo(String sistemaOperativo) {
		this.sistemaOperativo = sistemaOperativo;
	}
	
	public ArrayList<String> getCanali() {
		return canali;
	}
}
