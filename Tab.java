package TD4;
import java.util.Scanner;
public class Tab {
public final static int nmax=40;
public static Scanner sc= new Scanner(System.in);
public static void remplir(float t[]) {
	for (int i=0;i < t.length;i++) {
		System.out.println("donner t["+i+"]= ");
		t[i]=sc.nextFloat();
	}
}
public static float somme_element(float t[]) {
	float s=0;
	for (int i=0 ;i<t.length;i++)
		s+=t[i];
	return s;
}
public static float [] additonner(float t1[],float t2[]) {
	int i=0;
    int n = Math.min(t1.length, t2.length);  // S'assurer qu'on additionne jusqu'à la taille minimale des deux tableaux
    float[] t = new float[n]; 
	while (i<t.length) {
		t[i]=t1[i]+t2[i];
		i++;
	}
	return t;
}
public static float [] produit(float x,float  t[]) {
	for (int i=0;i<t.length;i++)
		t[i]=t[i]*x;
	
	return t;
}
public static void lister(float t[]) {
	for (int i=0;i<t.length;i++) {
		System.out.println("t["+i+"]="+t[i]);
	}
}
public static float [] additionner_bonus(float x,float t[]) {
	for (int i=0;i<t.length;i++)
		t[i]=t[i]+x;
	
	return t;
}

}
