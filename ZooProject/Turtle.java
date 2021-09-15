public class Turtle extends Animal {

    // A turtle's shellsize can either be small, average, or big
    private String shellSize;

    public Turtle(String species, String name, int age, String shellSize) {
        super(species, name, age);
        setShellSize(shellSize);
    }

    public void setShellSize(String shellSize) {
        this.shellSize = shellSize;
    }

    public String getShellSize() {
        return this.shellSize;
    }
    
    public void call() {
        System.out.println("*hsssss *hsssss");
    }
}
