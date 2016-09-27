package it.azienda.progetto.mainapp;

import java.io.IOException;

import it.azienda.progetto.bean.Star;
import it.azienda.progetto.manager.StarDAO;

public class MovieApp {

	public static void main(String[] args) throws IOException {
		
		System.out.println("*****Stampa tutte le info delle star su DB*****");
		for (Star it : StarDAO.retrieveAllStar()) {
			System.out.println(it.getFirstName() + " " + it.getLastName());
			System.out.println(it.getBiography());
			System.out.println("------------------------");
		
		}
		System.out.println("*****Stampa tutte le info delle star su DB che contengono una parola*****");
		StarDAO.printStarByWord("S");
		
		System.out.println("*****Stampa tutte le info delle star su DB con cognome Villaggio*****");
		StarDAO.printStar("villaggio");
		
		System.out.println("*****Stampa tutte le info delle star su DB con select interna*****");
		StarDAO.printMoreParameter();
		
		System.out.println("*****Stampa tutte le info delle star su DB con select con parametri parziali*****");
		StarDAO.printMiniInfos();


	}

}
