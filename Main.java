import java.util.Scanner;

public class Main {

    private static Scanner Myscanner = new Scanner(System.in);


    public static void main(String[] args)  throws InterruptedException {

        //  Objekt Player wird erstellt mit Health=100

        Player player = new Player();

        // Player darf seinen Namen eingeben

        System.out.println("What is your name brave adventurer?");

        String PlayerName = Myscanner.nextLine();
        player.setName(PlayerName);

        // Level 1 wird gestartet

        Level_1 level_1 = new Level_1();
        level_1.Level_1_Message(player);

        // Spieler wählt Handlungsoption aus

        System.out.println("Please enter your choice: ");

        int PlayersChoiceLevel_1 = Myscanner.nextInt();
        level_1.setPlayerChoiceLevel_1(PlayersChoiceLevel_1);
        level_1.FirstObstacle(PlayersChoiceLevel_1, player);




    }
}


