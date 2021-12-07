package aufgabe2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Smartphone {

  public static void main(String[] args) {
    SocialMediaApp instagram = new SocialMediaApp("Instagram", 42.83);
    SpielApp clashOfClans = new SpielApp("Clash of Clans", 175.39, "Strategie");
    SocialMediaApp whatsapp = new SocialMediaApp("WhatsApp", 36.53);
    SpielApp honkai3rdImpact = new SpielApp(
      "Honkai 3rd Impact",
      592.95,
      "Gacha"
    );
    System.out.println();

    ArrayList<App> alleApps = new ArrayList<>();
    alleApps.add(instagram);
    alleApps.add(clashOfClans);
    alleApps.add(whatsapp);
    alleApps.add(honkai3rdImpact);

    System.out.println("Unsortiert");
    printList(alleApps);

    Collections.sort(alleApps, (o1, o2) -> o1.compareTo(o2));
    System.out.println("Sortiert nach Speicherverbrauch");
    printList(alleApps);

    alleApps.remove(alleApps.size() - 1);
    System.out.println("Liste nachdem entfernen der Speicherhungrigsten App");
    printList(alleApps);
  }

  public static void printList(List<App> list) {
    for (App app : list) {
      System.out.println(app.installieren());
    }
    System.out.println();
    // list.forEach(System.out::println);
    // System.out.println();
  }
}
