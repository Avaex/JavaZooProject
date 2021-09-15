import java.util.Scanner;

public class ZooProject {

  static Zoo zoo;
  public static void main(String args[]) {

    zoo = new Zoo();

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
      System.out.println("4. Turtles");

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
      visitBears();
    } else if (exhibitNum == 4) {
      System.out.println("Going to the turtle exhibit!");
      visitTurtles();
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

    zoo.tourAardvarks();

  }

  public static void visitBats() {
    System.out.println("    =/\\                 /\\=");
    System.out.println("    / \\'._   (\\_/)   _.'/ \\");
    System.out.println("   / .''._'--(o.o)--'_.''. \\");
    System.out.println("  /.' _/ |`'=/ \" \\='`| \\_ `.\\");
    System.out.println(" /` .' `\\;-,'\\___/',-;/` '. '\\");
    System.out.println("/.-'       `\\(-V-)/`       `-.\\");
    System.out.println("`            \"   \"            `");
    System.out.println();

  }

  public static void visitBears() {
    System.out.println(" __         __");
    System.out.println("/  \\.-\"\"\"-./  \\");
    System.out.println("\\    -   -    /");
    System.out.println(" |   o   o   |");
    System.out.println(" \\  .-'''-.  /");
    System.out.println("  '-\\__Y__/-'");
    System.out.println("     `---`");
  }

  public static void visitTurtles() {
    System.out.println("                    __");
    System.out.println("         .,-;-;-,. /'_\\");
    System.out.println("       _/_/_/_|_\\_\\) /");
    System.out.println("     '-<_><_><_><_>=/\\");
    System.out.println("       `/_/====/_/-'\\_\\");
    System.out.println("        \"\"     \"\"    \"\"");
    System.out.println("");
  }
}