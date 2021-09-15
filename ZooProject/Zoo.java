import java.util.ArrayList;

public class Zoo {

    ArrayList<Animal> animalTypes = new ArrayList<Animal>();
    ArrayList<Aardvark> aardvarks = new ArrayList<Aardvark>();
    ArrayList<Bat> bats = new ArrayList<Bat>();
    ArrayList<Bear> bears = new ArrayList<Bear>();
    ArrayList<Turtle> turtles = new ArrayList<Turtle>();

    public Zoo() {
        createExhibits();
    }

    public void createExhibits() {
        createAardvarkExhibit();
        createBatExhibit();
        createBearExhibit();
        createTurtleExhibit();
    }

    public void createAardvarkExhibit() {
        // Use this method to create a few Aardvark objects for the exhibit
        Aardvark arthur = new Aardvark("Aardvark", "Arthur Read", 8, "ants");
        Aardvark DW = new Aardvark("Aardvark", "D.W. Read", 6, "ants");
        Aardvark kate = new Aardvark("Aardvark", "Kate Read", 2, "termites");
        Aardvark david = new Aardvark("Aardvark", "David Read", 35, "termites");
        Aardvark jane = new Aardvark("Aardvark", "Jane Read", 33, "termites");
        Aardvark grandma_reed = new Aardvark("Aardvark", "Grandma Reed", 78, "ants");

        // Need to add 1 of each animal to the animalTypes arraylist
        animalTypes.add(arthur);

        // Now we need to add each aardvark to the exhibit
        aardvarks.add(arthur);
        aardvarks.add(DW);
        aardvarks.add(kate);
        aardvarks.add(david);
        aardvarks.add(jane);
        aardvarks.add(grandma_reed);
    }

    public void createBatExhibit() {
        Bat batty = new Bat("Bat", "Batty", 3, 1);
        Bat shadow = new Bat("Bat", "Shadow", 7, 2);
        Bat berty = new Bat("Bat", "Berty", 10, 2);
        Bat benny = new Bat("Bat", "Benny", 12, 2);
        Bat moon = new Bat("Bat", "Moon", 5, 1);
        Bat rabies = new Bat("Bat", "Rabies", 1, 1);
        Bat bruce = new Bat("Bat", "Bruce", 3, 1);
        Bat twilight = new Bat("Bat", "Twilight", 13, 2);

        // Add one bat to the animalTypes list
        animalTypes.add(batty);

        // Add all bats to the bats arraylist
        bats.add(batty);
        bats.add(shadow);
        bats.add(berty);
        bats.add(benny);
        bats.add(moon);
        bats.add(rabies);
        bats.add(bruce);
        bats.add(twilight);
    }

    public void createBearExhibit() {
        
    }

    public void createTurtleExhibit() {
        
    }
}
