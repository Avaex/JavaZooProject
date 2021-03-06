public class Bat extends Animal {
  
  // Bat box number determines which bat box this bat lives in
  private int batBoxNum;
  
  public Bat(String species, String name, int age, int batBoxNum) {
    super(species, name, age);
    setBatBoxNum(batBoxNum);
  }

  // All bats live in one of two bat boxes: BatBox1 or BatBox2
  public void setBatBoxNum(int batBoxNum) {
    this.batBoxNum = batBoxNum;
  }

  public int getBatBoxNum() {
    return this.batBoxNum;
  }

  public String call() {
    return "*click *click *click *click";
  }
}
