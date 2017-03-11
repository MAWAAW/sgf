/**
* @author MOHAMMED BERRABAH
* @version 0.1 : Date : Mon Apr 15 15:55:04 CEST 2013
*
*/

import java.util.*;

public class Fichier implements Composant,Element {

	private String nom, contenue;
	private int taille;
	private Date date;
	
	public Fichier(String nom, String contenue) {
		this.nom = nom;
		this.contenue = contenue;
		this.taille = contenue.length();
		this.date = new Date();
	}
	
	public String getNom() { return nom; }
	public String getContenue() { return contenue; }
	public int getTaille() { return taille; }
	public Date getDate() { return date; }
	
	public void add(Composant c) {
		System.out.println("Ajout impossible");	
	}
	
	public void delete(Composant c) {
		System.out.println("Suppression impossible");	
	}
	
	public Composant getEnfant(int n) {
		return null;	
	}

	public String toString() {
		return nom;
	}

	public void accepte(Visiteur v) {
		v.visiteFichier(this.contenue);	
	}
}
