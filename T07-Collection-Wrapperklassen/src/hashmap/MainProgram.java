package hashmap;

import java.util.stream.Stream;

public class MainProgram {

  public static void main(String[] args) {
    PhoneBook gelbeSeiten = new PhoneBook();

    gelbeSeiten.addContact("(557) 658-2870", "Abbie Simon");
    gelbeSeiten.addContact("(822) 855-8968", "Charlie Hart");
    gelbeSeiten.addContact("(668) 618-5159", "Leah Daniels");

    Stream
      .of(gelbeSeiten)
      .forEach(x -> System.out.println(x.getContact("(557) 658-2870")));
  }
}
