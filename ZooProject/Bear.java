public class Bear extends Animal {

    // Type determines what kind of bear this is, such as black bear,
    // grizzly bear, polar bear, etc.
    private String type;
    // Color is simply the color of the bear
    private String color;

    public Bear(String species, String name, int age, String type, String color) {
        super(species, name, age);
        setSpecies(species);
        setColor(color);
        setType(type);
    }

    public void setType(String type) {
        this.type = type;
    }
    
    public String getType() {
        return this.type;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    // Bears have a unique setHunger method. This method overrides the parent class in order to allow bears to eat more before feeling full.
    // A bear's hunger level must be 150 to feel full, rather than 100 like the other animals.
    @Override
    public void setHungerLevel(int level) {
        if (super.getHungerLevel() + level > 150) {
            System.out.println(super.getName() + " is feeling full!");
            super.setHungerLevel(100);
        } else {
            super.setHungerLevel(super.getHungerLevel() + level);
        }
    }

    public String call() {
        return "*grrr *ROOOOOOOAR";
    }
}
