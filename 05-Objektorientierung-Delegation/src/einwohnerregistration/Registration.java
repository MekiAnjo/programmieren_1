package einwohnerregistration;

/**
 * Registration
 */
public class Registration {

  private String name;
  private static final int REGISTRATION_CAPACITY = 10;
  private Person[] userRegister = new Person[REGISTRATION_CAPACITY];

  public Registration(String name) {
    this.name = name;
  }

  private Person addPersonToRegister(Person person) {
    // userRegister[0] = person;
    // moveRegisterUp(1);

    for (int i = 0; i < userRegister.length; i++) {
      if (userRegister[i] == null) {
        userRegister[i] = person;
        return userRegister[i];
      }
    }
    System.err.println("Userregister ist voll");
    return null;
  }

  public boolean deletePerson(String name) {
    for (int i = 0; i < getUserRegister().length; i++) {
      if (userRegister[i].equals(getPersonByName(name))) {
        userRegister[i] = null;
        moveRegisterUp(i);
        return true;
      }
    }
    return false;
  }

  public String getName() {
    return this.name;
  }

  public Person getPersonByName(String name) {
    for (int i = 0; i < getUserRegister().length; i++) {
      if (userRegister[i].getName().equals(name)) {
        return userRegister[i];
      }
    }
    return null;
  }

  public Person[] getUserRegister() {
    return this.userRegister;
  }

  public Person movePerson(String name, String newCity, int newZip) {
    // getPersonByName(name).setAddress(new Address(newCity, newZip));
    getPersonByName(name).setAddress(newCity, newZip);
    return getPersonByName(name);
  }

  private void moveRegisterUp(int irgendeinInt) {
    // for (int i = getUserRegister().length; i != 0; i--) {
    //   if (userRegister[i] == null) {
    //     userRegister[i] = userRegister[i - 1];
    //     userRegister[i - 1] = null;
    //   }
    // }
    // if (userRegister[0] != null) {
    //   System.out.println("Das Userregister ist voll");
    // }

    for (int j = irgendeinInt + 1; j < userRegister.length; j++) {
      if (userRegister[j] == null) {
        userRegister[j - 1] = null;
        return;
      }
      userRegister[j - 1] = userRegister[j];
    }
  }

  public Person register(String name, String city, int zip) {
    return addPersonToRegister(new Person(name, new Address(city, zip)));
  }
}
