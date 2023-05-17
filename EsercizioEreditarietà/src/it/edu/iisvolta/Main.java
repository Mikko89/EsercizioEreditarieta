package it.edu.iisvolta;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		String scelta1, scelta2;
		Sim sm=new Sim("",null,0.0f);
		Smartphone sp=new Smartphone(false,"","",0,0,null,null);
		Tv tv=new Tv(false,"","",0,false,"");
		do {
			System.out.println("-NEGOZIO DI ELETTRONICA-\n");
	        System.out.println("1 - Reparto Smartphone");
	        System.out.println("2 - Reparto Televisori");
	        System.out.println("9 - Esci\n");
	        System.out.print("Inserisci la tua scelta: ");
	        scelta1=s.nextLine();
	        switch(scelta1) {
	        case "1": //reparto smartphone
	        	do {
	    			System.out.println("\n-REPARTO SMARTPHONE-\n");
	    	        System.out.println("1 - Crea Scheda SIM");
	    	        System.out.println("2 - Visualizza Scheda SIM");
	    	        System.out.println("3 - Ricarica");
	    	        System.out.println("4 - Crea Smartphone");
	    	        System.out.println("5 - Visualizza Smartphone");
	    	        System.out.println("6 - Accendi Smartphone");
	    	        System.out.println("7 - Spegni Smartphone");
	    	        System.out.println("8 - Telefona");
	    	        System.out.println("9 - Torna indietro\n");
	    	        System.out.print("Inserisci la tua scelta: ");
	    	        scelta2=s.nextLine();
	    	        switch(scelta2) {
	    	        case "1":   //crea scheda
	    	        	System.out.print("\nInserire il gestore: ");
	    	        	String gestore=s.nextLine();
	    	        	System.out.print("Inserisce la scadenza della scheda: ");
	    	            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	    	            String date=s.nextLine();
	    	            LocalDate localDate = LocalDate.parse(date, formatter);
	    	            sm.setGestore(gestore);
	    	            sm.setScadenza(localDate);
	    	            sm.setCredito(0.0f);
	    	        break;
	    	        case "2":	//visualizza scheda
	    	        	System.out.println("\n---Scheda Sim---");
	    	        	System.out.println("- Operatore: " +sm.getGestore());
	    	        	System.out.println("- Scadenza: " +sm.getScadenza());
	    	        	System.out.println("- Credito: " +sm.getCredito() +" euro");
	    	        break;
	    	        case "3":	//ricarica
	    	        	System.out.print("\nInserire l'importo in euro: ");
	    	        	float importo=Float.parseFloat(s.nextLine());
	    	        	sm.Ricarica(importo);
	    	        break;
	    	        case "4":	//crea smartphone
	    	        	System.out.print("\nInserire la marca: ");
	    	        	String marca=s.nextLine();
	    	        	System.out.print("Inserire il modello: ");
	    	        	String modello=s.nextLine();
	    	        	System.out.print("Inserire i pollici: ");
	    	        	int pollici=Integer.parseInt(s.nextLine());
	    	        	System.out.print("Inserire i Mpixel: ");
	    	        	int Mpixel=Integer.parseInt(s.nextLine());
	    	        	System.out.print("Inserisci il tipo di presa: ");
	    	        	String presa=s.nextLine();
	    	        	sp.setMarca(marca);
	    	        	sp.setModello(modello);
	    	        	sp.setPollici(pollici);
	    	        	sp.setMpixel(Mpixel);
	    	        	sp.setPresa(presa);
	    	        	sp.setScheda(sm);
	    	        break;
	    	        case "5":	//visualizza smartphone
	    	        	System.out.println("\n---Smartphone---");
	    	        	if(sp.isStato())
	    	        		System.out.println("- Stato: ACCESO");
	    	        	else
	    	        		System.out.println("- Stato: SPENTO");
	    	        	System.out.println("- Marca: " +sp.getMarca());
	    	        	System.out.println("- Modello: " +sp.getModello());
	    	        	System.out.println("- Pollici: " +sp.getPollici() +" ''");
	    	        	System.out.println("- Mpixel: " +sp.getMpixel() +" MP");
	    	        	System.out.println("- Presa: " +sp.getPresa());
	    	        	System.out.println("- Sim " +sm.getGestore() +", scadenza " +sm.getScadenza() +", credito residuo " +sm.getCredito() +" euro");
	    	        	
		    	    break;
		    	    case "6":	//accendi smartphone
		    	        sp.Accendi();
		    	        
		    	    break;
		    	    case "7":	//spegni smartphone
		    	    	sp.Spegni();
		    	    	
		    	    break;
		    	    case "8":	//telefona
			    	    sp.Telefona();
			    	break;
	    	        }
	    	        if(!scelta2.equals("9")){
	    	        	System.out.println("\nPremi Enter per continuare...");
	    	        	s.nextLine();
	    	        }
	    		}while(!scelta2.equals("9"));
	        break;
	        case "2":	//reparto tv
	        	do {
	    			System.out.println("\n-REPARTO TELEVISORI-\n");
	    	        System.out.println("1 - Crea televisore");
	    	        System.out.println("2 - Visualizza televisori");
	    	        System.out.println("3 - Accendi televisore");
	    	        System.out.println("4 - Spegni televisori");
	    	        System.out.println("5 - Sintonizza televisore");
	    	        System.out.println("6 - Guarda canale");
	    	        System.out.println("9 - Torna indietro\n");
	    	        System.out.print("Inserisci la tua scelta: ");
	    	        scelta2=s.nextLine();
	    	        switch(scelta2) {
	    	        case "1":	//crea televisore
	    	        	System.out.print("\nInserire la marca: ");
	    	        	String marca=s.nextLine();
	    	        	System.out.print("Inserire il modello: ");
	    	        	String modello=s.nextLine();
	    	        	System.out.print("Inserire i pollici: ");
	    	        	int pollici=Integer.parseInt(s.nextLine());
	    	        	System.out.print("E' una smart-tv?(s/n)");
	    	        	String risp=s.nextLine();
	    	        	boolean smart=false;
	    	        	if(risp.equals("s"))
	    	        		smart=true;
	    	        	System.out.print("Inserire il sistema operativo: ");
	    	        	String so=s.nextLine();
	    	        	tv.setMarca(marca);
	    	        	tv.setModello(modello);
	    	        	tv.setPollici(pollici);
	    	        	tv.setSmart(smart);
	    	        	tv.setSistemaOperativo(so);
		    	    break;
		    	    case "2":	//visualizza televisori
		    	    	System.out.println("\n---Televisore---");
		    	    	if(tv.isStato())
	    	        		System.out.println("- Stato: ACCESO");
	    	        	else
	    	        		System.out.println("- Stato: SPENTO");
	    	        	System.out.println("- Marca: " +tv.getMarca());
	    	        	System.out.println("- Modello: " +tv.getModello());
	    	        	System.out.println("- Pollici: " +tv.getPollici() +" ''");
	    	        	if(tv.isSmart())
	    	        		System.out.println("- Smart tv");
	    	        	else
	    	        		System.out.println("- No smart tv");
	    	        	System.out.println("- Sistema Operativo: " +tv.getSistemaOperativo());
	    	        	if(tv.getCanali().isEmpty())
	    	        		System.out.println("- Canali da sintonizzare");
	    	        	else
	    	        		System.out.println("- Canali sintonizzati");
		    	    break;
		    	    case "3":	//accendi televisori
		    	        	tv.Accendi();
		    	        	
		    	    break;
		    	    case "4":	//spegni televisori
		    	        	tv.Spegni();
		    	        	
		    	    break;
		    	    case "5":	//sintonizza televisore
		    	        	tv.Sintonizza();
			    	break;
			    	case "6":	//guarda canale
			    		System.out.print("\nChe canale vuoi vedere?");
			    		int num=Integer.parseInt(s.nextLine());
			    			tv.guardaCanale(num);
			    	break;
	    	        }
	    	        if(!scelta2.equals("9")){
	    	        	System.out.println("\nPremi Enter per continuare...");
	    	        	s.nextLine();
	    	        }
	    		}while(!scelta2.equals("9"));
	        break;
	        case "9":	//fine
	        	System.out.println("\nArrivederci...");
	        break;
	        }
			System.out.println("\nPremi Enter per continuare...");
		    s.nextLine();
		}while(!scelta1.equals("9"));
	}
}
