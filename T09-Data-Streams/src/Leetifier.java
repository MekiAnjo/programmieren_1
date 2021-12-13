import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class Leetifier {

  public static String getText(File file) {
    int verses = 1; // verse = Strophe
    int lines = 0; // line = Vers

    StringBuilder builder = new StringBuilder();
    String text;

    try (
      BufferedReader reader = new BufferedReader(
        new InputStreamReader(new FileInputStream(file), StandardCharsets.UTF_8)
      );
    ) {
      while ((text = reader.readLine()) != null) {
        builder.append(text).append("\n");

        if (text.isEmpty()) {
          verses++;
        } else {
          lines++;
        }
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
    System.out.println("Titel: Der Zauberlehrling");
    System.out.println("Anzahl Strophen: " + verses);
    System.out.println("Anzahl Verse: " + lines);
    return builder.toString();
  }

  public static void leetify(String text) {
    text =
      text
        .replace("l", "1")
        .replace("e", "3")
        .replace("t", "7")
        .replaceAll("[o|O]", "0")
        .replace("i", "!")
        .replace("A", "4")
        .replace("s", "5");

    try (
      BufferedWriter writer = new BufferedWriter(
        new FileWriter(new File("T09-Data-Streams\\src\\24ub3r13hr1ing.txt"))
      );
    ) {
      String[] lines = text.split("\n");

      for (String string : lines) {
        writer.write(string + "\n");
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static void main(String[] args) {
    String text = getText(
      new File("T09-Data-Streams\\src\\Zauberlehrling.txt")
    );
    leetify(text);
  }
}
