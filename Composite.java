/**
* @author MOHAMMED BERRABAH
* @version 0.1 : Date : Tue Apr 16 09:39:17 CEST 2013
*
*/

import java.util.*;

public class Composite implements Composant,Iterable<Composant>,Element {
	
	private List<Composant> liste = new ArrayList<Composant>();
	private String nom;
	
	public Composite(String s) {
		this.nom = s;	
	}
	
	public Iterator<Composant> iterator() {
		return liste.iterator();	
	}
	
	public void add(Composant c) {
		liste.add(c);	
	}
	
	public void delete(Composant c) {
		liste.remove(c);	
	}
	
	public Composant getEnfant(int n) {
		if(liste.size()<=n) {
			return null;	
		}
		return liste.get(n);
	}
	
	public String toString() {
		return "Repertoire : "+nom;	
	}
		
	public void accepte(Visiteur v) {
        v.visiteRepertoire(this.liste);
    }
	
}