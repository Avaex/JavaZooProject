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

    public void call() {
        System.out.println("*grrr *ROOOOOOOAR");
    }
}
