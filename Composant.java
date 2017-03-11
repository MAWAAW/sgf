/**
* @author MOHAMMED BERRABAH
* @version 0.1 : Date : Tue May 07 09:51:14 CEST 2013
*
*/

import java.util.*;

public interface Composant extends Element {
	public void add(Composant c);
	public void delete(Composant c);
	public Composant getEnfant(int n);
	public String toString();
}