package it.edu.iisvolta;

public class Canale {
	
	private int nr;
	private String nome;
	private int frequenza;
	
	public Canale(String nome, int nr,int frequenza) {
		super();
		this.nome = nome;
		this.nr = nr;
		this.frequenza = frequenza;
	}

	public String getNr() {
		String numero;
		switch(nr) {
		case 1:
			numero="uno";
		break;
		case 2:
			numero="due";
		break;
		case 3:
			numero="tre";
		break;
		case 4:
			numero="quattro";
		break;
		case 5:
			numero="cinque";
		break;
		case 6:
			numero="uno";
		break;
		case 7:
			numero="sette";
		break;
		case 8:
			numero="otto";
		break;
		case 9:
			numero="Nove";
		break;
		default:
			numero = Integer.toString(nr);
		break;
		}
		return numero;
	}

	public void setNr(int nr) {
		this.nr = nr;
	}

	public String getNome() {
		String nome;
		switch(nr) {
		case 1:
			nome="Rai";
		break;
		case 2:
			nome="Rai";
		break;
		case 3:
			nome="Rai";
		break;
		case 4:
			nome="Rete";
		break;
		case 5:
			nome="Canale";
		break;
		case 6:
			nome="Italia";
		break;
		case 7:
			nome="La";
		break;
		case 8:
			nome="La";
		break;
		default:
			nome = Integer.toString(nr);
		break;
		}
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getFrequenza() {
		String Hz;
		switch(nr) {
		case 1:
			Hz="11766";
		break;
		case 2:
			Hz="11766";
		break;
		case 3:
			Hz="11766";
		break;
		case 4:
			Hz="11432";
		break;
		case 5:
			Hz="11432";
		break;
		case 6:
			Hz="11432";
		break;
		case 7:
			Hz="11919";
		break;
		case 8:
			Hz="12207";
		break;
		case 9:
			Hz="11393";
		break;
		default:
			Hz = Integer.toString(nr);
		break;
		}
		return Hz;
	}

	public void setFrequenza(int frequenza) {
		this.frequenza = frequenza;
	}
	
	
}
