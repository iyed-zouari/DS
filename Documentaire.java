package ds;

public class Documentaire extends Film{
private String sujet;
private float tarif=2;
public Documentaire(String titre,String realisateur,String pays_origine,int duree,String sujet) {
	super(titre, realisateur, pays_origine, duree);
	sujet=this.titre;
}
public String toString() {
	super.toString();
	return ("le sujet est "+this.sujet);
}
public float totalVenteBillets() {
	return (this.tarif*this.nbPlace);
}
}
