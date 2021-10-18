package de.hft_stuttgart.huto1bif.aufgabe_7_1;

public class Buch {

  private String titel;
  private String autor;
  private int isbn;
  private boolean ausgeliehen;

  public Buch(String titel, String autor, int isbn) {
    this.titel = titel;
    this.autor = autor;
    this.isbn = isbn;
    this.ausgeliehen = false;
  }

  public boolean isAusgeliehen() {
    return ausgeliehen;
  }

  public String getAutor() {
    return autor;
  }

  public int getIsbn() {
    return isbn;
  }

  public String getTitel() {
    return titel;
  }

  public void setAusgeliehen(boolean ausgeliehen) {
    this.ausgeliehen = ausgeliehen;
  }

  @Override
  public String toString() {
    return (
      this.getTitel() +
      " von " +
      this.getAutor() +
      " mit ISBN:" +
      this.getIsbn()
    );
  }

  public boolean equals(Object o) {
    Buch b = (Buch) o;
    if (b.isbn == this.isbn) {
      return true;
    } else {
      return false;
    }
  }
}
