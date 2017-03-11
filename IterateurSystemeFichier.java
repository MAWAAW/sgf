/**
* @author MOHAMMED BERRABAH
* @version 0.1 : Date : Mon Apr 15 16:14:53 CEST 2013
*
*/

import java.util.*;

public class IterateurSystemeFichier implements Iterator<Fichier> {
	
	private Fichier[] repertoire;
	private int iCourant;
	
	public IterateurSystemeFichier(Fichier repertoire[]) {
		this.repertoire = repertoire;
		this.iCourant = 0;
	}
	
	public boolean hasNext() {	
		if(this.repertoire[iCourant]!=null)
			return true;
		return false;
	}
	
	public Fichier next() {
		if(hasNext())
			return this.repertoire[iCourant++];
		return null;
	}
	
	public void remove() {
		int iTmp = iCourant;
		repertoire[iTmp] = null;
		while(repertoire[iTmp+1]!=null || iTmp<repertoire.length) {
			repertoire[iTmp] = repertoire[iTmp+1];	
			iTmp++;
		}
		repertoire[iTmp] = null;
	}
	
}