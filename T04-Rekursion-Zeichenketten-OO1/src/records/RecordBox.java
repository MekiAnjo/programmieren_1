package records;

public class RecordBox {

  private Record[] recordStorage = new Record[10];
  private static int index = 0;

  public void addRecord(Record record) {
    if (isFull()) {
      System.out.println(
        "Die Kiste ist voll, es müssen erst wieder Platten entfernt werden"
      );
      return;
    }
    for (int i = 0; i < recordStorage.length; i++) {
      if (recordStorage[i] == null) {
        recordStorage[i] = record;
        System.out.println(record + " wurde hinzugefügt");
        break;
      }
    }
    index++;
  }

  public void printBoxContent() {
    if (index == 0) {
      System.out.println("Die Kiste ist leer, füge Platten hinzu");
      return;
    }
    System.out.println("Schallplattenkisten Inhalt:");
    for (int i = 0; i < recordStorage.length; i++) {
      if (recordStorage[i] == null) {
        System.out.println((i + 1) + ": -");
        continue;
      }
      System.out.println((i + 1) + ": " + recordStorage[i]);
    }
  }

  public void removeRecord(int index) {
    if (
      index < 0 ||
      index > recordStorage.length - 1 ||
      recordStorage[index] == null
    ) {
      throw new IllegalArgumentException("Invalid index");
    }
    if (index == 0) {
      System.out.println("Die Kiste ist leer, füge Platten hinzu");
      return;
    }

    System.arraycopy(
      recordStorage,
      index + 1,
      recordStorage,
      index,
      recordStorage.length - (index + 1)
    );
    recordStorage[recordStorage.length - 1] = null;
    index--;
  }

  public boolean isFull() {
    return index == recordStorage.length - 1;
  }
}
