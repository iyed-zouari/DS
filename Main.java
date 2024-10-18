package ds;

public class Main {
    public static void main(String[] args) {
        Jcc jcc = new Jcc(2021, 2);
        Film film1 = new Film("Le dernier refuge", "Ousman", "Mali", 86);
        film1.setNbPlace(30);
        Film film2 = new Film("Insurrection", "Jilani Saadi", "Tunisie", 105);
        film2.setNbPlace(45);
        Documentaire d = new Documentaire("iyed","dsfg","String pays_origine",3,"String sujet");
        jcc.ajoutFilm(d);
        jcc.ajoutFilm(film1);
        jcc.ajoutFilm(film2);
        jcc.listeFilmsJCC();
        float totalVentes = jcc.totalVenteBilletsJcc();
        
        System.out.println("Montant total des ventes de billets : " + totalVentes + " dt");
    }
}
