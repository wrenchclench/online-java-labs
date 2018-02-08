package objects_classes_methods.labs;

/**
 * Objects, Classes and Methods Exercise 4:
 *
 *      Demonstrate method overloading with at least three overloaded methods.
 *
 */

class Player2 {

    public String lastName; // players last name
    public String team;    // player teaam
    public int jerseyNumber;  //player number
    public double avgscore;// avg points
    public boolean rookie; // rookie?
    public double avgrebs; // avg rebounds


    Player2(String lastName, String team, int number) {
        this.lastName = lastName;
        this.team = team;
        this.jerseyNumber = number;
    }

    Player2(String lastName, String team, int number, double avgscore) {
        this.lastName = lastName;
        this.team = team;
        this.jerseyNumber = number;
        this.avgscore = avgscore;

    }

    Player2(String lastName, String team, int number, double avgscore, boolean rookie) {
        this.lastName = lastName;
        this.team = team;
        this.jerseyNumber = number;
        this.avgscore = avgscore;
        this.rookie = rookie;
    }

    Player2(String lastName, String team, int number, double avgscore, boolean rookie, double avgrebs) {
        this.lastName = lastName;
        this.team = team;
        this.jerseyNumber = number;
        this.avgscore = avgscore;
        this.rookie = rookie;
        this.avgrebs = avgrebs;
    }
}

class Player2Demo {
    public void main(String[] args) {

        Player2 derozan = new Player2("Derozan", "Raptors", 10, 34.5, false, 9.2);
        System.out.println(derozan.lastName + " plays for the " + derozan.team + " and averages " + derozan.avgscore + " points per game.");
    }
}


