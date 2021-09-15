public class Bear extends Animal {

    private String species;
    private String color;

    public Bear(String name, int age, String species, String color) {
        super(name, age);
        setSpecies(species);
        setColor(color);
    }

    public void setSpecies(String species) {
        this.species = species;
    }
    
    public String getSpecies() {
        return this.species;
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
