package einwohnerregistration;

public class Main {

  public static void main(String[] args) {
    var register1 = new Registration("Register1");
    register1.register("Tony", "Schwieberdingen", 71701);
    register1.register("Robert", "Schwieberdingen", 71701);
    register1.register("Tobias", "Schwieberdingen", 71701);
    register1.register("Alex", "Stuttgart", 70376);

    register1.deletePerson("Robert");

    register1.movePerson("Tony", "Stuttgart", 70376);

    System.out.println(register1.getUserRegister());
  }
}
