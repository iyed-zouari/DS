package TD4EX2;
public class MotDico {
public static  int count=0;
private int num;
protected String mot;
protected String definition;
public MotDico(String mot,String definition) {
	this.mot=mot;
	this.definition=definition;
	this.num=count++;
}
public String getMot() {return this.mot;}

public String getDefinition() {return this.definition;}

public void setDefinition(String s) {
	this.definition=s;
}
public void setMot(String m) {
	this.mot=m;
}
public boolean synonyme (MotDico m) {
	return this.mot.equalsIgnoreCase(m.getMot());
}
public void afficher() {
    System.out.println("Num: " + num + ", Mot: " + mot + ", Définition: " + definition);
}
}
