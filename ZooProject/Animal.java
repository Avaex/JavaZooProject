import java.util.Random;

public abstract class Animal {
  
  private String name;
  private String species;
  private int hungerLevel;
  private int age;

  // Initial constructor
  public Animal(String species, String name, int age) {
    setName(name);
    setSpecies(species);
    setHunger();
    setAge(age);
  }

  public void setSpecies(String species) {
    this.species = species;
  }

  public String getSpecies() {
    return this.species;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public void setHunger() {
    // We set hunger level to a random number between 1 and 100
    Random rand = new Random();
    int randNum = 1 + rand.nextInt(100);

    this.hungerLevel = randNum;
  }

  public void setHunger(int level) {

    if (this.hungerLevel + level > 100) {
      System.out.println(this.getName() + " is feeling full!");
      this.hungerLevel = 100;
    } else {
      this.hungerLevel += level;
    }
  }

  public int getHungerLevel() {
    return this.hungerLevel;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public int getAge() {
    return this.age;
  }

  public abstract String call();
}
