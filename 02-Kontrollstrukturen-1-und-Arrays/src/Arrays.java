/**
 * Arrays
 */
public class Arrays {

  public static void main(String[] args) {
    String trennzeichen = "-".repeat(24);

    String[] produktName = new String[6];
    double[] produktMenge = new double[6];
    double[] produktKcal = new double[6];
    double[] produktKcalGesamt = new double[6];

    produktName[0] = "Mehl";
    produktName[1] = "Kartoffeln";
    produktName[2] = "Tiefkühlpizza";
    produktName[3] = "Grillspiesse";
    produktName[4] = "Kartoffelsalat";
    produktName[5] = "Hackfleisch";

    produktMenge[0] = 100.0;
    produktMenge[1] = 1000.0;
    produktMenge[2] = 4.0;
    produktMenge[3] = 10.0;
    produktMenge[4] = 221.60;
    produktMenge[5] = 498.40;

    produktKcal[0] = 364.0 / 100.0;
    produktKcal[1] = 69.0 / 100.0;
    produktKcal[2] = 910.0;
    produktKcal[3] = 169.0;
    produktKcal[4] = 143.0 / 100.0;
    produktKcal[5] = 241.0 / 100.0;

    int zaehler = 0;
    while (zaehler < produktKcalGesamt.length) {
      produktKcalGesamt[zaehler] = produktMenge[zaehler] * produktKcal[zaehler];
      zaehler++;
    }

    double kcalGesamt = sumKcal(produktKcal);

    System.out.println("Einkaufsliste");
    System.out.println(trennzeichen);
    zaehler = 0;
    while (zaehler < produktName.length) {
      if (zaehler == 2 || zaehler == 3) {
        System.out.printf(
          "%-15s = %d Stück%n",
          produktName[zaehler],
          produktMenge[zaehler]
        );
        continue;
      }
      System.out.printf(
        "%-15s = %d gr%n",
        produktName[zaehler],
        produktMenge[zaehler]
      );
      zaehler++;
    }
    System.out.println(trennzeichen);

    System.out.println();

    System.out.println("Kalorien der Lebensmittel");

    System.out.println(trennzeichen);

    zaehler = 0;
    while (zaehler < produktKcal.length) {
      System.out.printf(
        "%-15s = %.2f gr%n",
        produktName[zaehler],
        produktKcal[zaehler]
      );
      zaehler++;
    }
    System.out.println();
    System.out.printf("Summe der Kalorien aller Produkte = %.2f%n", kcalGesamt);
    System.out.println(trennzeichen);
  }

  private static double sumKcal(double[] array) {
    double sum = 0;
    int zaehler = 0;
    while (zaehler < array.length) {
      sum += array[zaehler];
    }
    return sum;
  }
}
