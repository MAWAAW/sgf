/**
* @author MOHAMMED BERRABAH
* @version 0.1 : Date : Mon Apr 15 16:05:51 CEST 2013
*
*/

import java.util.*;

public class SystemeFichier implements Iterable<Fichier> {
	
	private Fichier[] repertoire;
	private int indice;
	
	public SystemeFichier() {
		this.repertoire = new Fichier[10];
		this.indice = 0;
	}
	
	public Iterator<Fichier> iterator() {
		return new IterateurSystemeFichier(this.repertoire);	
	}
	
	public void addFichier(Fichier f) {
		repertoire[indice] = f;
		indice++;
	}
	
}