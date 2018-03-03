package Game;
import java.util.Scanner;

public class Game {
    public static void main(String[] args)
    {
        Player player1 = new Player(100, "", 1);
        Player player2 = new Player(100, "",1);

        Weapon mace = new Weapon(100, .2);
        Weapon sword = new Weapon(30, .5);
        Weapon spear = new Weapon(20, .8);

        System.out.println("********* WELCOME TO JOHN'S FIRST GAME EVER! *********");
        System.out.println();
        System.out.println(" RULES: Each player has 100 health. Choose your weapon wisely and fight to the death!");
        System.out.println("-------------------------------------------------------------------------------------");
        System.out.println();

        // create scanner
        Scanner scanner = new Scanner(System.in);

        // prompt Players
        System.out.print("Player 1: What is your name? ");
        // assign input to variable as string
        player1.setName(scanner.nextLine());

        System.out.print("Player 2: What is your name? ");
        player2.setName(scanner.nextLine());
        System.out.println();

        // Prompt players to choose a weapon from list. Provide stats on weapons by pressing 's' key.
        System.out.println(player1.getName() + ", " + player2.getName() + " Choose your Weapon by inputting the corresponding number: ");
        System.out.println("(1) Mace - Damage: 100, Accuracy: 20% ");
        System.out.println("(2) Sword - Damage: 34, Accuracy: 50% ");
        System.out.println("(3) Spear - Damage: 20, Accuracy: 80% ");
        System.out.println();


        // Prompt Player1 to choose weapon
        do {
            System.out.println(player1.getName() + ", Choose your Weapon: ");
            player1.setWeapon(scanner.nextInt());
            System.out.println();
        }
        while(player1.getWeapon() > 3);

        // Prompt Player2 to choose weapon
        do {
            System.out.println(player2.getName() + ", Choose your Weapon: ");
            player2.setWeapon(scanner.nextInt());
            System.out.println();
        }
        while(player2.getWeapon() > 3);


        // Summarize choices and prompt players to begin
        System.out.println(player1.getName() + " chose " + player1.getWeapon() + " and " + player2.getName() + " chose " + player2.getWeapon() + "!");
        System.out.println();
        System.out.println("Ready? Hit F to begin battle!");

        }
    }

