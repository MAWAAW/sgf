/**
* @author MOHAMMED BERRABAH
* @version 0.1 : Date : Tue Apr 16 11:08:54 CEST 2013
*
*/

import java.util.*;

public class VisiteurConcret implements Visiteur {
	
	public void visiteRepertoire(List<Composant> lc) {
		System.out.println("Contenue du repertoire : ");
		for(Composant c : lc)
			System.out.println("-> "+c);
		System.out.println("-----");
	}
	
	public void visiteFichier(String s) {
		System.out.println("Contenue du fichier : \"" + s + "\"");
		System.out.println("-----");
	}
	
}
