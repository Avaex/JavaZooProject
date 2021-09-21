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
    setHungerLevel();
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

  // Sets the initial hunger level to a random number between 1 and 100
  public void setHungerLevel() {
    Random rand = new Random();
    int randNum = 1 + rand.nextInt(100);

    this.hungerLevel = randNum;
  }

  // Adds the passed in number to the animal's hunger level.
  // If the animal's hunger level is above 100, print out that it is full and set hungerLevel to 100
  public void setHungerLevel(int level) {
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
