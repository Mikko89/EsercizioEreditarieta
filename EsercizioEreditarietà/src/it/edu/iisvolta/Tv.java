package it.edu.iisvolta;

import java.util.ArrayList;

public class Tv extends Dispositivo{

	private int pollici;
	private boolean smart;
	private String sistemaOperativo;
	ArrayList<String> canali=new ArrayList<String>();
	
	
	public Tv(String marca, String modello, int pollici, boolean smart, String sistemaOperativo) {
		super(marca, modello);
		this.pollici = pollici;
		this.smart = smart;
		this.sistemaOperativo = sistemaOperativo;
	}

	public void Sintonizza() {
		for(int i=0;i<=10;i++) {
			canali.add(Integer.toString(i));
		}
	}
	
	public void guardaCanale(int nrCanale) {
		boolean trovato=false;
		for(int i=0;i<canali.size();i++)
			if(i==nrCanale) {
				trovato=false;
				System.out.println("Stai guardando il canale: " +canali.get(i));
			}
		if(trovato==false)
			System.out.println("Canale non trovato");
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

	public void setCanali(ArrayList<String> canali) {
		this.canali = canali;
	}
	
	
}
