/**
* @author MOHAMMED BERRABAH
* @version 0.1 : Date : Tue Apr 16 11:01:48 CEST 2013
*
*/

import java.util.*;

public class TestVisiteur {
	
	public static void main(String args[]) {
		
		Composant c1 = new Composite("Racine");
		Fichier f = new Fichier("Fichier 1","blablabla");
		c1.add(f);

		Composant c2 = new Composite("Dossier");
		c2.add(new Fichier("Fichier 2","123"));
		c1.add(c2);

		System.out.println(c1);
		System.out.println("Enfant de Racine " + c1.getEnfant(0) +
			" Enfant du suivant " + (c1.getEnfant(1)).getEnfant(0));
		c1.accepte(new VisiteurConcret());
		f.accepte(new VisiteurConcret());
		Iterator<Composant> it = ((Composite)c1).iterator();
		System.out.println("test iterator" + it.next());
	}
	
}
