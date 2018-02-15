package packages_interfaces.labs.Animal;

public class Sleep implements InterfaceExercise_01 {

    boolean isAwake = false;

    Sleep() {
        isAwake = false;


    }

    @Override
    public boolean isAwake() {
        return false;
    }

    @Override
    public int timeHunting() {
        return 0;
    }

    @Override
    public int preyCaught() {
        return 0;
    }
}



