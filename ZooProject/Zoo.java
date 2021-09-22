import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Zoo {

    Scanner sc = new Scanner(System.in);
    Random rand = new Random();

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
        // Use this method to create Aardvark objects for the exhibit
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
        // Create all Bat objects for the exhibit
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
        // Create Bear objects for the exhibit
        Bear smokey = new Bear("Bear", "Smokey", 35, "Black", "Brown");
        Bear misha = new Bear("Bear", "Misha", 10, "Polar", "White");
        Bear grizzly399 = new Bear("Bear", "Grizzly 399", 24, "Grizzly", "Brown");
        Bear po = new Bear("Bear", "Po", 15, "Panda", "Black/White");

        // Add one bear to the animalTypes list
        animalTypes.add(smokey);

        // Add all bears to the bears list
        bears.add(smokey);
        bears.add(misha);
        bears.add(grizzly399);
        bears.add(po);
    }

    public void createTurtleExhibit() {
        // Create turtle objects for the exhibit
        Turtle franklin = new Turtle("Turtle", "Franklin", 6, "small");
        Turtle squirt = new Turtle("Turtle", "Squirt", 5, "small");
        Turtle crush = new Turtle("Turtle", "Crush", 100, "large");
        Turtle koopa = new Turtle("Turtle", "Koopa", 36, "medium");

        // Add a Turtle to the animalTypes list
        animalTypes.add(franklin);

        // Add all Turtles to the turtles list
        turtles.add(franklin);
        turtles.add(squirt);
        turtles.add(crush);
        turtles.add(koopa);
    }

    public void tourAardvarks() {
        // Tours the aardvark exhibit
        // Stay in this exhibit until the user wants to leave
        
        System.out.println("Hello and welcome to the Aardvark exhibit!");
        System.out.println();

        // Makes sure there are actually aardvark objects in the exhibit
        if (aardvarks.isEmpty()) {
            System.out.println("Something went wrong. No aardvark objects created. Exiting.");
            System.exit(-1);
        }

        while (true) {
            System.out.println();
            System.out.println("How would you like to interact with the exhibit?");
            System.out.println("1. Meet the animals");
            System.out.println("2. Feed the aardvarks some food");
            System.out.println("3. Attempt to talk to the aardvarks");
            System.out.println("4. Hear an aardvark fact");
            System.out.println("5. Leave this exhibit");

            String userChoice = sc.nextLine();

            if (userChoice.equals("1")) {
                meetAnimals(1);
            } else if (userChoice.equals("2")) {
                // Loop through all animals in the exhibit and give a random type of food to each
                // If the animal prefers another type of food, skip that animal and go to the next
                System.out.println("Let's feed the aardvarks!");

                // Food choice is chosen at random
                int foodChoice = 1 + rand.nextInt(2);

                // Food choice == 1 means the aardvarks are fed ants
                if (foodChoice == 1) {
                    System.out.println("Feeding the aardvarks ants!");
                // Food choice == 2 means the aardvarks are fed termites
                } else {
                    System.out.println("Feeding the aardvarks termites!");
                }
                for (Aardvark a : aardvarks) {
                    System.out.println();
                    // Food choice is ants, check to see if this aardvark likes ants
                    if (foodChoice == 1) {
                        if (a.getFoodPreferenec().equals("ants")) {
                            System.out.println(a.getName() + " likes the ants!");
                            a.setHungerLevel(15);
                        } else {
                            System.out.println(a.getName() + " does not like ants!");
                        }
                    // Food choice is termites, check to see if this aardvark likes termites
                    } else if (foodChoice == 2) {
                        if (a.getFoodPreferenec().equals("termites")) {
                            System.out.println(a.getName() + " likes termites!");
                            a.setHungerLevel(15);
                        } else {
                            System.out.println(a.getName() + " does not like termites!");
                        }
                    }
                }

            } else if (userChoice.equals("3")) {   
                talkAnimals(1);
            } else if (userChoice.equals("4")) {
                System.out.println("Aardvark facts: ");
                System.out.println();
                
                // Fact is randomly chosen
                int randNum = 1 + rand.nextInt(3);
                if (randNum == 1) {
                    System.out.println("Aardvarks are solitary animals and only come together to mate.");
                } else if (randNum == 2) {
                    System.out.println("Aardvarks are nocturnal which means they sleep during the day.");
                } else if (randNum == 3) {
                    System.out.println("Aardvarks are also called ant bears");
                } else {
                    System.out.println("Aardvarks have four toes on the front feet and five toes on their back feet.");
                }
            } else if (userChoice.equals("5")) {
                System.out.println("Leaving aardvark exhibit");
                break;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
    } 
    
    public void tourBats() {

        System.out.println("Hello and welcome to the bat exhibit!");
        System.out.println();

        if (bats.isEmpty()) {
            System.out.println("Error: no bats in exhibit. Please try again.");
            System.exit(-1);
        }

        while (true) {
            System.out.println();
            System.out.println("How would you like to interact with the exhibit?");
            System.out.println("1. Meet the bats");
            System.out.println("2. Attempt to talk to the bats");
            System.out.println("3. Hear a bat fact");
            System.out.println("4. Leave this exhibit");

            String userChoice = sc.nextLine();

            if (userChoice.equals("1")) {  
                meetAnimals(2);
            } else if (userChoice.equals("2")) {
                talkAnimals(2);
            } else if (userChoice.equals("3")) {
                System.out.println("Bat facts: ");
                System.out.println();
                int randNum = 1 + rand.nextInt(3);
                
                if (randNum == 1) {
                    System.out.println("Bats can live more than 30 years and can fly at speeds of 60 miles per hour (or more!).");
                } else if (randNum == 2) {
                    System.out.println("Bats can eat up to 1,200 mosquitoes an hour.");
                } else {
                    System.out.println("More than half of the bat species in the United States are in severe decline or listed as endangered.");
                }
            } else if (userChoice.equals("4")) {
                System.out.println("Exiting exhibit");
                break;
            } else {
                System.out.println("Invalid choice, please try again");
            }
        }
    }

    public void tourBears() {

        System.out.println("Welcome to the bear exhibit!");
        System.out.println();

        if (bears.isEmpty()) {
            System.out.println("Error: no bears in exhibit. Exiting.");
            System.exit(-1);
        }

        while (true) {
            System.out.println();
            System.out.println("How would you like to interact with the exhibit?");
            System.out.println("1. Meet the bears");
            System.out.println("2. Attempt to talk to the bears");
            System.out.println("3. Hear a bear fact");
            System.out.println("4. Attempt to feed the bears");
            System.out.println("5. Leave the exhibit");

            String userChoice = sc.nextLine();

            if (userChoice.equals("1")) {
                meetAnimals(3);
            } else if (userChoice.equals("2")) {
                talkAnimals(3);
            } else if (userChoice.equals("3")) {
                System.out.println("Bear facts: ");
                System.out.println();
                int randNum = 1 + rand.nextInt(2);

                if (randNum == 1) {
                    System.out.println("Unlike many mammals, bears can see in color.");
                } else if (randNum == 2) {
                    System.out.println("A swimming polar bear can jump 8 ft. (2.4 m) out of the water to surprise a seal.");
                } else {
                    System.out.println("Bears have non-retractable claws like dogs and unlike cats.");
                }
            } else if (userChoice.equals("4")) {
                for (Bear b : bears) {
                    System.out.println();
                    System.out.println("Feeding " + b.getName() + " some food!");
                    b.setHungerLevel(20);
                }
            } else if (userChoice.equals("5")) {
                System.out.println("Leaving the exhibit");
                break;
            } else {
                System.out.println("Invalid choice, try again.");
            }
        }
    }

    public void tourTurtles() {

        System.out.println("Welcome to the turtle exhibit!");
        System.out.println();

        if (turtles.isEmpty()) {
            System.out.println("Error. No turtles in the exhibit. Exiting.");
            System.exit(-1);
        }

        while (true) {
            
            System.out.println();
            System.out.println("How would you like to interact with the exhibit?");
            System.out.println("1. Meet the turtles");
            System.out.println("2. Attempt to talk to the turtles");
            System.out.println("3. Hear a turtle fact");
            System.out.println("4. Leave the exhibit");

            String userChoice = sc.nextLine();

            if (userChoice.equals("1")) {
                meetAnimals(4);
            } else if (userChoice.equals("2")) {
                talkAnimals(4);
            } else if (userChoice.equals("3")) {
                System.out.println("Turtle facts: ");
                System.out.println();

                int randNum = 1 + rand.nextInt(2);

                if (randNum == 1) {
                    System.out.println("Sea turtles lay their eggs in a nest they dig in the sand with their" +  
                    " rear flippers. The group of eggs is called a clutch.");
                } else if (randNum == 2) {
                    System.out.println("Sea turtles don’t retract into their shells.");
                } else {
                    System.out.println("Just like your bones, a turtle’s shell is actually part of its skeleton." +  
                    " It’s made up of over 50 bones which include the turtle’s rib cage and spine.");
                }

            } else if (userChoice.equals("4")) {
                System.out.println("Leaving the exhibit");
                break;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public void meetAnimals(int exhibitNum) {

        if (exhibitNum == 1) { // exhibitNum == 1 is for aardvarks
            System.out.println("Let's meet the aardvarks!");
            for (Aardvark a : aardvarks) {
                System.out.println();
                System.out.println("Name: " + a.getName());
                System.out.println("Age: " + a.getAge());
                System.out.println("Food preference: " + a.getFoodPreferenec());
            }
        } else if (exhibitNum == 2) { // exhibitNum == 2 is for bats
            System.out.println("Let's meet the bats!");
            System.out.println("First, let's look at bat box 1: ");
            for (Bat b : bats) {
                if (b.getBatBoxNum() == 1) {
                    System.out.println();
                    System.out.println("Name: " + b.getName());
                    System.out.println("Age: " + b.getAge());
                }
            }

            System.out.println();
            System.out.println("Now let's look at bat box 2");
            for (Bat b : bats) {
                if (b.getBatBoxNum() == 2) {
                    System.out.println();
                    System.out.println("Name: " + b.getName());
                    System.out.println("Age: " + b.getAge());
                }
            }
        } else if (exhibitNum == 3) { // exhibitNum == 3 is for bears
            System.out.println("Let's meet the bears!");
            for (Bear b : bears) {
                System.out.println();
                System.out.println("Name: " + b.getName());
                System.out.println("Age: " + b.getAge());
                System.out.println("Type: " + b.getType());
                System.out.println("Color: " + b.getColor());
            }
        } else if (exhibitNum == 4) { // exhibitNum == 4 is for turtles
            System.out.println("Let's meet the turtles!");
            for (Turtle t : turtles) {
                System.out.println();
                System.out.println("Name: " + t.getName());
                System.out.println("Age: " + t.getAge());
                System.out.println("Shell size: " + t.getShellSize());
            }
        } else {
            System.out.println("Error specifying exhibit to meet. Try again");
        }
    }

    public void talkAnimals(int exhibitNum) {

        // When attempting to speak with the animals, each animal has a 1/10 chance of saying something back.
        // The animal talks back using the call() method

        if (exhibitNum == 1) {
            System.out.println("Let's talk to the aardvarks!");

            for (Aardvark a : aardvarks) {
                int randNum = 1 + rand.nextInt(10);
                System.out.println();

                if (randNum == 1) {
                    System.out.println("You attempt to speak with aardvark " + a.getName());
                    System.out.println("They speak back!");
                    System.out.println(a.getName() + " says " + a.call());
                } else {
                    System.out.println("You attempt to speak with aardvark " + a.getName());
                    System.out.println("It didn't work...");
                }
            }
        } else if (exhibitNum == 2) {
            System.out.println("Let's talk to the bats!");

            for (Bat b : bats) {
                int randNum = 1 + rand.nextInt(10);
                System.out.println();

                if (randNum == 1) {
                    System.out.println("You attempt to speak with bat " + b.getName());
                    System.out.println("They speak back!");
                    System.out.println(b.getName() + " says " + b.call());
                } else {
                    System.out.println("You attempt to speak with bat " + b.getName());
                    System.out.println("It didn't work...");
                }
            }
        } else if (exhibitNum == 3) {
            System.out.println("Let's talk to the bears!");

            for (Bear b : bears) {
                int randNum = 1 + rand.nextInt(10);
                System.out.println();

                if (randNum == 1) {
                    System.out.println("You attempt to speak with bear " + b.getName());
                    System.out.println("They speak back!");
                    System.out.println(b.getName() + " says " + b.call());
                } else {
                    System.out.println("You attempt to speak with bear " + b.getName());
                    System.out.println("It didn't work...");
                }
            }
        } else if (exhibitNum == 4) {
            System.out.println("Let's talk to the turtles!");

            for (Turtle t : turtles) {
                int randNum = 1 + rand.nextInt(10);
                System.out.println();

                if (randNum == 1) {
                    System.out.println("You attempt to speak with turtle " + t.getName());
                    System.out.println("They speak back!");
                    System.out.println(t.getName() + " says " + t.call());
                } else {
                    System.out.println("You attempt to speak with turtle " + t.getName());
                    System.out.println("It didn't work...");
                }
            }
        } else {
            System.out.println("Error attempting to talk to animals.");
        }
    }
}
