public class Aardvark extends Animal {

  private String foodPreference;
  
  public Aardvark(String name, int age, String food) {
    super(name, age);
    setFoodPreference(food);
  }

  public void setFoodPreference(String food) {
    this.foodPreference = food;
  }

  public String getFoodPreferenec() {
    return this.foodPreference;
  }

  public void call() {
    System.out.println("OOOOOoooooooOOOOOOOOoooooooOOOOOO");
  }

  public enum aardvarkFoods {
    ants,
    termites
  }
}
