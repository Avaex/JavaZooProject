public class Turtle extends Animal {

    private String shellSize;

    public Turtle(String name, int age, String shellSize) {
        super(name, age);
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
