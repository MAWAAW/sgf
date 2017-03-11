/**
* @author MOHAMMED BERRABAH
* @version 0.1 : Date : Mon Apr 15 18:07:30 CEST 2013
*
*/

import java.util.*;

public class TestSystemeFichier {
	
	public static void main(String args[]) {
		
		Fichier f1 = new Fichier("file 1", "blablabla");
		Fichier f2 = new Fichier("file 2", "rororororororororororororororo");
		Fichier f3 = new Fichier("file 3", "sisisisisisisisisisisisisisisisisisisisisisisisisisisisi");
		SystemeFichier sf = new SystemeFichier();
		sf.addFichier(f1);
		sf.addFichier(f2);
		sf.addFichier(f3);
		Iterator it = sf.iterator();
		
		int tailleMax = 0;
		while(it.hasNext()) {
			int tailleTmp = ((Fichier)it.next()).getTaille();
			if(tailleTmp > tailleMax)
				tailleMax = tailleTmp;
		}
		
		System.out.println("Le plus gros fichier a une taille de " + tailleMax + " octets");
	
	}
	
}
