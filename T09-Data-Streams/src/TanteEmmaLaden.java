import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TanteEmmaLaden {

  private ArrayList<Article> range;
  private Scanner scanner = new Scanner(System.in);
  private File file;

  public TanteEmmaLaden(File file) {
    this.file = file;
    range = new ArrayList<>();
  }

  public List<Article> getRange() {
    return range;
  }

  public void addArticle() {
    System.out.println("Geben Sie einen Namen für das Produkt an: ");
    String name = scanner.nextLine();
    System.out.println("Geben Sie eine Marke an: ");
    String brand = scanner.nextLine();
    System.out.println("Geben Sie einen Preis an: ");
    String s = scanner.next();
    while (!s.matches("\\d+(\\.\\d+)?")) {
      System.out.println("Bitte geben Sie eine positive Zahl ein!");
      s = scanner.next();
    }
    double price = Double.parseDouble(s);
    range.add(new Article(name, brand, price));
  }

  public void removeArticle(int artNum) {
    range.remove(artNum);
  }

  public void saveRange() {
    try (BufferedWriter writer = new BufferedWriter(new FileWriter(file));) {
      if (range.isEmpty()) {
        return;
      }
      for (Article article : range) {
        writer.write(
          article.getName() +
          "::" +
          article.getBrand() +
          "::" +
          article.getPrice() +
          "\n"
        );
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public void getArticles() {
    try (BufferedReader reader = new BufferedReader(new FileReader(file));) {
      String s;
      while ((s = reader.readLine()) != null) {
        String[] attributes = s.split("::");
        range.add(
          new Article(
            attributes[0],
            attributes[1],
            Double.parseDouble(attributes[2])
          )
        );
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    for (Article article : range) {
      builder.append("[" + article + "]\n");
    }
    return builder.append("\n").toString();
  }

  public void getUserAction() {
    while (true) {
      System.out.println(
        "Geben Sie \'add\' ein, um einen neuen Artikel anzulegen"
      );
      System.out.println(
        "Geben Sie \'rm [Zahl]\' ein, um einen Artikel zu entfernen"
      );
      System.out.println(
        "Geben Sie \'ls' ein, um eine Liste mit allen Artikeln zu sehen"
      );
      System.out.println("Geben Sie \'t\' ein, um das Programm zu terminieren");

      String command = scanner.nextLine();

      if (command.equals("add")) {
        this.addArticle();
      } else if (command.contains("rm")) {
        this.removeArticle(Integer.parseInt(command.split(" ")[1]));
      } else if (command.equals("ls")) {
        System.out.println(this);
      } else if (command.equals("t")) {
        this.saveRange();
        System.exit(0);
      } else {
        System.out.println("Ihre Eingabe war ungültig");
      }
    }
  }

  public static void main(String[] args) {
    File file = new File("sortiment.txt");

    TanteEmmaLaden myEmmaLaden = new TanteEmmaLaden(file);
    myEmmaLaden.getArticles();
    myEmmaLaden.getUserAction();
  }
}
