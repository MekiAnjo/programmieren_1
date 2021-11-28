package animals;

public abstract class Animal {

  private String name;
  private int age;

  Animal(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public abstract void move();

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }
}
