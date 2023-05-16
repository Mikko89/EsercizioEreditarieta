package it.edu.iisvolta;

import java.time.LocalDate;

public class Smartphone extends Dispositivo{
	
	private int pollici;
	private int mPixel;
	private String presa;
	private Sim scheda;
	
	public Smartphone(boolean stato, String marca, String modello, int pollici, int mpixel, String presa) {
		super(marca, modello);
		this.pollici = pollici;
		this.mPixel = mpixel;
		this.presa = presa;
	}
	
	public void Telefona() {
		LocalDate oggi = LocalDate.now();
		LocalDate scadenza = scheda.getScadenza();
		int comparazione = oggi.compareTo(scadenza);
		
		System.out.println(comparazione);
	}

	public int getPollici() {
		return pollici;
	}

	public void setPollici(int pollici) {
		this.pollici = pollici;
	}

	public int getMpixel() {
		return mPixel;
	}

	public void setMpixel(int mpixel) {
		mPixel = mpixel;
	}

	public String getPresa() {
		return presa;
	}

	public void setPresa(String presa) {
		this.presa = presa;
	}

	public Sim getScheda() {
		return scheda;
	}

	public void setScheda(Sim scheda) {
		this.scheda = scheda;
	}
	
	

}
