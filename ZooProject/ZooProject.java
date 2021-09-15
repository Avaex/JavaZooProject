import java.util.Scanner;

public class ZooProject {
  public static void main(String args[]) {
    System.out.println();
    System.out.println("Hello, and welcome to the zoo!");
    System.out.println("---------------------------------------------");

    Scanner sc = new Scanner(System.in);

    System.out.println("Please choose one of the following options: ");
    System.out.println("1. Go on a guided tour");
    System.out.println("2. Visit a specific animal exhibit");

    String userChoice = sc.nextLine();
    if (userChoice.equals("1")) {
      guidedTour();
    } else if (userChoice.equals("2")) {
      System.out.println();
      System.out.println("Please choose an animal exhibit to visit: ");
      System.out.println("1. Aardvarks");
      System.out.println("2. Bats");
      System.out.println("3. Bears");

      String exhibitChoice = sc.nextLine();
      int exhibitChoiceInt = Integer.parseInt(exhibitChoice);
      visitExhibit(exhibitChoiceInt);

    } else {
      System.out.println("Invalid choice. Please try again.");
      System.exit(-1);
    }

    sc.close();

  }

  public static void guidedTour() {
    System.out.println();
    System.out.println("---------------------------------------------");
    System.out.println("Welcome to the guided tour for the zoo!");
  }

  public static void visitExhibit(int exhibitNum) {
    System.out.println();
    System.out.println("---------------------------------------------");
    System.out.println("You have chosen exhibit number " + exhibitNum);

    if (exhibitNum == 1) {
      System.out.println("Going to the aardvark exhibit!");
      visitAardvarks();
    } else if (exhibitNum == 2) {
      System.out.println("Going to the bat exhibit!");
      visitBats();
    } else if (exhibitNum == 3) {
      System.out.println("Going to the bear exhibit!");
    }
  }

  public static void visitAardvarks() {
    System.out.println();
    System.out.println("       _.---._    /\\");
    System.out.println("    ./'       \"--`\\//");
    System.out.println("  ./              o \\          .--------.");
    System.out.println(" /./\\  )______   \\__ \\        ( help us! )");
    System.out.println("./  / /\\ \\   | \\ \\  \\ \\       /`--------'");
    System.out.println("   / /  \\ \\  | |\\ \\  \\7--- ooo ooo ooo ooo ooo ooo");
    System.out.println();
    System.out.println();

    Aardvark perry = new Aardvark("Arthur", 2, "ants");
    System.out.println("Aardvark name: " + perry.getName());
    System.out.println("Age: " + perry.getAge());
    perry.call();
  }

  public static void visitBats() {
    System.out.println("    =/\\                 /\\=");
    System.out.println("    / \\'._   (\\_/)   _.'/ \\");
    System.out.println("   / .''._'--(o.o)--'_.''. \\");
    System.out.println("  /.' _/ |`'=/ \" \\='`| \\_ `.\\");
    //System.out.println(" /` .' `\\;-,'\\___/',-;/` '. '\\");
    System.out.println(" /` .' `\\;-,'\\___/',-;/` '. '\\");
    System.out.println("/.-'       `\\(-V-)/`       `-.\\");
    System.out.println("`            \"   \"            `");
    System.out.println();
    System.out.println();

    Bat batty = new Bat("Batty", 3);
    System.out.println("Bat name: " + batty.getName());
    System.out.println("Age: " + batty.getAge());
    batty.call();
  }
}