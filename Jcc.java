package ds;
public class Jcc {
Film  compition [];
private int annee;
public final int NBFMAX=30;
private int nbF=0;
public Jcc (int annee,int taille){
	this.annee=annee;

	if (this.nbF<=this.NBFMAX)
		compition =new Film [taille];
	else
		System.out.println("erreur");
}
public void ajoutFilm(Film f) {
    if (this.nbF >= compition.length) {
        System.out.println("La compétition est au complet");
    } else {
    	compition[nbF] = f;
        this.nbF++;
    }
}
public void listeFilmsJCC() {
    System.out.println("film de l'année " + this.annee + ":");
    for (int i = 0; i < nbF; i++) {
        if (compition[i] != null) {
            System.out.println(compition[i].toString());
        }
    }
}
public float totalVenteBilletsJcc() {
	float s=0;
	for (int i=0;i<this.nbF;i++) {
		s+=compition[i].totalVenteBillets();
	}
	return s;
}
}
