package objects_classes_methods.labs;

/**
 * Objects, Classes and Methods Exercise 1:
 *
 *      Create three classes, all of which can be inside this file. The first class (the controller)
 *      should have the main method. The main method should create at least two objects using the
 *      constructors of the second and third class. The second and third class should each have at least
 *      three instance variables that should be set using the constructor when an object is created.
 *
 *      Once the objects are created, try changing the values of some of the instance variables.
 *
 *      Think about some of the examples we have seen from the lectures or Confluence Docs.
 *
 *      Be creative. Have some fun. Using Java objects you can model just about anything you want.
 *      Cars, animals, poker games, sports teams, trees, beers, people and so on.
 */

class Player {

     private String lastName; // players last name
     private String team;    // player teaam
     private int jerseyNumber;     // player number

    Player(String lastName, String team, int number) {
        this.lastName = lastName;
        this.team = team;
        this.jerseyNumber = number;

    }

    Player(String lastName, int number) {
        this.lastName = lastName;
        this.jerseyNumber = number;

    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public int getJerseyNumber() {
        return jerseyNumber;
    }

    public void setJerseyNumber(int jerseyNumber) {
        this.jerseyNumber = jerseyNumber;
    }

    @Override
    public String toString() {
        return "Player{" +
                "lastName='" + lastName + '\'' +
                ", team='" + team + '\'' +
                ", jerseyNumber=" + jerseyNumber +
                '}';
    }
}



class PlayerDemo {
    public static void main(String args[]) {

        Player curry = new Player("curry", "GSW", 23);
        Player james = new Player("James", "cavs", 24);

        System.out.println(curry.getLastName() + ", wearing the number " + curry.getJerseyNumber() + ", plays for " + curry.getTeam());
        System.out.println(james.getLastName() + ", wearing the number " + james.getJerseyNumber() + ", plays for " + james.getTeam());

        curry.setTeam("Jazz");


    }
}







