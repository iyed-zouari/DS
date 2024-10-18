package TD4EX2;
import java.util.Scanner;
import java.util.ArrayList;
class Dicctionnaire{
	
	private int nbMots;-
	ArrayList<MotDico> dico;
	private String nom;
	Scanner sc =new Scanner(System.in);
public Dicctionnaire(String nom) {
	System.out.println("donner le nbMots: ");
	this.nbMots=0;
	dico = new ArrayList<>();
	this.nom=nom;
}
public void ajouterMot(MotDico m) {
	dico.add(m);
	this.nbMots++;
}
public void supprimerMot (String ch) {
	int i=chercherMot(ch);
	if (i!=-1) {
		dico.remove(i);
		this.nbMots--;
		System.out.println("le mot efacer avec succer!!");
	}
	else
		System.out.println("le mot n'existe pas");
}
public int chercherMot(String ch) {
	for (int i=0;i<dico.size();i++) {
		if (dico.get(i).getMot().equalsIgnoreCase(ch)) {
			return i;
			}
	}
	return -1;
}
public void listerDico() {
	System.out.println("le nom de dictionnaire :"+this.nom);
	for (int i=0 ;i<this.nbMots;i++)
		System.out.println("Dico ["+i+"]: "+dico.get(i).getMot()+"definition est "+dico.get(i).getDefinition());
}
public int nbSynonymes(MotDico m) {
	int nb=0;
	for (MotDico mot :dico) {
		if (mot.synonyme(m)) {
			nb++;
		}
	}
	return nb;
}
}

