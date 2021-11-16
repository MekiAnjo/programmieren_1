package de.hft_stuttgart.huto1bif.aufgabe_7_2;

import java.util.Arrays;

/**
 * Main
 */
public class Main {

  public static void main(String[] args) {
    GeometrischeFigur[] geoFig = new GeometrischeFigur[3];
    geoFig[0] = new Dreieck(new Koordinate(2, 5), 9, 9, 3);
    geoFig[1] = new Kreis(new Koordinate(1, 1), 9);
    geoFig[2] = new Quadrat(new Koordinate(3, 1), 9);

    System.out.println("Unsortiert");
    System.out.println(Arrays.toString(geoFig));

    System.out.println("Absteigend sortiert");
    Arrays.sort(geoFig);
    System.out.println(Arrays.toString(geoFig));

    System.out.println("Aufsteigend sortiert");
    invertUsingFor(geoFig);
    System.out.println(Arrays.toString(geoFig));
  }

  public static void invertUsingFor(Object[] array) {
    for (int i = 0; i < array.length / 2; i++) {
      Object temp = array[i];
      array[i] = array[array.length - 1 - i];
      array[array.length - 1 - i] = temp;
    }
  }
}
