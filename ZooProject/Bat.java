public class Bat extends Animal {

  private String name;
  
  public Bat(String name, int age) {
    super(age);
    this.setName(name);
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public void call() {
    System.out.println("*click *click *click *click");
  }
}
