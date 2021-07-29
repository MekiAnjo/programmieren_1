package aufgabe1;

public class Programm {

  public static void main(String[] args) {
    GeometrischeFigur[] meineGeoFiguren = new GeometrischeFigur[4];
    meineGeoFiguren[0] = new Kreis(10, 10, 40);
    meineGeoFiguren[1] = new Quadrat(600, 60, 10);
    meineGeoFiguren[2] = new Rechteck(10, 20, 100, 20);
    meineGeoFiguren[3] = new Gerade(15, 20, 80, 90);
    
    // Ab java 14
    for (GeometrischeFigur geometrischeFigur : meineGeoFiguren) {
      if (geometrischeFigur instanceof FigurMitFlaeche fig) {
        System.out.println(fig.flaecheBerechnen());
      }
    }
    // Vor java 14
    for (GeometrischeFigur geometrischeFigur : meineGeoFiguren) {
      if (geometrischeFigur instanceof FigurMitFlaeche) {
        System.out.println(
          ((FigurMitFlaeche) geometrischeFigur).flaecheBerechnen()
        );
      }
    }
  }
}
