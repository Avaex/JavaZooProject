public class Aardvark extends Animal {

  // Aardvarks like to eat either termites or ants
  private String foodPreference;
  
  public Aardvark(String species, String name, int age, String food) {
    super(species, name, age);
    setFoodPreference(food);
  }

  public void setFoodPreference(String food) {
    this.foodPreference = food;
  }

  public String getFoodPreferenec() {
    return this.foodPreference;
  }

  public String call() {
    return "OOOOOoooooooOOOOOOOOoooooooOOOOOO";
  }
}
