package de.hft_stuttgart.huto1bif.umlshop;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Rechnung implements MyRandom {

  private final Date date;
  private final int rechnungsNummer;
  private List<Artikel> artikelList;

  public Rechnung(Date date) {
    this.date = date;
    this.rechnungsNummer = randomNumber();
    this.artikelList = new ArrayList<>();
  }

  public Date getDate() {
    return date;
  }

  public int getRechnungsNummer() {
    return rechnungsNummer;
  }

  public List<Artikel> getArtikelList() {
    return artikelList;
  }

  public void addArtikel(Artikel artikel) {
    artikelList.add(artikel);
  }
}
