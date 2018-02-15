package packages_interfaces.labs.Animal;

public class GoHunt implements InterfaceExercise_01 {


    int timeHunting;
    int preyCaught;

    GoHunt () {
        timeHunting = 0;
        preyCaught = 0;

        // Every hour of hunting yields 2 kills

        preyCaught = timeHunting*2;

    }

   public boolean isAwake () {

        return true;
    }

    public int timeHunting () {

        return 3;
    }

    public int preyCaught () {

        return 1;
    }
}
