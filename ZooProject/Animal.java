public abstract class Animal {
  
  private String health;
  private int hungerLevel;
  private int age;

  // Initial constructor
  public Animal(int age) {
    setHealth(health);
    setHunger(50);
    setAge(age);
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
