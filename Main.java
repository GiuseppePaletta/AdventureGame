import java.util.Scanner;

public class Main {

    public static void main(String[] args)  throws InterruptedException {

        //  Objekt Player wird erstellt mit Health=100

        Player player = new Player();

        // Player darf seinen Namen eingeben

        Scanner my_scanner = new Scanner(System.in);
        System.out.println("Enter Player 1 Name");

        String PlayerName = my_scanner.nextLine();
        player.setName(PlayerName);

        System.out.println("The selected Name is " + player.getName());

        // Level 1 wird gestartet

        Level_1 level_1 = new Level_1();
        level_1.Level_1_Message();

        // Spieler wählt Handlungsoption aus

        System.out.println("Please enter your choice: ");

        int PlayersChoiceLevel_1 = my_scanner.nextInt();
        level_1.setPlayerChoiceLevel_1(PlayersChoiceLevel_1);
        level_1.FirstObstacle(PlayersChoiceLevel_1, player);

        // Test des aktuellen Wertes
        System.out.println(player.getHealth());

        /// Test

        int x = 3;
    }
}


