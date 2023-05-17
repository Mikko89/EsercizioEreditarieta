package it.edu.iisvolta;

public class Dispositivo {

	protected boolean stato;
	protected String marca;
	protected String modello;
	
	
	
	public Dispositivo(String marca, String modello) {
		this.marca = marca;
		this.modello = modello;
		stato=false;
	}

	public void Accendi() {
		if(stato==false) {
			System.out.println("\nDispositivo acceso");
			stato=true;
		}
		else
			System.out.println("\nDispositivo già acceso!");
	}
	
	public void Spegni() {
		if(stato==true) {
			System.out.println("\nDispositivo spento");
			stato=false;
		}
		else
			System.out.println("\nDispositivo già spento!");
	}
	
	public boolean isStato() {
		return stato;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModello() {
		return modello;
	}

	public void setModello(String modello) {
		this.modello = modello;
	}
	
	
	
}
