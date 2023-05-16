package it.edu.iisvolta;

import java.util.ArrayList;

public class Tv extends Dispositivo{

	private int pollici;
	private boolean smart;
	private String sistemaOperativo;
	ArrayList<String> canali=new ArrayList<String>();
	
	
	public Tv(String marca, String modello, int pollici, boolean smart, String sistemaOperativo,
			ArrayList<String> canali) {
		super(marca, modello);
		this.pollici = pollici;
		this.smart = smart;
		this.sistemaOperativo = sistemaOperativo;
		this.canali = canali;
	}

	public void Sintonizza() {
		
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
