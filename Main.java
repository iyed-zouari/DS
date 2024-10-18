package TD4;
import java.util.Scanner;
public class Main {
	public static int nb;
	public static float[] noteCtrl;
	public static float[] noteExam;
	public static float[] moy;
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		 do { 
			System.out.println("donner le nb d'etudiant entre 0 et 40 : ");
			nb=sc.nextInt();
		 }while(nb<0 || nb>40);
	        noteCtrl = new float[nb];
	        noteExam = new float[nb];
	        moy = new float[nb];
	        
		 Tab.remplir(noteCtrl);
		 Tab.remplir(noteExam);
		 
		 Tab.lister(noteCtrl);
		 Tab.lister(noteExam);
		 
		 moy=Tab.additonner(noteCtrl, Tab.produit(2,noteExam));
		 Tab.lister(moy);
		 
		 float m=Tab.somme_element(moy)/moy.length;
		 System.out.println("le moyen du classe est: "+m);
		 System.out.println("donner bonnus");
		 float bonus=sc.nextFloat();
		 System.out.println("si true => controle si false=> Exmain:");
		 boolean verif=sc.nextBoolean();
		 if (verif)
			 Tab.lister(Tab.additionner_bonus(bonus, noteCtrl));
		 else
			 Tab.lister(Tab.additionner_bonus(bonus, noteExam)); 

	System.out.println("le tableau apres le bonnus");
	 Tab.lister(noteCtrl);
	 Tab.lister(noteExam);
	
sc.close();}

}
