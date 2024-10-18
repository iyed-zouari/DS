package ds;
import java.util.Scanner;
public class Film {
protected String titre;
protected String realisateur;
protected String pays_origine;
protected int duree;
protected int nbPlace;


public Film(String titre,String realisateur,String pays_origine,int duree) {
	this.titre=titre;
	this.realisateur=realisateur;
	this.pays_origine=pays_origine;
	this.duree=duree;
}

public int getNbPlace() {
	return nbPlace;
}
public void setNbPlace(int nbPlace) {
	this.nbPlace = nbPlace;
}

public String toString() {
	return (this.titre+" de "+this.realisateur+" ("+this.pays_origine+") "+ " - "+this.duree);
}
public float totalVenteBillets() {
	int etudiant,normal;
	Scanner sc=new Scanner(System.in);
	do {
	System.out.println("donner le nombre d'etudiant<="+this.getNbPlace());
	etudiant=sc.nextInt();	
	}while (etudiant>=this.getNbPlace());
	normal=this.nbPlace-etudiant;
	return (normal*3+etudiant*2);
	
}

}
