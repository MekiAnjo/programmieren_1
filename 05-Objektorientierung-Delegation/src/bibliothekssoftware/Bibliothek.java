package bibliothekssoftware;


import java.util.Arrays;
import java.util.Objects;
import java.util.Random;


/**
 * Bibliothek
 */
public class Bibliothek {

  private static final Random RAND = new Random();
  protected static String[] stock = {
    "Fundamentals of WaveletsData SmartGod Created the IntegersSuperfreakonomics",
    "Orientalism",
    "Nature of Statistical Learning Theory",
    "Integration of the Indian States",
    "Drunkard's Walk",
    "Image Processing & Mathematical Morphology",
    "How to Think Like Sherlock Holmes",
    "Data Scientists at Work",
    "Slaughterhouse Five",
    "Birth of a Theorem",
    "Structure & Interpretation of Computer Programs",
    "Age of Wrath",
    "Statistical Decision Theory",
    "Data Mining Handbook",
    "New Machiavelli",
    "Physics & Philosophy",
    "Making Software",
    "Machine Learning for Hackers",
    "Signal and the Noise",
    "Python for Data Analysis",
    "Introduction to Algorithms",
    "Beautiful and the Damned",
    "Outsider",
    "Complete Sherlock Holmes",
    "Wealth of Nations",
    "Pillars of the Earth",
    "Mein Kampf",
    "Tao of Physics",
    "Surely You're Joking Mr Feynman",
    "Farewell to Arms",
    "Veteran",
    "False Impressions",
    "Last Lecture, The",
    "Return of the Primitive",
    "Jurassic Park",
    "Russian Journal",
    "Tales of Mystery and Imagination",
    "Freakonomics",
    "Hidden Connections",
    "Story of Philosophy",
    "Asami Asami",
    "Journal of a Novel",
    "Once There Was a War",
    "Moon is Down",
    "Brethren",
    "Catch 22",
    "Complete Mastermind",
    "Dylan on Dylan",
    "Soft Computing & Intelligent Systems",
    "Textbook of Economic Theory",
    "Learning OpenCV",
  };

  protected static Buch[] Leihliste = new Buch[stock.length];

  protected void rentABook(String name) {
    if (Arrays.stream(stock).anyMatch(str -> str.equals(name))) {
      if (
        Arrays
          .stream(Leihliste)
          .filter(Objects::nonNull)
          .anyMatch(book -> book.getName().equals(name))
      ) {
        System.out.println("Das Buch '" + name + "' ist im Moment ausgeliehen");
        return;
      }
      Buch buch = new Buch(name, generateRandomId());
      setBookOnLendingList(buch);
      return;
    }
    System.out.println("Das Buch '" + name + "' existiert nicht im Katalog");
  }

  private static int generateRandomId() {
    return RAND.nextInt(1_000) + 1;
  }

  private static void setBookOnLendingList(Buch buch) {
    for (int i = 0; i < Leihliste.length; i++) {
      if (Leihliste[i] == null) {
        buch.setIstAusgeliehen(true);
        Leihliste[i] = buch;
        return;
      }
    }
  }

  protected static String getRandomBookTitles() {
    return stock[RAND.nextInt(stock.length - 1)];
  }

  protected static void printLendingList() {
    for (Buch buch : Leihliste) {
      if (buch != null) {
        System.out.println(buch);
      }
    }
    Arrays
      .stream(Leihliste)
      .filter(x -> x != null)
      .forEach(System.out::println);
  }
}
