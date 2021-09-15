public class Bat extends Animal {
  
  // Bat box number determines which bat box this bat lives in
  private int batBoxNum;
  
  public Bat(String species, String name, int age, int batBoxNum) {
    super(species, name, age);
    setBatBoxNum(batBoxNum);
  }

  public void setBatBoxNum(int batBoxNum) {
    this.batBoxNum = batBoxNum;
  }

  public int getBatBoxNum() {
    return this.batBoxNum;
  }

  public void call() {
    System.out.println("*click *click *click *click");
  }
}
