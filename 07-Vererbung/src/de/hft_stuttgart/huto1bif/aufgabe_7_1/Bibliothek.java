
package de.hft_stuttgart.huto1bif.aufgabe_7_1;


public class Bibliothek {

    private Buch[] regal;
    private Nutzer[] leser;

    public Buch[] getRegal() {
        return regal;
    }

    public Nutzer[] getLeser() {
        return leser;
    }

    
    public Bibliothek(Buch[] liste, Nutzer[] nutzer) {
        regal = liste;
        leser = nutzer;
    }
    
    public Bibliothek(Buch[] liste) {
        this(liste, new Nutzer[20]);
    }

    public void erstelleNutzer(String name, int nummer, Adresse adresse) {
        for (int i = 0; i < leser.length; i++) {
            if (leser[i] == null) {
                leser[i] = new Nutzer(name, nummer, adresse);
                break;
            }
        }
    }
    

    public boolean leiheBuch(Buch buch, Nutzer nutzer) {
        if (nutzer.kannAusleihen()) {
            buch.setAusgeliehen(true);
            nutzer.buchAusleihen(buch);
            return true;
        } else {
            return false;
        }

    }

    public void rueckgabeBuch(Buch buch, Nutzer nutzer) {
        buch.setAusgeliehen(false);
        nutzer.buchRueckgeben(buch);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Buch [] buecher = { new Buch("Java ist auch eine Insel", "Christian Ullenboom", 456357),
        new Buch("Robinson Crusoe", "Daniel Defoe", 45635),
        new Buch("Jim Knopf und Lukas der Lokomotivfuehrer", "Michael Ende", 456353),
        new Buch("Herr der Ringe", "Ronald Reuel Tolkien", 464646),
        new Buch("The King of Torts", "John Grisham", 451646)};
        
        Bibliothek bib = new Bibliothek(buecher);

        bib.erstelleNutzer("Daniel Duesentrieb", 123456, new Adresse("Schellingstrasse", 24, 70123, "Stuttgart"));

        System.out.println(bib.leser[0]);
        
        System.out.println("Darf "+bib.leser[0].getBuecherListe().length+" Bücher ausleihen");
        
    }
}
