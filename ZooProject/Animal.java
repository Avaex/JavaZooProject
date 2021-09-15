public abstract class Animal {
  
  private String name;
  private String health;
  private String species;
  private int hungerLevel;
  private int age;

  // Initial constructor
  public Animal(String species, String name, int age) {
    setSpecies(species);
    setHealth(health);
    setHunger(50);
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

  public void setHealth(String s) {
    this.health = s;
  }

  public String getHealth() {
    return this.health;
  }

  public void setHunger(int level) {
    // Add the new 
    this.hungerLevel += level;

    if (this.hungerLevel > 100) {
      this.hungerLevel = 100;
    }

    if (this.hungerLevel < 15) {
      setHealth("bad");
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

  public abstract void call();
}
