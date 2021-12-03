package schlangen;

public class Schlangenaufruf {

  public static void main(String[] args) {
    FzDeque a = new FzDeque("A1", "A2", "A3", "A4", "A5", "A6");
    FzDeque b = new FzDeque("B1", "B2", "B3", "B4");
    FzDeque l = new FzDeque("L1", "L2", "L3");

    FzDeque faehre = faehreAufladen(a, b, l);
    System.out.println("Fähre ist aufgeladen: " + faehre);
    faehreAbladen(faehre);
    System.out.println("Fähre ist abgeladen.");
  }

  private static void faehreAbladen(FzDeque faehre) {
    while (faehre.getLast().startsWith("L")) {
      System.out.println("Es wird abgeladen: " + faehre.getLast());
      faehre.pollLast();
    }
    while (!faehre.isEmpty()) {
      System.out.println("Es wird abgeladen: " + faehre.getFirst());
      faehre.pollFirst();
    }
  }

  private static FzDeque faehreAufladen(FzDeque a, FzDeque b, FzDeque l) {
    FzDeque faehre = new FzDeque();
    while (!(a.isEmpty() && b.isEmpty())) {
      if (!a.isEmpty()) {
        faehre.offer((a.pollFirst()));
      }
      if (!b.isEmpty()) {
        faehre.offer((b.pollFirst()));
      }
    }

    while (!l.isEmpty()) {
      faehre.offer(l.pollFirst());
    }

    return faehre;
  }
}
