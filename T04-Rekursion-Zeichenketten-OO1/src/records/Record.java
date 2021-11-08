package records;

public class Record {

  private String title;
  private String artist;

  public Record(String title, String artist) {
    this.title = title;
    this.artist = artist;
  }

  public String getArtist() {
    return this.artist;
  }

  public String getTitle() {
    return this.title;
  }

  @Override
  public String toString() {
    return "[title=" + title + ", artist=" + artist + "]";
  }
}
