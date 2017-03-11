/**
* @author MOHAMMED BERRABAH
* @version 0.1 : Date : Tue Apr 16 10:08:32 CEST 2013
*
*/

import java.util.*;

public interface Visiteur {
	
	public void visiteRepertoire(List<Composant> lc);
	public void visiteFichier(String s);
	
}