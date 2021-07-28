import java.util.Random;
import java.util.Scanner;

/**
 * SmartStorage
 */
public class SmartStorage {

  public static void main(String[] args) {
    String[] kuehlSchrank = new String[20];
    String[] kuehlRegal = new String[20];
    String[] einkaufsTasche = {
      "Kartoffeln",
      "Leinsamen",
      "Salz",
      "Erdnüsse",
      "Apfel",
      "Banane",
      "Birne",
      "Lachs",
      "Forelle",
      "Hähnchen",
      "Pute",
      "Schokolade",
      "Olivenöl",
      "Grüner Tee",
      "Datteln",
      "Magerquark",
      "Butter",
      "Zimt",
      "Hackfleisch",
      "Käse",
    };
    String[] allergienListe = { "Zimt", "Erdnüsse" };
    String[] spendenListe = new String[10];

    boolean isAllergic = false;
    boolean isProgrammRunning = true;
    int indexSpende = 0;

    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    while (isProgrammRunning) {
      System.out.println("1 - Produkt aus der Einkaustasche nehmen");
      System.out.println("2 - Kühlschrankinhalt ausgegeben");
      System.out.println("3 - Küchenregalinhalt ausgeben");
      System.out.println("4 - Spendenliste ausgeben");
      System.out.println("5 - Einkaufstasche ausgegen");
      System.out.println("6 - Programm beenden");
      System.out.print("Eingabe: ");
      int eingabe = scanner.nextInt();
      String produkt = "";

      switch (eingabe) {
        case 1 -> {
          boolean produktNotNull = true;
          while (produktNotNull) {
            int index = random.nextInt(einkaufsTasche.length - 1);
            if (einkaufsTasche[index] == null) continue;
            produkt = einkaufsTasche[index];
            einkaufsTasche[index] = null;
            produktNotNull = false;
            System.out.println("Es wurde " + produkt + " gewählt");
            arrayAufruecken(einkaufsTasche);
          }

          for (int i = 0; i < allergienListe.length; i++) {
            if (allergienListe[i].equals(produkt)) {
              System.out.println(
                "Produkt trifft auf Allergie -> lege es auf die Spendenliste"
              );
              spendenListe[indexSpende] = produkt;
              indexSpende++;
              isAllergic = true;
              break; // Eigentlich nicht nötig, da jedes Element nut einmal auftritt
            }
          }
          if (!isAllergic) {
            System.out.println("Wo soll das Produkt gelagert werden?");
            System.out.println("Kühlschrank(1) oder Kühlregal(2)");
            System.out.print("Eingabe: ");
            int wahl = scanner.nextInt();
            switch (wahl) {
              case 1 -> putInArray(kuehlSchrank, produkt);
              case 2 -> putInArray(kuehlRegal, produkt);
              default -> printInvalidInput();
            }
          }
          isAllergic = false;
        }
        case 2 -> printArray(kuehlSchrank);
        case 3 -> printArray(kuehlRegal);
        case 4 -> printArray(spendenListe);
        case 5 -> printArray(einkaufsTasche);
        case 6 -> isProgrammRunning = false;
        default -> printInvalidInput();
      }
    }
    scanner.close();
  }

  private static void printArray(String[] array) {
    for (int i = 0; i < array.length; i++) {
      if (array[i] != null) System.out.printf("%2d: %s%n", i, array[i]);
    }
  }

  private static void putInArray(String[] array, String produkt) {
    for (int i = 0; i < array.length; i++) {
      if (array[i] == null) {
        array[i] = produkt;
        break;
      }
    }
  }

  private static void printInvalidInput() {
    System.out.println("Ungültige Eingabe, bitte erneut eingeben");
  }

  private static void arrayAufruecken(String[] array) {
    for (int i = 0; i < array.length; i++) {
      if (array[i] == null) {
        for (int j = i; j < array.length; j++) {
          if (j + 1 == array.length) {
            array[j] = null;
            return;
          }
          if (array[j + 1] == null) return;
          array[j] = array[j + 1];
        }
      }
    }
  }
}
