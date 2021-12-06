public enum Month {
  JANUARY("Januar", 1),
  FEBRUARY("Februar", 2),
  MARCH("März", 3),
  APRIL("April", 4),
  MAY("Mai", 5),
  JUNE("Juni", 6),
  JULY("Juli", 7),
  AUGUST("August", 8),
  SEPTEMBER("September", 9),
  OCTOBER("Oktober", 10),
  NOVEMBER("November", 11),
  DECEMBER("Dezember", 12);

  private String germanMonth;
  private int monthNumber;

  Month(String germanMonth, int monthNumber) {
    this.germanMonth = germanMonth;
    this.monthNumber = monthNumber;
  }

  public String getGermanMonth() {
    return this.germanMonth;
  }

  public int getMonthNumber() {
    return monthNumber;
  }

  class In {}
}
