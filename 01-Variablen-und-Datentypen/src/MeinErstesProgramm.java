/**
 * MeinErstesProgramm
 */
public class MeinErstesProgramm {

  public static void main(String[] args) {
    String trennzeichen = "-".repeat(24);

    int mehl = 100;
    int kartoffeln = 1000;
    int tiefkuehlpizza = 4;
    int grillspiesse = 10;

    double kartoffelsalat = 221.60;
    double hackfleisch = 498.40;

    double mehlKcal = 364.0 / 100.0;
    double kartoffelnKcal = 69.0 / 100.0;
    double tiefkuehlpizzaKcal = 910.0;
    double grillspiesseKcal = 169.0;
    double kartoffelsalatKcal = 143.0 / 100.0;
    double hackfleischKcal = 241.0 / 100.0;

    double mehlKcalGesamt = mehl * mehlKcal;
    double kartoffelnKcalGesamt = kartoffeln * kartoffelnKcal;
    double tiefkuehlpizzaKcalGesamt = tiefkuehlpizza * tiefkuehlpizzaKcal;
    double grillspiesseKcalGesamt = grillspiesse * grillspiesseKcal;
    double kartoffelsalatKcalGesamt = kartoffelsalat * kartoffelsalatKcal;
    double hackfleischKcalGesamt = hackfleisch * hackfleischKcal;

    double kcalGesamt = berechneKalorien(mehlKcalGesamt, kartoffelnKcalGesamt, tiefkuehlpizzaKcalGesamt,
        grillspiesseKcalGesamt, kartoffelsalatKcalGesamt, hackfleischKcalGesamt);

    System.out.println("Einkaufsliste");
    System.out.println(trennzeichen);
    System.out.printf("%-15s = %d gr%n", "Mehl", mehl);
    System.out.printf("%-15s = %d gr%n", "Kartoffeln", kartoffeln);
    System.out.printf("%-15s = %d Stück%n", "Tiefkühlpizza", tiefkuehlpizza);
    System.out.printf("%-15s = %d Stück%n", "Grillspiesse", grillspiesse);
    System.out.printf("%-15s = %.2f gr%n", "Kartoffelsalat", kartoffelsalat);
    System.out.printf("%-15s = %.2f gr%n", "Hackfleisch", hackfleisch);
    System.out.println(trennzeichen);

    System.out.println();

    System.out.println("Kalorien der Lebensmittel");
    System.out.println(trennzeichen);
    System.out.printf("%-15s = %.2f gr%n", "Mehl", mehlKcalGesamt);
    System.out.printf("%-15s = %.2f gr%n", "Kartoffeln", kartoffelnKcalGesamt);
    System.out.printf("%-15s = %.2f gr%n", "Tiefkühlpizza", tiefkuehlpizzaKcalGesamt);
    System.out.printf("%-15s = %.2f gr%n", "Grillspiesse", grillspiesseKcalGesamt);
    System.out.printf("%-15s = %.2f gr%n", "Kartoffelsalat", kartoffelsalatKcalGesamt);
    System.out.printf("%-15s = %.2f gr%n", "Hackfleisch", hackfleischKcalGesamt);
    System.out.println();
    System.out.printf("Summe der Kalorien aller Produkte = %.2f%n", kcalGesamt);
    System.out.println(trennzeichen);

  }

  private static double berechneKalorien(double mehlKcalGesamt, double kartoffelnKcalGesamt,
      double tiefkuehlpizzaKcalGesamt, double grillspiesseKcalGesamt, double kartoffelsalatKcalGesamt,
      double hackfleischKcalGesamt) {
    return (mehlKcalGesamt + kartoffelnKcalGesamt + tiefkuehlpizzaKcalGesamt + grillspiesseKcalGesamt
        + kartoffelsalatKcalGesamt + hackfleischKcalGesamt);
  }
}
