import java.util.Scanner;

/**
 * Horoskop
 */
public class Horoskop {

  public static void main(String[] args) {
    Scanner eingabe = new Scanner(System.in);
    System.out.print("Geben Sie Ihr Sternzeichen an: ");
    String sternzeichen = eingabe.next();
    switch (sternzeichen) {
      case "zwilling" -> System.out.println(
        "Zwilling: Es erwartet Sie viel Glück"
      );
      case "waage" -> System.out.println(
        "Waage: Reichtum liegt Ihnen zu Füßen"
      );
      case "löwe" -> System.out.println(
        "Löwe: Die Liebe hält Ihnen einiges bereit"
      );
      default -> System.out.println(
        "Die Sterne stehen in keinem guten Licht für Sie"
      );
    }
    eingabe.close();
  }
}
