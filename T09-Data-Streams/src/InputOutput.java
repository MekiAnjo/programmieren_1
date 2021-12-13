import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class InputOutput {

  public static void main(String[] args) {
    try (
      PrintWriter printWriter = new PrintWriter(
        "T09-Data-Streams\\src\\datei.txt"
      );
    ) {
      printWriter.println("Hallo Welt");
      printWriter.print("Testtesttest123");
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }

    try (
      BufferedReader reader = new BufferedReader(
        new FileReader("T09-Data-Streams\\src\\datei.txt")
      );
    ) {
      String line = reader.readLine();
      while (line != null) {
        System.out.println(line);
        line = reader.readLine();
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
