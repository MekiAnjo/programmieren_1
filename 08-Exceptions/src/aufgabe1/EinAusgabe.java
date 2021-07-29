package aufgabe1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;

public class EinAusgabe {

  private static final String FILEPATH =
    "08-Exceptions\\src\\aufgabe1\\Datei.txt";

  public static void main(String[] args) {
    try (PrintWriter writer = new PrintWriter(FILEPATH);) {
      writer.println("Datei 1");
      writer.println("Hello World");
    } catch (Exception e) {
      System.err.println("Datei nicht gefunden");
    }

    try (BufferedReader reader = new BufferedReader(new FileReader(FILEPATH))) {
      String line;
      while ((line = reader.readLine()) != null) {
        System.out.println(line);
      }
    } catch (Exception e) {
      System.err.println("Datei nicht gefunden");
    }
  }
}
