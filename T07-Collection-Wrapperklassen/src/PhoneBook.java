import java.util.HashMap;
import java.util.Iterator;

public class PhoneBook {

  /*
   * Even though it seems unintuitive at first, it is better to use the phone
   * number as the key, since phone numbers are unique. In this particular example, a
   * bidirectional map would be best, but unfortunately it is not included in the
   * Java Standard Library (see Google Guava library), therefore a
   * Hashmap<Long, String> is our best choice
   */
  private HashMap<Long, String> phoneBook;

  public PhoneBook() {
    phoneBook = new HashMap<>();
  }

  public void addContact(long number, String name) {
    phoneBook.put(number, name);
  }

  public HashMap<Long, String> getPhoneBook() {
    return phoneBook;
  }

  public void removeContact(long number) {
    phoneBook.remove(number);
  }

  public String getContact(long number) {
    return phoneBook.get(number);
  }

  public static void main(String[] args) {
    PhoneBook myContacts = new PhoneBook();
    myContacts.addContact(917756800l, "Donald Trump");
    myContacts.addContact(03022773534l, "Karl Lauterbach");
    myContacts.addContact(9177568000l, "Michaela Schmidt");
    myContacts.addContact(179882753l, "Bodo Bauer");
    myContacts.addContact(0617123456l, "Waldi Wuff");

    for (long number : myContacts.getPhoneBook().keySet()) {
      System.out.printf(
        "Name: %-18s Tel.:  %s %n",
        myContacts.getContact(number),
        number
      );
    }

    myContacts.removeContact(179882753l);

    for (long number : myContacts.getPhoneBook().keySet()) {
      System.out.printf(
        "Name: %-18s Tel.:  %s %n",
        myContacts.getContact(number),
        number
      );
    }

    if (myContacts.getPhoneBook().containsValue("Donald Trump")) {
      System.err.println("Mist.");
    }
  }
}
