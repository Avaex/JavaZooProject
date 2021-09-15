public class Aardvark extends Animal {

  private String name;
  private String foodType;
  
  public Aardvark(String name, int age, String food) {
    super(age);
    this.setName(name);
    this.setFoodType(food);
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public void setFoodType(String foodType) {
    this.foodType = foodType;
  }

  public String getFoodType() {
    return this.foodType;
  }

  public void call() {
    System.out.println("OOOOOoooooooOOOOOOOOoooooooOOOOOO");
  }
}
