package hashmap;

import java.util.HashMap;

public class PhoneBook {

  private HashMap<String, String> book;

  PhoneBook() {
    book = new HashMap<>();
  }

  public void addContact(String contactPhoneNumber, String contactName) {
    book.put(contactPhoneNumber, contactName);
  }

  public void removeContact(String contactPhoneNumber) {
    book.remove(contactPhoneNumber);
  }

  public String getContact(String contactPhoneNumber) {
    return book.get(contactPhoneNumber);
  }
}
