public class Bat extends Animal {
  
  public Bat(String name, int age) {
    super(name, age);
    this.setName(name);
  }

  public void call() {
    System.out.println("*click *click *click *click");
  }
}
