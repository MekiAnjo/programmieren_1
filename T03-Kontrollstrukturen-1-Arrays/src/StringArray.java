import java.util.Arrays;
import java.util.Scanner;

public class StringArray {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Schreiben Sie einen Satz auf die Konsole:");
    String eingabe = scanner.nextLine().trim().toLowerCase();

    System.out.println();

    System.out.println("Alphabetisch sortiert:");

    String[] words = eingabe.split(" ");
    Arrays.sort(words);
    Arrays
      .stream(words)
      // .map(s -> s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase())
      .forEach(w -> System.out.print(w + " "));

    scanner.close();
  }
}
